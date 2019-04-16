package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbCourierdepositMapper;
import top.axbt.to.domain.TbCourierdeposit;
import top.axbt.to.domain.TbCourierdepositExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.CourierdepositService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CourierdepositServiceImpl implements CourierdepositService {

	@Autowired
	private TbCourierdepositMapper courierdepositMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCourierdeposit> findAll() {
		return courierdepositMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCourierdeposit> page=   (Page<TbCourierdeposit>) courierdepositMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCourierdeposit courierdeposit) {
		courierdepositMapper.insert(courierdeposit);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCourierdeposit courierdeposit){
		courierdepositMapper.updateByPrimaryKey(courierdeposit);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCourierdeposit findOne(Long id){
		return courierdepositMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			courierdepositMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCourierdeposit courierdeposit, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCourierdepositExample example=new TbCourierdepositExample();
		TbCourierdepositExample.Criteria criteria = example.createCriteria();
		
		if(courierdeposit!=null){			
				
		}
		
		Page<TbCourierdeposit> page= (Page<TbCourierdeposit>)courierdepositMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
