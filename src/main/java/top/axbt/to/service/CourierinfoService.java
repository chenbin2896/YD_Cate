package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbCourierinfo;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CourierinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCourierinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCourierinfo courierinfo);
	
	
	/**
	 * 修改
	 */
	public void update(TbCourierinfo courierinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCourierinfo findOne(Long id);
	
	
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
	public PageResult findPage(TbCourierinfo courierinfo, int pageNum, int pageSize);
	
}
