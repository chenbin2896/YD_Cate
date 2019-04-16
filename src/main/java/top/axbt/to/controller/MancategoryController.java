package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbMancategory;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.MancategoryService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/mancategory")
public class MancategoryController {

	@Autowired
	private MancategoryService mancategoryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbMancategory> findAll(){
		return mancategoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return mancategoryService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param mancategory
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbMancategory mancategory){
		try {
			mancategoryService.add(mancategory);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param mancategory
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbMancategory mancategory){
		try {
			mancategoryService.update(mancategory);
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
	public TbMancategory findOne(Long id){
		return mancategoryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			mancategoryService.delete(ids);
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
	public PageResult search(@RequestBody TbMancategory mancategory, int page, int rows  ){
		return mancategoryService.findPage(mancategory, page, rows);		
	}
	
}
