package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbSellproduct;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.SellproductService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sellproduct")
public class SellproductController {

	@Autowired
	private SellproductService sellproductService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSellproduct> findAll(){
		return sellproductService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return sellproductService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sellproduct
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSellproduct sellproduct){

		try {
			sellproductService.add(sellproduct);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sellproduct
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSellproduct sellproduct){
		try {
			sellproductService.update(sellproduct);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbSellproduct findOne(Long id){
		return sellproductService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			sellproductService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbSellproduct sellproduct, int page, int rows  ){
		return sellproductService.findPage(sellproduct, page, rows);		
	}



}
