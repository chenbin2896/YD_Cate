package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbManadv;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ManadvService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbManadv> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbManadv manadv);
	
	
	/**
	 * 修改
	 */
	public void update(TbManadv manadv);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbManadv findOne(Long id);
	
	
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
	public PageResult findPage(TbManadv manadv, int pageNum, int pageSize);
	
}
