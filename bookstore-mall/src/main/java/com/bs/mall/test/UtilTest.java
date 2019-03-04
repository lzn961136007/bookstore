package com.bs.mall.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bs.mall.util.JudgeUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:springMvc.xml","classpath:applicationContext.xml"})
public class UtilTest {
	@Resource
	private JudgeUser ju;
	@Test
	public void juTest(){
		Boolean exites = ju.judgeColumnExites("t_comment", "user_id", "book_id", "2", "1");
		System.out.println("是否存在："+exites);
	}
}
