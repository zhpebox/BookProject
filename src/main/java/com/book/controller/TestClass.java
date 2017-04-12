package com.book.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestClass {
	
	public TestClass(){
		System.out.println("构造main-TestClass!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void outString(){
		System.out.println("#####################################main 方法执行成功！");
	}
}
