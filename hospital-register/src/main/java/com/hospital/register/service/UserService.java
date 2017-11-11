package com.hospital.register.service;

import java.util.List;

import com.hospital.register.bean.User;

public interface UserService {
	int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
