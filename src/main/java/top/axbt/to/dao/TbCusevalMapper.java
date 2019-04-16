package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbCuseval;
import top.axbt.to.domain.TbCusevalExample;

import java.util.List;

@Repository
public interface TbCusevalMapper {
    long countByExample(TbCusevalExample example);

    int deleteByExample(TbCusevalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCuseval record);

    int insertSelective(TbCuseval record);

    List<TbCuseval> selectByExample(TbCusevalExample example);

    TbCuseval selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCuseval record, @Param("example") TbCusevalExample example);

    int updateByExample(@Param("record") TbCuseval record, @Param("example") TbCusevalExample example);

    int updateByPrimaryKeySelective(TbCuseval record);

    int updateByPrimaryKey(TbCuseval record);
}