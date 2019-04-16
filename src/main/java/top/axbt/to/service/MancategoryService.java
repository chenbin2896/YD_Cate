package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbMancategory;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MancategoryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbMancategory> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbMancategory mancategory);
	
	
	/**
	 * 修改
	 */
	public void update(TbMancategory mancategory);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbMancategory findOne(Long id);
	
	
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
	public PageResult findPage(TbMancategory mancategory, int pageNum, int pageSize);
	
}
