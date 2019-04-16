package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbSelldepositMapper;
import top.axbt.to.domain.TbSelldeposit;
import top.axbt.to.domain.TbSelldepositExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.SelldepositService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SelldepositServiceImpl implements SelldepositService {

	@Autowired
	private TbSelldepositMapper selldepositMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSelldeposit> findAll() {
		return selldepositMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSelldeposit> page=   (Page<TbSelldeposit>) selldepositMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSelldeposit selldeposit) {
		selldepositMapper.insert(selldeposit);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSelldeposit selldeposit){
		selldepositMapper.updateByPrimaryKey(selldeposit);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSelldeposit findOne(Long id){
		return selldepositMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			selldepositMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSelldeposit selldeposit, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSelldepositExample example=new TbSelldepositExample();
		TbSelldepositExample.Criteria criteria = example.createCriteria();
		
		if(selldeposit!=null){			
				
		}
		
		Page<TbSelldeposit> page= (Page<TbSelldeposit>)selldepositMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
