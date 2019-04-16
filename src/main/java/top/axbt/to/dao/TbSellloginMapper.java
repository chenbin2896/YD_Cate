package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbSelllogin;
import top.axbt.to.domain.TbSellloginExample;

import java.util.List;

@Repository
public interface TbSellloginMapper {
    long countByExample(TbSellloginExample example);

    int deleteByExample(TbSellloginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSelllogin record);

    int insertSelective(TbSelllogin record);

    List<TbSelllogin> selectByExample(TbSellloginExample example);

    TbSelllogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSelllogin record, @Param("example") TbSellloginExample example);

    int updateByExample(@Param("record") TbSelllogin record, @Param("example") TbSellloginExample example);

    int updateByPrimaryKeySelective(TbSelllogin record);

    int updateByPrimaryKey(TbSelllogin record);
}