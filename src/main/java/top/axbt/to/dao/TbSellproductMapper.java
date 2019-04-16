package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbSellproduct;
import top.axbt.to.domain.TbSellproductExample;

import java.util.List;

@Repository
public interface TbSellproductMapper {
    long countByExample(TbSellproductExample example);

    int deleteByExample(TbSellproductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSellproduct record);

    int insertSelective(TbSellproduct record);

    List<TbSellproduct> selectByExample(TbSellproductExample example);

    TbSellproduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSellproduct record, @Param("example") TbSellproductExample example);

    int updateByExample(@Param("record") TbSellproduct record, @Param("example") TbSellproductExample example);

    int updateByPrimaryKeySelective(TbSellproduct record);

    int updateByPrimaryKey(TbSellproduct record);
}