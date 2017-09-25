package com.situ.ssm.dao;

import com.situ.ssm.pojo.TmCity;
import com.situ.ssm.pojo.TmCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmCityMapper {
    int countByExample(TmCityExample example);

    int deleteByExample(TmCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TmCity record);

    int insertSelective(TmCity record);

    List<TmCity> selectByExample(TmCityExample example);

    TmCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TmCity record, @Param("example") TmCityExample example);

    int updateByExample(@Param("record") TmCity record, @Param("example") TmCityExample example);

    int updateByPrimaryKeySelective(TmCity record);

    int updateByPrimaryKey(TmCity record);
}