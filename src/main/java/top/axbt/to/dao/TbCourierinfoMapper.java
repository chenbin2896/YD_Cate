package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbCourierinfo;
import top.axbt.to.domain.TbCourierinfoExample;

import java.util.List;

@Repository
public interface TbCourierinfoMapper {
    long countByExample(TbCourierinfoExample example);

    int deleteByExample(TbCourierinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCourierinfo record);

    int insertSelective(TbCourierinfo record);

    List<TbCourierinfo> selectByExample(TbCourierinfoExample example);

    TbCourierinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCourierinfo record, @Param("example") TbCourierinfoExample example);

    int updateByExample(@Param("record") TbCourierinfo record, @Param("example") TbCourierinfoExample example);

    int updateByPrimaryKeySelective(TbCourierinfo record);

    int updateByPrimaryKey(TbCourierinfo record);
}