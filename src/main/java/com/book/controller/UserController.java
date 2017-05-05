package com.book.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@ResponseBody
	@RequestMapping("/getStr")
	public String getStr(){
		int a =3, b = 3;
		int sum = a + b;
		return "Hello Json!";
	}
	
	@ResponseBody
	@RequestMapping(value="/getUsers",method = RequestMethod.GET)//
	public List<TblUser> getUser(
//			@PathVariable String uid,
			@RequestParam(value="uid")String uids){
		List<TblUser> list = new ArrayList<TblUser>();
		TblUser user = new TblUser();
		user.setUid(3);
		user.setUname("wang");
		user.setUpass("asd");
		list.add(user);
		user = new TblUser();
		user.setUid(4);
		user.setUname("zhp");
		user.setUpass("qwe");
		list.add(user);
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value="/getUsers/{uid}",method = RequestMethod.GET)//
	public List<TblUser> getUsers(@PathVariable String uid){
		List<TblUser> list = new ArrayList<TblUser>();
		TblUser user = new TblUser();
		user.setUid(3);
		user.setUname("wang");
		user.setUpass("asd");
		list.add(user);
		user = new TblUser();
		user.setUid(4);
		user.setUname("zhp");
		user.setUpass("qwe");
		list.add(user);
		return list;
	}
	
	//post
	@ResponseBody
	@RequestMapping(value="/addUsers",method=RequestMethod.POST,
			produces="application/json;charset=UTF-8")
	public int addUsers(@RequestParam(value="mo") String user
			,TblUser mo){
		int result = 1;
//		userService.insertUsers(user)
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/addUsers",method=RequestMethod.PUT,
			produces="application/json;charset=UTF-8")
	public int addUsersss(@RequestParam(value="mo",required=false) String user,
			TblUser mo){
//		JSONObject obj = new JSONObject();
		int resultPUT = 0;
		return resultPUT;
	}
}
