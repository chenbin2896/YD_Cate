package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbManadv;
import top.axbt.to.domain.TbManadvExample;

import java.util.List;

@Repository
public interface TbManadvMapper {
    long countByExample(TbManadvExample example);

    int deleteByExample(TbManadvExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbManadv record);

    int insertSelective(TbManadv record);

    List<TbManadv> selectByExample(TbManadvExample example);

    TbManadv selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbManadv record, @Param("example") TbManadvExample example);

    int updateByExample(@Param("record") TbManadv record, @Param("example") TbManadvExample example);

    int updateByPrimaryKeySelective(TbManadv record);

    int updateByPrimaryKey(TbManadv record);
}