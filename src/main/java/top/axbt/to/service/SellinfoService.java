package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SellinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSellinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbSellinfo sellinfo);
	
	
	/**
	 * 修改
	 */
	public void update(TbSellinfo sellinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbSellinfo findOne(Long id);
	
	
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
	public PageResult findPage(TbSellinfo sellinfo, int pageNum, int pageSize);
	
}
