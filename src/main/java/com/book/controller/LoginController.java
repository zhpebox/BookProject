package com.book.controller;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;

//import net.sf.json.JSONObject;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/validate")
	public String validate(){
		logger.info("already run a controller……");
		logger.debug("already run a debug controller……");
		
//		String user = "{\"name\":\"zhp\",\"password\":\"123456\"}";
//		JSONObject userInfo = JSON.parseObject(user);
//		com.gexin.fastjson.JSONObject jObject = JSON.parseObject(user);
		
//		UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getString("name"), userInfo.getString("password"));
		UsernamePasswordToken token = new UsernamePasswordToken("zhp","123");
		token.setRememberMe(true);

		Subject currentUserSubject = SecurityUtils.getSubject();
		currentUserSubject.login(token);
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		Subject currentUser = SecurityUtils.getSubject();
		String userName = (String) currentUser.getPrincipal();
		
		currentUser.logout();
		
		System.out.println(userName+"logout!");
		
		return "index";
	}
}
