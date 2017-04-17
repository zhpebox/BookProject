package com.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.mysql.model.TblUser;
import com.book.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public String registerUser(){
		logger.debug(" user register debug logger");
		logger.info(" user register info logger");
		TblUser user = new TblUser();
		user.setUid(3);
		user.setUname("wang");
		user.setUpass("asd");
		userService.registerUser(user);
		return "userIndex";
	}
}
