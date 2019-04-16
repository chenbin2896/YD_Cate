package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.to.domain.TbCusorder;
import top.axbt.to.domain.TbCusorderExample;

import java.util.List;

@Repository
public interface TbCusorderMapper {
    long countByExample(TbCusorderExample example);

    int deleteByExample(TbCusorderExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCusorder record);

    int insertSelective(TbCusorder record);

    List<TbCusorder> selectByExample(TbCusorderExample example);

    TbCusorder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCusorder record, @Param("example") TbCusorderExample example);

    int updateByExample(@Param("record") TbCusorder record, @Param("example") TbCusorderExample example);

    int updateByPrimaryKeySelective(TbCusorder record);

    int updateByPrimaryKey(TbCusorder record);
}