package com.ecf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecf.mapper.PcategoryMapper;
import com.ecf.pojo.Pcategory;
import com.ecf.pojo.PcategoryExample;

import com.ecf.service.PcategoryService;

@Service
public class PcategoryServiceImpl implements PcategoryService {

	@Autowired
	private PcategoryMapper pcategoryMapper;
	@Override
	public List<Pcategory> getPcategory() {
		// TODO Auto-generated method stub
		PcategoryExample example = new PcategoryExample();
//		Criteria criteria = example.createCriteria();
		List<Pcategory> list = pcategoryMapper.selectByExample(example);
		for(Pcategory s:list){
			System.out.println("----------------"+s);
		}
		return list;
	}

}
