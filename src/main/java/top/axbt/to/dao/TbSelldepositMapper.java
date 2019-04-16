package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbSelldeposit;
import top.axbt.to.domain.TbSelldepositExample;

import java.util.List;

@Repository
public interface TbSelldepositMapper {
    long countByExample(TbSelldepositExample example);

    int deleteByExample(TbSelldepositExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSelldeposit record);

    int insertSelective(TbSelldeposit record);

    List<TbSelldeposit> selectByExample(TbSelldepositExample example);

    TbSelldeposit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSelldeposit record, @Param("example") TbSelldepositExample example);

    int updateByExample(@Param("record") TbSelldeposit record, @Param("example") TbSelldepositExample example);

    int updateByPrimaryKeySelective(TbSelldeposit record);

    int updateByPrimaryKey(TbSelldeposit record);
}