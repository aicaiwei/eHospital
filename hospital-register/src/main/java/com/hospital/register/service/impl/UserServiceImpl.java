package com.hospital.register.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.hospital.register.bean.User;
import com.hospital.register.dao.UserMapper;
import com.hospital.register.service.UserService;

//@Service(value = "userService")
@Component
public class UserServiceImpl implements UserService{

	
	@Autowired
    private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public List<User> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.selectAllUser();
	}
	
}
