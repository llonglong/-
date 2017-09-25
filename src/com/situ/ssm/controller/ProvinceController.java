package com.situ.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.TmArea;
import com.situ.ssm.pojo.TmCity;
import com.situ.ssm.pojo.TmProvince;
import com.situ.ssm.service.IProvinceService;

@Controller
@RequestMapping("/province")
public class ProvinceController {
	@Autowired
	private IProvinceService provinceService;
	
	@RequestMapping("/selectProvinces")
    public @ResponseBody List<TmProvince> selectProvinces() {
       return provinceService.selectProvinces();
    }
	
	@RequestMapping("/selectCitys")
    public @ResponseBody List<TmCity> selectCitys(int provinceId) {
       return provinceService.selectCitys(provinceId);
    }
	
	@RequestMapping("/selectAreas")
    public @ResponseBody List<TmArea> selectAreas(int cityId) {
       return provinceService.selectAreas(cityId);
    }



}
