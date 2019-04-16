package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbManadv;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.ManadvService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/manadv")
public class ManadvController {

	@Autowired
	private ManadvService manadvService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbManadv> findAll(){
		return manadvService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return manadvService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param manadv
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbManadv manadv){
		try {
			manadvService.add(manadv);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param manadv
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbManadv manadv){
		try {
			manadvService.update(manadv);
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
	public TbManadv findOne(Long id){
		return manadvService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			manadvService.delete(ids);
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
	public PageResult search(@RequestBody TbManadv manadv, int page, int rows  ){
		return manadvService.findPage(manadv, page, rows);		
	}
	
}
