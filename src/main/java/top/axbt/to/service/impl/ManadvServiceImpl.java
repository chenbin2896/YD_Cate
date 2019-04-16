package top.axbt.to.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbManadvMapper;
import top.axbt.to.domain.TbManadv;
import top.axbt.to.domain.TbManadvExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.ManadvService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ManadvServiceImpl implements ManadvService {

	@Autowired
	private TbManadvMapper manadvMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbManadv> findAll() {
		return manadvMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbManadv> page=   (Page<TbManadv>) manadvMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbManadv manadv) {
		manadvMapper.insert(manadv);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbManadv manadv){
		manadvMapper.updateByPrimaryKey(manadv);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbManadv findOne(Long id){
		return manadvMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			manadvMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbManadv manadv, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbManadvExample example=new TbManadvExample();
		TbManadvExample.Criteria criteria = example.createCriteria();
		
		if(manadv!=null){			
						if(manadv.getAdvPhoto()!=null && manadv.getAdvPhoto().length()>0){
				criteria.andAdvPhotoLike("%"+manadv.getAdvPhoto()+"%");
			}
			if(manadv.getAdvCategory()!=null && manadv.getAdvCategory().length()>0){
				criteria.andAdvCategoryLike("%"+manadv.getAdvCategory()+"%");
			}
	
		}
		
		Page<TbManadv> page= (Page<TbManadv>)manadvMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
