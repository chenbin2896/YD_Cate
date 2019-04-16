package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbCusorder;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.CusorderService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cusorder")
public class CusorderController {

	@Autowired
	private CusorderService cusorderService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCusorder> findAll(){
		return cusorderService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return cusorderService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cusorder
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCusorder cusorder){
		try {
			cusorderService.add(cusorder);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cusorder
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCusorder cusorder){
		try {
			cusorderService.update(cusorder);
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
	public TbCusorder findOne(String id){
		return cusorderService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			cusorderService.delete(ids);
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
	public PageResult search(@RequestBody TbCusorder cusorder, int page, int rows  ){
		return cusorderService.findPage(cusorder, page, rows);
	}
	
}
