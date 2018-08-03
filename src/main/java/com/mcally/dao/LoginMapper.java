package com.mcally.dao;

import org.springframework.stereotype.Repository;

import com.mcally.entity.Login;
@Repository
public interface LoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
    Login  getAccountByUserName(String userName);
    
}