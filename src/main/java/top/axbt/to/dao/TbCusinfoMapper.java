package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbCusinfo;
import top.axbt.to.domain.TbCusinfoExample;

import java.util.List;

@Repository
public interface TbCusinfoMapper {
    long countByExample(TbCusinfoExample example);

    int deleteByExample(TbCusinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCusinfo record);

    int insertSelective(TbCusinfo record);

    List<TbCusinfo> selectByExample(TbCusinfoExample example);

    TbCusinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCusinfo record, @Param("example") TbCusinfoExample example);

    int updateByExample(@Param("record") TbCusinfo record, @Param("example") TbCusinfoExample example);

    int updateByPrimaryKeySelective(TbCusinfo record);

    int updateByPrimaryKey(TbCusinfo record);
}