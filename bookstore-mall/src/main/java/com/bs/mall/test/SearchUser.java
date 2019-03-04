package com.bs.mall.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bs.mall.controller.UserController;
import com.bs.mall.service.UserService;
import com.bs.mall.util.JsonData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:springMvc.xml","classpath:applicationContext.xml"})
public class SearchUser {
	@Resource
	private UserService us;
	
	@Resource
	private UserController ul;
	@Test
	public void UserTest(){
//		User user = us.getUserIsExist("2535545766@qq.com");
//		//Boolean user = us.addUser("2535545766@qq.com", "easy", "123");
//		System.out.println("是否成功："+user);
		//User userIsExist = us.getUserByEmail("2535545766@qq.com");
		JsonData name = ul.searchName("打工行借记卡");
		System.out.println("name:"+name);
	}
}
