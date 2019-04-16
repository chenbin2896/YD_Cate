package top.axbt.to.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.to.domain.TbCourierdeposit;
import top.axbt.to.domain.TbCourierdepositExample;

import java.util.List;

@Repository
public interface TbCourierdepositMapper {
    long countByExample(TbCourierdepositExample example);

    int deleteByExample(TbCourierdepositExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCourierdeposit record);

    int insertSelective(TbCourierdeposit record);

    List<TbCourierdeposit> selectByExample(TbCourierdepositExample example);

    TbCourierdeposit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCourierdeposit record, @Param("example") TbCourierdepositExample example);

    int updateByExample(@Param("record") TbCourierdeposit record, @Param("example") TbCourierdepositExample example);

    int updateByPrimaryKeySelective(TbCourierdeposit record);

    int updateByPrimaryKey(TbCourierdeposit record);
}