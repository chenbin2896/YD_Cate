package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbCourierdeposit;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CourierdepositService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCourierdeposit> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCourierdeposit courierdeposit);
	
	
	/**
	 * 修改
	 */
	public void update(TbCourierdeposit courierdeposit);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCourierdeposit findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCourierdeposit courierdeposit, int pageNum, int pageSize);
	
}
