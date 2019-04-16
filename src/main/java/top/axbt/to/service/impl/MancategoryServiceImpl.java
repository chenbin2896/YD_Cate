package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbMancategoryMapper;
import top.axbt.to.domain.TbMancategory;
import top.axbt.to.domain.TbMancategoryExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.MancategoryService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MancategoryServiceImpl implements MancategoryService {

	@Autowired
	private TbMancategoryMapper mancategoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMancategory> findAll() {
		return mancategoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbMancategory> page=   (Page<TbMancategory>) mancategoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMancategory mancategory) {
		mancategoryMapper.insert(mancategory);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMancategory mancategory){
		mancategoryMapper.updateByPrimaryKey(mancategory);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMancategory findOne(Long id){
		return mancategoryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			mancategoryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbMancategory mancategory, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMancategoryExample example=new TbMancategoryExample();
		TbMancategoryExample.Criteria criteria = example.createCriteria();
		
		if(mancategory!=null){			
						if(mancategory.getName()!=null && mancategory.getName().length()>0){
				criteria.andNameLike("%"+mancategory.getName()+"%");
			}
	
		}
		
		Page<TbMancategory> page= (Page<TbMancategory>)mancategoryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
