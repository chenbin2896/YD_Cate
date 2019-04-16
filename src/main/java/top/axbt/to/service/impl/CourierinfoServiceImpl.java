package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbCourierinfoMapper;
import top.axbt.to.domain.TbCourierinfo;
import top.axbt.to.domain.TbCourierinfoExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.CourierinfoService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CourierinfoServiceImpl implements CourierinfoService {

	@Autowired
	private TbCourierinfoMapper courierinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCourierinfo> findAll() {
		return courierinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCourierinfo> page=   (Page<TbCourierinfo>) courierinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCourierinfo courierinfo) {
		courierinfoMapper.insert(courierinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCourierinfo courierinfo){
		courierinfoMapper.updateByPrimaryKey(courierinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCourierinfo findOne(Long id){
		return courierinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			courierinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCourierinfo courierinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCourierinfoExample example=new TbCourierinfoExample();
		TbCourierinfoExample.Criteria criteria = example.createCriteria();
		
		if(courierinfo!=null){			
						if(courierinfo.getName()!=null && courierinfo.getName().length()>0){
				criteria.andNameLike("%"+courierinfo.getName()+"%");
			}
	
		}
		
		Page<TbCourierinfo> page= (Page<TbCourierinfo>)courierinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
