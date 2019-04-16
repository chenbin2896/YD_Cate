package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbSellloginMapper;
import top.axbt.to.domain.TbSelllogin;
import top.axbt.to.domain.TbSellloginExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.SellloginService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SellloginServiceImpl implements SellloginService {

	@Autowired
	private TbSellloginMapper sellloginMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSelllogin> findAll() {
		return sellloginMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSelllogin> page=   (Page<TbSelllogin>) sellloginMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSelllogin selllogin) {
		sellloginMapper.insert(selllogin);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSelllogin selllogin){
		sellloginMapper.updateByPrimaryKey(selllogin);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSelllogin findOne(Long id){
		return sellloginMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			sellloginMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSelllogin selllogin, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSellloginExample example=new TbSellloginExample();
		TbSellloginExample.Criteria criteria = example.createCriteria();
		
		if(selllogin!=null){			
						if(selllogin.getPossword()!=null && selllogin.getPossword().length()>0){
				criteria.andPosswordLike("%"+selllogin.getPossword()+"%");
			}
	
		}
		
		Page<TbSelllogin> page= (Page<TbSelllogin>)sellloginMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
