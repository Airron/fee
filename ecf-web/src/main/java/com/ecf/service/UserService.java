package com.ecf.service;

import java.util.List;

import com.ecf.pojo.User;

public interface UserService {
	String regist(User user);

	List<User> login(User user);

	List<User> setting(User user);
}
