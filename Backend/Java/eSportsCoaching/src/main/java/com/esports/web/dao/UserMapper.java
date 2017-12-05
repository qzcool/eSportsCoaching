package com.esports.web.dao;

import com.esports.web.model.User;


public interface UserMapper {

    int insertUser(User user);

    User selectByName(String username);

    User selectByEmail(String email);

    User selectByPhone(String phone);

    User loginByName(String username, String password);

    User loginByEmail(String username, String password);

    User loginByPhone(String username, String password);


}
