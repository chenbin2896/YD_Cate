package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbCuseval;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.CusevalService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cuseval")
public class CusevalController {

	@Autowired
	private CusevalService cusevalService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCuseval> findAll(){
		return cusevalService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return cusevalService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cuseval
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCuseval cuseval){
		try {
			cusevalService.add(cuseval);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cuseval
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCuseval cuseval){
		try {
			cusevalService.update(cuseval);
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
	public TbCuseval findOne(Long id){
		return cusevalService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cusevalService.delete(ids);
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
	public PageResult search(@RequestBody TbCuseval cuseval, int page, int rows  ){
		return cusevalService.findPage(cuseval, page, rows);		
	}
	
}
