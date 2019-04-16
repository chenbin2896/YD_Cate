package top.axbt.to.controller.ZController.ZCusController;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import top.axbt.to.domain.*;
import top.axbt.to.entity.EvalAndProductAndSell;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.ProductAndSell;
import top.axbt.to.service.*;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.*;

/**
 * Create by 张晨彬
 * 2018/12/1/001 18:17
 */


@Controller
@RequestMapping("customer_page")
public class ZCusViewController {

    @Autowired
    private SellproductService sellproductService;

    @Autowired
    private MancategoryService mancategoryService;

    @Autowired
    private SellinfoService sellinfoService;

    @Autowired
    private CusevalService cusevalService;

    @Autowired
    private CusinfoService cusinfoService;

    @Autowired
    private CusorderService cusorderService;

    /**
     * 商品分类
     * @param pro_category_id
     * @return
     */
    @RequestMapping("findProductByCategory")
    public ModelAndView findProductByCategory(@RequestParam("pro_category_id") long pro_category_id){
        //该id对应的分类名
        TbMancategory tbMancategory = mancategoryService.findOne(pro_category_id);
        //商品
        TbSellproduct tbSellproduct = new TbSellproduct();
        tbSellproduct.setProCategoryId(pro_category_id);
        //去除商品评价为-1的商品
        PageResult pageResult = sellproductService.findPage(tbSellproduct, 1, 100);
        List<TbSellproduct> tbSellproducts = (List<TbSellproduct>) pageResult.getRows();
        List<ProductAndSell> tbSellproducts1 = new ArrayList<>();
        for(TbSellproduct tbSellproduct1:tbSellproducts){
            if(tbSellproduct1.getProLevle()!=-1){
                Long sellId = tbSellproduct1.getSellId();
                TbSellinfo tbSellinfo = sellinfoService.findOne(sellId);
                ProductAndSell productAndSell = new ProductAndSell(tbSellproduct1,tbSellinfo);
                tbSellproducts1.add(productAndSell);
            }
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sellProduct_list",tbSellproducts1);
        modelAndView.addObject("tbMancategory",tbMancategory);
        modelAndView.setViewName("customer/product_category.html");
        return modelAndView;
    }

    /**
     * 登录
     */
    @RequestMapping("login")
    public ModelAndView login(HttpSession httpSession){
        Random random = new Random();
        int id = random.nextInt(18);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/customer_page/index");
        httpSession.setAttribute("cus_id",id);
        return modelAndView;
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping("index")
    public ModelAndView index(HttpSession session){
        Object cus_id = session.getAttribute("cus_id");
        ModelAndView modelAndView = new ModelAndView();
        if (cus_id==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }

        //查找所有分类
        List<TbMancategory> mancategoryList = mancategoryService.findAll();

        //查找1-10店铺
        PageResult pageResult = sellinfoService.findPage(1, 10);

        List<TbSellinfo> sellinfoList = (List<TbSellinfo>) pageResult.getRows();


        modelAndView.addObject("mancategoryList",mancategoryList);
        modelAndView.addObject("sellinfoList",sellinfoList);
        modelAndView.setViewName("/customer/shouye.html");
        return modelAndView;
    }

    /**
     * 查询店铺商品信息
     * @param sell_id
     * @return
     */
    @RequestMapping("findShopInfoBySellId")
    public ModelAndView findShopInfoBySellId(@RequestParam("sell_id") long sell_id){

        //查询店铺信息

        TbSellinfo sellinfo = sellinfoService.findOne(sell_id);
        //查询店铺商品
        TbSellproduct sellproduct = new TbSellproduct();
        sellproduct.setSellId(sell_id);
        PageResult pageResult = sellproductService.findPage(sellproduct, 1, 100,1);

        List<TbSellproduct> sellProductList = (List<TbSellproduct>) pageResult.getRows();

        //查找店铺评价
        TbCuseval tbCuseval = new TbCuseval();
        tbCuseval.setShopId(sell_id);
        PageResult pageResult1 = cusevalService.findPage(tbCuseval, 1, 20);
        List<TbCuseval> cusevals = (List<TbCuseval>) pageResult1.getRows();

        PageResult pageResult_evalFull = cusevalService.findPage(tbCuseval, 1, 1000);
        List<TbCuseval> cuseval_full = (List<TbCuseval>) pageResult_evalFull.getRows();
        long evalCounts = pageResult_evalFull.getTotal();
        //求平均分
        int sum = 0;
        for(TbCuseval tbCuseval1:cuseval_full){
            sum+=tbCuseval1.getProductLevel();
        }
        double aveLevel = sum/evalCounts;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sellinfo",sellinfo);
        modelAndView.addObject("sellProductList",sellProductList);
        modelAndView.addObject("cusevals",cusevals);
        modelAndView.addObject("evalCounts",evalCounts);
        modelAndView.addObject("aveLevel",aveLevel);
        modelAndView.setViewName("customer/shop_info.html");
        return modelAndView;
    }

    /**
     * 搜索功能
     * @param comment
     * @return
     */
    @RequestMapping("search")
    public ModelAndView search(@RequestParam("comment") String comment){
        //查店铺
        TbSellinfo tbSellinfo = new TbSellinfo();
        tbSellinfo.setName(comment);
        PageResult pageResult_sellInfo = sellinfoService.findPage(tbSellinfo, 1, 10);
        List<TbSellinfo> sellInfoRows = (List<TbSellinfo>) pageResult_sellInfo.getRows();
        //查商品
        TbSellproduct tbSellproduct = new TbSellproduct();
        tbSellproduct.setProName(comment);
        PageResult pageResult_sellProduct = sellproductService.findPage(tbSellproduct, 1, 10);
        List<TbSellproduct> sellProductRows = (List<TbSellproduct>) pageResult_sellProduct.getRows();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sellInfoRows",sellInfoRows);
        modelAndView.addObject("sellProductRows",sellProductRows);

        modelAndView.setViewName("customer/search_result.html");
        return modelAndView;

    }

    /**
     * 查询地址
     */
    @RequestMapping("mine_address")
    public ModelAndView mine_address(@RequestParam("id") long cid ,HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();

        Object id = httpSession.getAttribute("cus_id");

        if(id==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.valueOf(id.toString());
        //System.out.println(cus_id);
        TbCusinfo tbCusinfo = cusinfoService.findOne(cus_id);
        if(tbCusinfo==null){
            tbCusinfo.setPhone(0L);
            tbCusinfo.setAddress("未填写");
            tbCusinfo.setName("未填写");
        }
        modelAndView.addObject("tbCusinfo",tbCusinfo);
        modelAndView.setViewName("customer/mine_address.html");
        return modelAndView;
    }

    /**
     * 保存地址
     */
    @RequestMapping("saveAddress")
    public ModelAndView saveAddress(@RequestParam("id") int cid,
                                    @RequestParam("name") String name,
                                    @RequestParam("phone") String phone,
                                    @RequestParam("address") String address,
                                    HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();

        Object id = httpSession.getAttribute("cus_id");
        if(id==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.valueOf(id.toString());
        TbCusinfo tbCusinfo = cusinfoService.findOne(cus_id);
        modelAndView.setViewName("redirect:/customer_page/mine_address?id="+cus_id);
        if(tbCusinfo==null){
            tbCusinfo.setName(name);
            tbCusinfo.setAddress(address);
            tbCusinfo.setPhone(Long.parseLong(phone));
            try{
                cusinfoService.add(tbCusinfo);
                modelAndView.addObject("message","保存成功");
                return modelAndView;
            }catch (Exception e){
                modelAndView.addObject("message","保存失败，程序异常");
                return modelAndView;
            }
        }else{
            tbCusinfo.setName(name);
            tbCusinfo.setAddress(address);
            tbCusinfo.setPhone(Long.parseLong(phone));
            try{
                cusinfoService.update(tbCusinfo);
                modelAndView.addObject("message","保存成功");
                return modelAndView;
            }catch (Exception e){
                modelAndView.addObject("message","保存失败，程序异常");
                return modelAndView;
            }
        }

    }

    /**
     * 我的评价
     */
    @RequestMapping("mine_eval")
    public ModelAndView mine_eval(@RequestParam("id") int cid,HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/mine_evaluate.html");
        Object id = httpSession.getAttribute("cus_id");
        if(id==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.valueOf(id.toString());
        TbCuseval tbCuseval = new TbCuseval();
        tbCuseval.setCusId(cus_id);
        PageResult pageResult = cusevalService.findPage(tbCuseval,1,100);
        List<TbCuseval> tbCusevals = (List<TbCuseval>) pageResult.getRows();
        List<TbSellproduct> tbSellproducts = new ArrayList<>();
        List<EvalAndProductAndSell> evalAndProductAndSells = new ArrayList<>();
        for(TbCuseval tbCuseval1:tbCusevals){

            Long sellProductId = tbCuseval1.getSellProductId();
            TbSellproduct tbSellproduct = sellproductService.findOne(sellProductId);
            Long shopId = tbCuseval1.getShopId();
            TbSellinfo tbSellinfo = sellinfoService.findOne(shopId);
            EvalAndProductAndSell evalAndProductAndSell = new EvalAndProductAndSell(tbCuseval1,tbSellinfo,tbSellproduct);
            evalAndProductAndSells.add(evalAndProductAndSell);
        }
        modelAndView.addObject("tbCusevals",evalAndProductAndSells);
        //modelAndView.addObject("tbSellproducts",tbSellproducts);
        //modelAndView.addObject("map",map);
        return modelAndView;

    }

    /**
     * 我的订单order_state为1：已确认；0：待确认；2正在配送；3已完成；4未评价
     */
    @RequestMapping("mine_order")
    public ModelAndView mine_order(@RequestParam("state") int state,
                                   @RequestParam("cus_id") int ccus_id,
                                   HttpSession httpSession){
        //state为0表示在订单默认页，查出1,0,2的订单
        ModelAndView modelAndView = new ModelAndView();

        Object cusId = httpSession.getAttribute("cus_id");
        if(cusId==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.parseInt(cusId.toString());
        TbCusorder tbCusorder = new TbCusorder();
        tbCusorder.setCusInfoId(cus_id);
        PageResult pageResult = cusorderService.findPage(tbCusorder, 1, 1000, state);
        List<TbCusorder> tbCusorderList = (List<TbCusorder>) pageResult.getRows();

        modelAndView.setViewName("customer/dingdan.html");
        modelAndView.addObject("tbCusorderList",tbCusorderList);
        return modelAndView;

    }

    /**
     * 订购
     */
    @RequestMapping("submitOrder")
    public ModelAndView submitOrder(@RequestParam("sell_id") long sell_id,
                                    @RequestParam("sell_product_id") long sell_product_id,
                                    @RequestParam("cus_id") long ccus_id,
                                    @RequestParam("courier_id") long courier_id,
                                    @RequestParam("product_name") String product_name,
                                    @RequestParam("product_price") double product_price,
                                    HttpSession httpSession){

        ModelAndView modelAndView = new ModelAndView();

        Object cusId = httpSession.getAttribute("cus_id");
        if(cusId==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.parseInt(cusId.toString());
        TbCusorder tbCusorder = new TbCusorder();
        tbCusorder.setId(String.valueOf(System.currentTimeMillis()));
        tbCusorder.setOrderShopId(sell_id);
        tbCusorder.setSellProductId(sell_product_id);
        tbCusorder.setCusInfoId(cus_id);
        tbCusorder.setCourierId(courier_id);
        tbCusorder.setOrderName(product_name);
        tbCusorder.setOrderAmount(BigDecimal.valueOf(product_price));
        tbCusorder.setPayState(0);
        tbCusorder.setOrderState(0);
        tbCusorder.setCreateTime(new Date());
        tbCusorder.setUpdateTime(new Date());
        cusorderService.add(tbCusorder);
        TbSellinfo tbSellinfo = sellinfoService.findOne(sell_id);

        TbCusinfo tbCusinfo = cusinfoService.findOne(cus_id);

        modelAndView.setViewName("customer/order.html");

        modelAndView.addObject("tbCusinfo",tbCusinfo);
        modelAndView.addObject("tbCusorder",tbCusorder);
        modelAndView.addObject("tbSellinfo",tbSellinfo);

        return modelAndView;
    }

    /**
     * pay_order
     */
    @RequestMapping("pay_order")
    public ModelAndView pay_order(@RequestParam("orderId") String order_id,
                                  HttpSession httpSession){

        ModelAndView modelAndView = new ModelAndView();
        TbCusorder tbCusorder = cusorderService.findOne(order_id);
        modelAndView.setViewName("/customer/finishOrder.html");
        tbCusorder.setPayState(1);
        tbCusorder.setUpdateTime(new Date());
        tbCusorder.setCourierId(new Long((long)5));

        cusorderService.update(tbCusorder);
        modelAndView.addObject("tbCusorder1",tbCusorder);
        return modelAndView;

    }

    @RequestMapping("pay_state")
    public ModelAndView pay_state(@RequestParam("orderId") String order_id,
                                  HttpSession httpSession){


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/customer/pay_state.html");
        modelAndView.addObject("order_id",order_id);
        return modelAndView;

    }


    @RequestMapping("evalProductHtml")
    public ModelAndView evalProductHtml(@RequestParam("product_name") String product_name,
                                        @RequestParam("sell_id") String sell_id,
                                        @RequestParam("product_price") String product_price){

        ModelAndView modelAndView = new ModelAndView();
        long sellId = Long.parseLong(sell_id);
        TbSellinfo tbSellinfo = sellinfoService.findOne(sellId);
        modelAndView.setViewName("customer/evalProduct.html");
        modelAndView.addObject("product_name",product_name);
        modelAndView.addObject("shop_name",tbSellinfo.getName());
        modelAndView.addObject("product_price",product_price);
        return modelAndView;
    }


    /**
     * 添加评价
     */
    @RequestMapping("evalProduct")
    public ModelAndView evalProduct(HttpSession httpSession,@RequestParam("product_id") int productId,@RequestParam("sell_id") int sellId){
        ModelAndView modelAndView = new ModelAndView();
        Object cusId = httpSession.getAttribute("cus_id");
        if(cusId==null){
            modelAndView.setViewName("customer/login.html");
            return modelAndView;
        }
        long cus_id = Integer.parseInt(cusId.toString());
        TbCuseval tbCuseval = new TbCuseval();
        tbCuseval.setCusId(cus_id);
        tbCuseval.setShopId(new Long((long)sellId));
        tbCuseval.setSellProductId(new Long((long)productId));


        return  modelAndView;
    }
}

