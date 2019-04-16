package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbSelllogin;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.SellloginService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/selllogin")
public class SellloginController {

	@Autowired
	private SellloginService sellloginService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSelllogin> findAll(){
		return sellloginService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return sellloginService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param selllogin
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSelllogin selllogin){
		try {
			sellloginService.add(selllogin);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param selllogin
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSelllogin selllogin){
		try {
			sellloginService.update(selllogin);
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
	public TbSelllogin findOne(Long id){
		return sellloginService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			sellloginService.delete(ids);
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
	public PageResult search(@RequestBody TbSelllogin selllogin, int page, int rows  ){
		return sellloginService.findPage(selllogin, page, rows);		
	}
	
}
