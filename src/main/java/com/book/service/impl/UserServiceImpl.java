package com.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.mysql.dao.TblUserMapper;
import com.book.mysql.model.TblUser;
import com.book.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	TblUserMapper tblUserMapper;
	
	@Override
	public int registerUser(TblUser user) {
		int reuslt = tblUserMapper.insert(user);
		return reuslt;
	}

	@Override
	public int insertUsers(TblUser user) {
		int result = tblUserMapper.insert(user);
		return result;
	}

}
