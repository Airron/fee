package com.ecf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecf.mapper.UserMapper;
import com.ecf.pojo.User;
import com.ecf.pojo.UserExample;
import com.ecf.pojo.UserExample.Criteria;
import com.ecf.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String regist(User user) {
		int i = userMapper.insert(user);
		if (i == 1) {
			System.out.println("x" + i);
			return "registsuccess";

		} else {
			System.out.println("x" + i);
			return "registfailed";
		}

	}

	@Override
	public List<User> login(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria cir = example.createCriteria();
		cir.andUemailEqualTo(user.getUemail());
		List<User> ulist = userMapper.selectByExampleWithBLOBs(example);
		if (ulist != null) {
			if (ulist.get(0).getUpassword().equals(user.getUpassword())) {
				return ulist;
			}
			else return null;
		}
		else ulist = null;
		return ulist;
	}

	@Override
	public List<User> setting(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria cir = example.createCriteria();
		cir.andUemailEqualTo(user.getUemail());
		
		int updateresult = userMapper.updateByExampleSelective(user, example);
		System.out.println(updateresult);
		
		
		if(updateresult == 1){
			List<User> ulist = userMapper.selectByExampleWithBLOBs(example);
			return ulist;
		}
		else
		{
			List<User> ulist = null;
			return ulist;
		}
	}

}
