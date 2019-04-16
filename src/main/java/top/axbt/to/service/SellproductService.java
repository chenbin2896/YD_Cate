package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbSellproduct;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SellproductService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSellproduct> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbSellproduct sellproduct);
	
	
	/**
	 * 修改
	 */
	public void update(TbSellproduct sellproduct);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbSellproduct findOne(Long id);
	
	
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
	public PageResult findPage(TbSellproduct sellproduct, int pageNum, int pageSize);

	public PageResult findPage(TbSellproduct sellproduct, int pageNum, int pageSize,int pro_level);
	
}
