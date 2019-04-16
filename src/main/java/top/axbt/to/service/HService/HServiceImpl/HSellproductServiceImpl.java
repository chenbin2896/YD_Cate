package top.axbt.to.service.HService.HServiceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbSellproductMapper;
import top.axbt.to.domain.TbSellproduct;
import top.axbt.to.domain.TbSellproductExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.HService.HSellproductService;
import top.axbt.to.service.SellproductService;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HSellproductServiceImpl implements HSellproductService {

	@Autowired
	private TbSellproductMapper sellproductMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSellproduct> findAll() {
		return sellproductMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		TbSellproductExample example=new TbSellproductExample();
		example.setOrderByClause("pro_levle ASC");
		example.setDistinct(false);
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSellproduct> page=   (Page<TbSellproduct>) sellproductMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSellproduct sellproduct) {
		sellproductMapper.insert(sellproduct);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSellproduct sellproduct){
		sellproductMapper.updateByPrimaryKey(sellproduct);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSellproduct findOne(Long id){
		return sellproductMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			sellproductMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSellproduct sellproduct, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSellproductExample example=new TbSellproductExample();
		example.setOrderByClause("pro_levle ASC");
		example.setDistinct(false);
		TbSellproductExample.Criteria criteria = example.createCriteria();
		
		if(sellproduct!=null){			
						if(sellproduct.getProName()!=null && sellproduct.getProName().length()>0){
				criteria.andProNameLike("%"+sellproduct.getProName()+"%");
			}
			if(sellproduct.getProPhoto()!=null && sellproduct.getProPhoto().length()>0){
				criteria.andProPhotoLike("%"+sellproduct.getProPhoto()+"%");
			}
			if(sellproduct.getSellId()!=null){
				criteria.andSellIdEqualTo(sellproduct.getSellId());
			}
			if(sellproduct.getProCategoryId()!=null){
				criteria.andProCategoryIdEqualTo(sellproduct.getProCategoryId());
			}
			//if(sellproduct.getProLevle()!=null&&sellproduct.getProLevle()==-1){
				criteria.andProLevleBetween(0,5);
			//}
	
		}
		
		Page<TbSellproduct> page= (Page<TbSellproduct>)sellproductMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
