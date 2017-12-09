package com.esports.web.dao;

import com.esports.web.model.User;

import java.util.Map;


public interface UserMapper {

    int insertUser(User user);

    User selectByName(String username);

    User selectByEmail(String email);

    User selectByPhone(String phone);

    User loginByName(Map<String,Object> params);

    User loginByEmail(Map<String,Object> params);

    User loginByPhone(Map<String,Object> params);


}
