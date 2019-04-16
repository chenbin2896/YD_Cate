package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbCourierinfo;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.CourierinfoService;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/courierinfo")
public class CourierinfoController {

	@Autowired
	private CourierinfoService courierinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCourierinfo> findAll(){
		return courierinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return courierinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param courierinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCourierinfo courierinfo){
		try {
			courierinfoService.add(courierinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param courierinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCourierinfo courierinfo){
		try {
			courierinfoService.update(courierinfo);
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
	public TbCourierinfo findOne(Long id){
		return courierinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			courierinfoService.delete(ids);
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
	public PageResult search(@RequestBody TbCourierinfo courierinfo, int page, int rows  ){
		return courierinfoService.findPage(courierinfo, page, rows);		
	}
	
}
