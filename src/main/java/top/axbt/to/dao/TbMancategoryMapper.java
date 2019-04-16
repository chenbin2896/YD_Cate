package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbMancategory;
import top.axbt.to.domain.TbMancategoryExample;

import java.util.List;

@Repository
public interface TbMancategoryMapper {
    long countByExample(TbMancategoryExample example);

    int deleteByExample(TbMancategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMancategory record);

    int insertSelective(TbMancategory record);

    List<TbMancategory> selectByExample(TbMancategoryExample example);

    TbMancategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMancategory record, @Param("example") TbMancategoryExample example);

    int updateByExample(@Param("record") TbMancategory record, @Param("example") TbMancategoryExample example);

    int updateByPrimaryKeySelective(TbMancategory record);

    int updateByPrimaryKey(TbMancategory record);
}