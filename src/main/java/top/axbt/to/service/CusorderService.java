package top.axbt.to.service;
import java.util.List;

import top.axbt.to.domain.TbCusorder;
import top.axbt.to.entity.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CusorderService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCusorder> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCusorder cusorder);
	
	
	/**
	 * 修改
	 */
	public void update(TbCusorder cusorder);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCusorder findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCusorder cusorder, int pageNum, int pageSize,int state);

	public PageResult findPage(TbCusorder cusorder, int pageNum, int pageSize);
}
