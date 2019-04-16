package top.axbt.to.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.axbt.to.domain.TbSelldeposit;
import top.axbt.to.entity.PageResult;
import top.axbt.to.entity.Result;
import top.axbt.to.service.SelldepositService;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/selldeposit")
public class SelldepositController {

	@Autowired
	private SelldepositService selldepositService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSelldeposit> findAll(){
		return selldepositService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return selldepositService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param selldeposit
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSelldeposit selldeposit){
		try {
			selldepositService.add(selldeposit);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param selldeposit
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSelldeposit selldeposit){
		try {
			selldepositService.update(selldeposit);
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
	public TbSelldeposit findOne(Long id){
		return selldepositService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			selldepositService.delete(ids);
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
	public PageResult search(@RequestBody TbSelldeposit selldeposit, int page, int rows  ){
		return selldepositService.findPage(selldeposit, page, rows);		
	}
	
}
