package com.situ.ssm.dao;

import com.situ.ssm.pojo.TmArea;
import com.situ.ssm.pojo.TmAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmAreaMapper {
    int countByExample(TmAreaExample example);

    int deleteByExample(TmAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TmArea record);

    int insertSelective(TmArea record);

    List<TmArea> selectByExample(TmAreaExample example);

    TmArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TmArea record, @Param("example") TmAreaExample example);

    int updateByExample(@Param("record") TmArea record, @Param("example") TmAreaExample example);

    int updateByPrimaryKeySelective(TmArea record);

    int updateByPrimaryKey(TmArea record);
}