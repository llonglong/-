package com.situ.ssm.dao;

import com.situ.ssm.pojo.TmProvince;
import com.situ.ssm.pojo.TmProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmProvinceMapper {
    int countByExample(TmProvinceExample example);

    int deleteByExample(TmProvinceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TmProvince record);

    int insertSelective(TmProvince record);

    List<TmProvince> selectByExample(TmProvinceExample example);

    TmProvince selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TmProvince record, @Param("example") TmProvinceExample example);

    int updateByExample(@Param("record") TmProvince record, @Param("example") TmProvinceExample example);

    int updateByPrimaryKeySelective(TmProvince record);

    int updateByPrimaryKey(TmProvince record);
}