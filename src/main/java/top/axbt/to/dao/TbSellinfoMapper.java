package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.domain.TbSellinfoExample;

import java.util.List;

@Repository
public interface TbSellinfoMapper {
    long countByExample(TbSellinfoExample example);

    int deleteByExample(TbSellinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSellinfo record);

    int insertSelective(TbSellinfo record);

    List<TbSellinfo> selectByExample(TbSellinfoExample example);

    TbSellinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSellinfo record, @Param("example") TbSellinfoExample example);

    int updateByExample(@Param("record") TbSellinfo record, @Param("example") TbSellinfoExample example);

    int updateByPrimaryKeySelective(TbSellinfo record);

    int updateByPrimaryKey(TbSellinfo record);
}