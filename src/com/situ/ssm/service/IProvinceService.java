package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.TmArea;
import com.situ.ssm.pojo.TmCity;
import com.situ.ssm.pojo.TmProvince;

public interface IProvinceService {

	List<TmProvince> selectProvinces();

	List<TmCity> selectCitys(int provinceId);

	List<TmArea> selectAreas(int cityId);

}
