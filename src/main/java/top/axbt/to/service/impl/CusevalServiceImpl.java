package top.axbt.to.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbCusevalMapper;
import top.axbt.to.domain.TbCuseval;
import top.axbt.to.domain.TbCusevalExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.CusevalService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CusevalServiceImpl implements CusevalService {

	@Autowired
	private TbCusevalMapper cusevalMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCuseval> findAll() {
		return cusevalMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCuseval> page=   (Page<TbCuseval>) cusevalMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCuseval cuseval) {
		cusevalMapper.insert(cuseval);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCuseval cuseval){
		cusevalMapper.updateByPrimaryKey(cuseval);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCuseval findOne(Long id){
		return cusevalMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cusevalMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCuseval cuseval, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCusevalExample example=new TbCusevalExample();
		TbCusevalExample.Criteria criteria = example.createCriteria();
		
		if(cuseval!=null){			
			if(cuseval.getEvalComment()!=null && cuseval.getEvalComment().length()>0){
				criteria.andEvalCommentLike("%"+cuseval.getEvalComment()+"%");
			}
			if(cuseval.getCusId()!=null&&cuseval.getCusId()!=0){
				criteria.andCusIdEqualTo(cuseval.getCusId());
			}
			if(cuseval.getShopId()!=null&&cuseval.getShopId()!=0){
				criteria.andShopIdEqualTo(cuseval.getShopId());
			}
			if(cuseval.getCourierLevel()!=null&&cuseval.getCourierLevel()!=0){
				criteria.andCourierLevelEqualTo(cuseval.getCourierLevel());
			}
	
		}
		
		Page<TbCuseval> page= (Page<TbCuseval>)cusevalMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
