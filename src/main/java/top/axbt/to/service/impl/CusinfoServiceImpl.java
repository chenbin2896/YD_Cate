package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbCusinfoMapper;
import top.axbt.to.domain.TbCusinfo;
import top.axbt.to.domain.TbCusinfoExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.CusinfoService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CusinfoServiceImpl implements CusinfoService {

	@Autowired
	private TbCusinfoMapper cusinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCusinfo> findAll() {
		return cusinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCusinfo> page=   (Page<TbCusinfo>) cusinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCusinfo cusinfo) {
		cusinfoMapper.insert(cusinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCusinfo cusinfo){
		cusinfoMapper.updateByPrimaryKey(cusinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCusinfo findOne(Long id){
		return cusinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cusinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCusinfo cusinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCusinfoExample example=new TbCusinfoExample();
		TbCusinfoExample.Criteria criteria = example.createCriteria();
		
		if(cusinfo!=null){			
						if(cusinfo.getName()!=null && cusinfo.getName().length()>0){
				criteria.andNameLike("%"+cusinfo.getName()+"%");
			}
			if(cusinfo.getAddress()!=null && cusinfo.getAddress().length()>0){
				criteria.andAddressLike("%"+cusinfo.getAddress()+"%");
			}
	
		}
		
		Page<TbCusinfo> page= (Page<TbCusinfo>)cusinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
