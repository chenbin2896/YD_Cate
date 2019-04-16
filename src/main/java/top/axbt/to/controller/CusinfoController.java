package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbCusinfo;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.CusinfoService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cusinfo")
public class CusinfoController {

	@Autowired
	private CusinfoService cusinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCusinfo> findAll(){
		return cusinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return cusinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cusinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCusinfo cusinfo){
		try {
			cusinfoService.add(cusinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cusinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCusinfo cusinfo){
		try {
			cusinfoService.update(cusinfo);
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
	public TbCusinfo findOne(Long id){
		return cusinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cusinfoService.delete(ids);
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
	public PageResult search(@RequestBody TbCusinfo cusinfo, int page, int rows  ){
		return cusinfoService.findPage(cusinfo, page, rows);		
	}
	
}
