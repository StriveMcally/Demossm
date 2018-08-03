package com.mcally.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mcally.dao.LoginMapper;
import com.mcally.entity.Login;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:conf/spring-mvc.xml","classpath:conf/spring-mybatis.xml"})
public class DBTest {
	@Autowired
    LoginMapper  loginMapper;
	
	@Test
	public  void  test1() {

	Login  log=	loginMapper.getAccountByUserName("Mcally");
	System.out.print(log);
	}
	
	
}
