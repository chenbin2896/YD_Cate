package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbSellinfoMapper;
import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.domain.TbSellinfoExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.SellinfoService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SellinfoServiceImpl implements SellinfoService {

	@Autowired
	private TbSellinfoMapper sellinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSellinfo> findAll() {
		return sellinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSellinfo> page=   (Page<TbSellinfo>) sellinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSellinfo sellinfo) {
		sellinfoMapper.insert(sellinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSellinfo sellinfo){
		sellinfoMapper.updateByPrimaryKey(sellinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSellinfo findOne(Long id){
		return sellinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			sellinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSellinfo sellinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSellinfoExample example=new TbSellinfoExample();
		TbSellinfoExample.Criteria criteria = example.createCriteria();
		
		if(sellinfo!=null){			
						if(sellinfo.getName()!=null && sellinfo.getName().length()>0){
				criteria.andNameLike("%"+sellinfo.getName()+"%");
			}
			if(sellinfo.getShopPhoto()!=null && sellinfo.getShopPhoto().length()>0){
				criteria.andShopPhotoLike("%"+sellinfo.getShopPhoto()+"%");
			}
			if(sellinfo.getBusinessLicense()!=null && sellinfo.getBusinessLicense().length()>0){
				criteria.andBusinessLicenseLike("%"+sellinfo.getBusinessLicense()+"%");
			}
			if(sellinfo.getIdcardPhoto()!=null && sellinfo.getIdcardPhoto().length()>0){
				criteria.andIdcardPhotoLike("%"+sellinfo.getIdcardPhoto()+"%");
			}
	
		}
		
		Page<TbSellinfo> page= (Page<TbSellinfo>)sellinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
