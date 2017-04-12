package com.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController(){
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/register")
	public String registerUser(){
		logger.debug(" user register debug logger");
		logger.info(" user register info logger");
		return "userIndex";
	}
}
