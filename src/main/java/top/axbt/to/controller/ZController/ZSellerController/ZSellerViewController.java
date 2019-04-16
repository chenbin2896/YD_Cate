package top.axbt.to.controller.ZController.ZSellerController;

import com.alibaba.druid.mock.MockArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import top.axbt.to.domain.*;
import top.axbt.to.entity.OrderCusInfoCourierInfo;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Create by 张晨彬
 * 2018/12/3/003 10:23
 */


@Controller
@RequestMapping("seller_page")
public class ZSellerViewController {


    @Autowired
    private SellinfoService sellinfoService;

    @Autowired
    private SellproductService sellproductService;

    @Autowired
    private SelldepositService selldepositService;

    @Autowired
    private CusorderService cusorderService;

    @Autowired
    private CourierinfoService courierinfoService;

    @Autowired
    private CusinfoService cusinfoService;

    @Autowired
    private MancategoryService mancategoryService;


    /**
     * 登录
     */
    @RequestMapping("login")
    public ModelAndView login(HttpSession httpSession){
        Random random = new Random();
        int id = random.nextInt(28);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("seller/shouye.html");
        httpSession.setAttribute("sell_id",id);
        return modelAndView;
    }


    /**
     * 查找该商家的商品
     * @return
     */
    @RequestMapping("findProduct")
    public ModelAndView findProduct(/*@RequestParam("sell_id") int sell_id*/HttpSession session){
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long cus_id = Integer.valueOf(id.toString());
        TbSellproduct tbSellproduct = new TbSellproduct();
        tbSellproduct.setSellId(cus_id);
        PageResult pageResult = sellproductService.findPage(tbSellproduct, 1, 1000);
        List<TbSellproduct> tbSellproductList = (List<TbSellproduct>) pageResult.getRows();
        modelAndView.setViewName("seller/shangpinguanli.html");
        modelAndView.addObject("tbSellproductList",tbSellproductList);
        return modelAndView;
    }

    /**
     * 查找全部订单
     * @return
     */
    @RequestMapping("findOrder")
    public ModelAndView findOrder(/*@RequestParam("sell_id") int sell_id*/HttpSession session){
        //订单信息
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());
        TbCusorder tbCusorder = new TbCusorder();
        tbCusorder.setOrderShopId(sell_id);
        PageResult pageResult = cusorderService.findPage(tbCusorder, 1, 10000);
        List<TbCusorder> tbCusorderList = (List<TbCusorder>) pageResult.getRows();
        List<OrderCusInfoCourierInfo> orderCusInfoCourierInfoList = new ArrayList<>();
        for(TbCusorder tbCusorder1:tbCusorderList){
            Long courierId = tbCusorder1.getCourierId();
            TbCourierinfo tbCourierinfo = courierinfoService.findOne(courierId);

            Long cusInfoId = tbCusorder1.getCusInfoId();
            TbCusinfo tbCusinfo = cusinfoService.findOne(cusInfoId);
            OrderCusInfoCourierInfo orderCusInfoCourierInfo = new OrderCusInfoCourierInfo(tbCusorder1,tbCusinfo,tbCourierinfo);
            orderCusInfoCourierInfoList.add(orderCusInfoCourierInfo);

        }

        modelAndView.addObject("orderCusInfoCourierInfoList",orderCusInfoCourierInfoList);
        modelAndView.setViewName("seller/dingdanguanli.html");
        return modelAndView;
    }

    /**
     * 查找分类订单
     * @return
     */
    @RequestMapping("findOrderByState")
    public ModelAndView findOrderByState(/*@RequestParam("sell_id") int sell_id,*/
                                         @RequestParam("order_state") int order_state,
                                         HttpSession session){
        //订单信息
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());
        TbCusorder tbCusorder = new TbCusorder();
        tbCusorder.setOrderShopId(sell_id);
        tbCusorder.setOrderState(order_state);
        PageResult pageResult = cusorderService.findPage(tbCusorder, 1, 10000);
        List<TbCusorder> tbCusorderList = (List<TbCusorder>) pageResult.getRows();
        List<OrderCusInfoCourierInfo> orderCusInfoCourierInfoList = new ArrayList<>();
        for(TbCusorder tbCusorder1:tbCusorderList){
            Long courierId = tbCusorder1.getCourierId();
            TbCourierinfo tbCourierinfo = courierinfoService.findOne(courierId);

            Long cusInfoId = tbCusorder1.getCusInfoId();
            TbCusinfo tbCusinfo = cusinfoService.findOne(cusInfoId);
            OrderCusInfoCourierInfo orderCusInfoCourierInfo = new OrderCusInfoCourierInfo(tbCusorder1,tbCusinfo,tbCourierinfo);
            orderCusInfoCourierInfoList.add(orderCusInfoCourierInfo);

        }

        modelAndView.addObject("orderCusInfoCourierInfoList",orderCusInfoCourierInfoList);
        modelAndView.setViewName("seller/dingdanguanli.html");
        return modelAndView;
    }

    /**
     * 商品下架
     */
    @RequestMapping("updateProductState")
    public ModelAndView updateProductState(@RequestParam("product_name") String product_name,
                                           HttpSession session
                                           /*@RequestParam("sell_id") int sell_id*/){

        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());
        TbSellproduct tbSellproduct = new TbSellproduct();
        tbSellproduct.setSellId(new Long((long)sell_id));
        tbSellproduct.setProName(product_name);

        PageResult pageResult = sellproductService.findPage(tbSellproduct, 1, 100);
        List<TbSellproduct> tbSellproductList = (List<TbSellproduct>) pageResult.getRows();
        modelAndView.setViewName("redirect:/seller_page/findProduct?sell_id="+sell_id);
        if(tbSellproductList.size()==1){
            TbSellproduct tbSellproduct1 = tbSellproductList.get(0);
            tbSellproduct1.setProLevle(-1);
            sellproductService.update(tbSellproduct1);
            return modelAndView;
        }
        return modelAndView;


    }

    /**
     * 添加商品
     */
    @RequestMapping("addProduct")
    public ModelAndView addProduct(@RequestParam("proName") String proName,
                                   @RequestParam("proType") String proType,
                                   @RequestParam("proPhoto") String proPhoto,
                                   @RequestParam("proPrice") String proPrice,
                                   @RequestParam("proLevel") String proLevel,
                                   HttpSession session){

        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());

        TbSellproduct tbSellproduct = new TbSellproduct();
        tbSellproduct.setSellId(sell_id);
        tbSellproduct.setProName(proName);
        tbSellproduct.setProLevle(1);
        tbSellproduct.setProCategoryId(Long.parseLong(proType));
        tbSellproduct.setProPhoto(proPhoto);
        tbSellproduct.setProPrice(BigDecimal.valueOf(Double.parseDouble(proPrice)));

        sellproductService.add(tbSellproduct);
        modelAndView.setViewName("redirect:/seller_page/findProduct?sell_id="+sell_id);
        return modelAndView;

    }

    /**
     * 添加商品返回添加页面
     */
    @RequestMapping("returnAddView")
    public ModelAndView returnAddView(
                                         HttpSession session
            /*@RequestParam("sell_id") int sell_id*/){
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());

        List<TbMancategory> all = mancategoryService.findAll();
        modelAndView.addObject("categoryList",all);
        modelAndView.setViewName("seller/addProduct.html");

        return modelAndView;
    }

    /**
     * 编辑商品返回编辑页面
     */
    @RequestMapping("returnUpdateView")
    public ModelAndView returnUpdateView(@RequestParam("id") long pid,
                                         HttpSession session
            /*@RequestParam("sell_id") int sell_id*/){
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());

        List<TbMancategory> all = mancategoryService.findAll();
        modelAndView.addObject("categoryList",all);
        TbSellproduct one = sellproductService.findOne(pid);
        Long proCategoryId = one.getProCategoryId();
        TbMancategory categoryName = mancategoryService.findOne(proCategoryId);
        String name = categoryName.getName();
        modelAndView.addObject("sellProduct",one);
        modelAndView.addObject("categoryName",name);
        modelAndView.setViewName("seller/updateProduct.html");

        return modelAndView;
    }


    /**
     * 修改商品
     */
    @RequestMapping("updateProduct")
    public ModelAndView updateProduct(@RequestParam("proName") String proName,
                                   @RequestParam("proType") String proType,
                                   @RequestParam("proPhoto") String proPhoto,
                                   @RequestParam("proPrice") String proPrice,
                                   @RequestParam("id") long pid,
                                   HttpSession session){

        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());

        TbSellproduct tbSellproduct = sellproductService.findOne(pid);
        tbSellproduct.setProName(proName);
        tbSellproduct.setProLevle(1);
        tbSellproduct.setProCategoryId(Long.parseLong(proType));
        tbSellproduct.setProPhoto(proPhoto);
        tbSellproduct.setProPrice(BigDecimal.valueOf(Double.parseDouble(proPrice)));

        sellproductService.update(tbSellproduct);
        modelAndView.setViewName("redirect:/seller_page/findProduct?sell_id="+sell_id);
        return modelAndView;

    }


    /**
     * 修改订单状态
     */
    @RequestMapping("updateOrderState")
    public ModelAndView updateOrderState(@RequestParam("orderId") String orderId,
                                         @RequestParam("state") int state){

        TbCusorder tbCusorder = cusorderService.findOne(orderId);
        tbCusorder.setOrderState(state);
        cusorderService.update(tbCusorder);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/seller_page/findOrderByState?sell_id=1&order_state=2");
        return modelAndView;
    }


    /**
     * 查看商家信息
     */
    @RequestMapping("findInfoById")
    public ModelAndView findInfoById(HttpSession session){
        Object id = session.getAttribute("sell_id");
        ModelAndView modelAndView = new ModelAndView();
        if (id==null){
            modelAndView.setViewName("seller/login.html");
            return modelAndView;
        }
        long sell_id = Integer.valueOf(id.toString());
        TbSellinfo tbSellinfo = sellinfoService.findOne(sell_id);
        modelAndView.setViewName("seller/sellerinfo.html");
        modelAndView.addObject("tbSellinfo",tbSellinfo);
        return modelAndView;
    }

}
