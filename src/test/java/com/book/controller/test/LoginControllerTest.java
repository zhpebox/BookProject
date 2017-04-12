package com.book.controller.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginControllerTest {

	@Test
	public void testLogin(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:conf/spring-mvc-test.xml");
		com.book.controller.TestClass obj = (com.book.controller.TestClass) ctx.getBean("dd");
		obj.outString();
	}
}
  