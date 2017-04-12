package com.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping("/validate")
	public String validate(){
		logger.info("already run a controller……");
		logger.debug("already run a debug controller……");
		return "index";
	}
}
