package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbManaddress;
import top.axbt.to.domain.TbManaddressExample;

import java.util.List;

@Repository
public interface TbManaddressMapper {
    long countByExample(TbManaddressExample example);

    int deleteByExample(TbManaddressExample example);

    int insert(TbManaddress record);

    int insertSelective(TbManaddress record);

    List<TbManaddress> selectByExample(TbManaddressExample example);

    int updateByExampleSelective(@Param("record") TbManaddress record, @Param("example") TbManaddressExample example);

    int updateByExample(@Param("record") TbManaddress record, @Param("example") TbManaddressExample example);
}