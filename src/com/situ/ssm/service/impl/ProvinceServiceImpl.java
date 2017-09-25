package com.situ.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.TmAreaMapper;
import com.situ.ssm.dao.TmCityMapper;
import com.situ.ssm.dao.TmProvinceMapper;
import com.situ.ssm.pojo.TmArea;
import com.situ.ssm.pojo.TmAreaExample;
import com.situ.ssm.pojo.TmCity;
import com.situ.ssm.pojo.TmCityExample;
import com.situ.ssm.pojo.TmProvince;
import com.situ.ssm.pojo.TmProvinceExample;
import com.situ.ssm.service.IProvinceService;

@Service
public class ProvinceServiceImpl implements IProvinceService{
	
	@Autowired
	private TmProvinceMapper tmProvinceMapper;
	@Autowired
	private TmCityMapper tmCityMapper;
	@Autowired
	private TmAreaMapper tmAreaMapper;
	
	@Override
	public List<TmProvince> selectProvinces() {
		return tmProvinceMapper.selectByExample(new TmProvinceExample());
	}

	@Override
	public List<TmCity> selectCitys(int provinceId) {
		TmCityExample tmCityExample = new TmCityExample();
		tmCityExample.createCriteria().andProvinceIdEqualTo(Integer.valueOf(provinceId).longValue());
		return tmCityMapper.selectByExample(tmCityExample);
	}

	@Override
	public List<TmArea> selectAreas(int cityId) {
		TmAreaExample tmAreaExample = new TmAreaExample();
		tmAreaExample.createCriteria().andCityIdEqualTo(cityId);
		return tmAreaMapper.selectByExample(tmAreaExample);
	}

}
