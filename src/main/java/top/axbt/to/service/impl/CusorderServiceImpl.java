package top.axbt.to.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import top.axbt.to.dao.TbCusorderMapper;
import top.axbt.to.domain.TbCusorder;
import top.axbt.to.domain.TbCusorderExample;
import top.axbt.to.entity.PageResult;
import top.axbt.to.service.CusorderService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CusorderServiceImpl implements CusorderService {

	@Autowired
	private TbCusorderMapper cusorderMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCusorder> findAll() {
		return cusorderMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCusorder> page=   (Page<TbCusorder>) cusorderMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCusorder cusorder) {
		cusorderMapper.insert(cusorder);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCusorder cusorder){
		cusorderMapper.updateByPrimaryKey(cusorder);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCusorder findOne(String id){
		return cusorderMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			cusorderMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCusorder cusorder, int pageNum, int pageSize,int state) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCusorderExample example=new TbCusorderExample();
		TbCusorderExample.Criteria criteria = example.createCriteria();
		
		if(cusorder!=null){			
			if(cusorder.getId()!=null && cusorder.getId().length()>0){
				criteria.andIdLike("%"+cusorder.getId()+"%");
			}
			if(cusorder.getOrderName()!=null && cusorder.getOrderName().length()>0){
				criteria.andOrderNameLike("%"+cusorder.getOrderName()+"%");
			}
			if(cusorder.getCusInfoId()!=null){
				criteria.andCusInfoIdEqualTo(cusorder.getCusInfoId());
			}
			//默认页
			if(state==0){
				List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(0);
				list.add(2);
				criteria.andOrderStateIn(list);
			}

			if(cusorder.getOrderState()!=null){
			    criteria.andOrderStateEqualTo(cusorder.getOrderState());
            }
			//全部订单
			if(state==1){
				List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(0);
				list.add(2);
				list.add(3);
				list.add(4);
				criteria.andOrderStateIn(list);
			}
			//查待支付
			if(state==2){
                criteria.andPayStateEqualTo(0);
            }
            //查待评价
            if(state==4){
                criteria.andOrderStateEqualTo(4);
            }
            //查退款
            if(state==6){
                criteria.andPayStateEqualTo(-1);
            }

	
		}
		
		Page<TbCusorder> page= (Page<TbCusorder>)cusorderMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

    @Override
    public PageResult findPage(TbCusorder cusorder, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbCusorderExample example=new TbCusorderExample();
        TbCusorderExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
        if(cusorder!=null){
            if(cusorder.getId()!=null && cusorder.getId().length()>0){
                criteria.andIdLike("%"+cusorder.getId()+"%");
            }
            if(cusorder.getOrderName()!=null && cusorder.getOrderName().length()>0){
                criteria.andOrderNameLike("%"+cusorder.getOrderName()+"%");
            }
            if(cusorder.getCusInfoId()!=null){
                criteria.andCusInfoIdEqualTo(cusorder.getCusInfoId());
            }
            if(cusorder.getOrderShopId()!=null){
                criteria.andOrderShopIdEqualTo(cusorder.getOrderShopId());
            }
            if(cusorder.getOrderState()!=null){
                criteria.andOrderStateEqualTo(cusorder.getOrderState());

            }




        }

        Page<TbCusorder> page= (Page<TbCusorder>)cusorderMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }
	
}
