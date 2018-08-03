package com.mcally.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcally.dao.LoginMapper;

import com.mcally.service.LoginService;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
     @Autowired
	 LoginMapper  LoginMapper;


}
