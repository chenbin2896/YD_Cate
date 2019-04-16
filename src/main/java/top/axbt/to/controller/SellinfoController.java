package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.SellinfoService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sellinfo")
public class SellinfoController {

	@Autowired
	private SellinfoService sellinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSellinfo> findAll(){
		return sellinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return sellinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sellinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSellinfo sellinfo){
		try {
			sellinfoService.add(sellinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sellinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSellinfo sellinfo){
		try {
			sellinfoService.update(sellinfo);
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
	public TbSellinfo findOne(Long id){
		return sellinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			sellinfoService.delete(ids);
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
	public PageResult search(@RequestBody TbSellinfo sellinfo, int page, int rows  ){
		return sellinfoService.findPage(sellinfo, page, rows);		
	}
	
}
