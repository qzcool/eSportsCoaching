package com.esports.web.service.impl;

import com.esports.constant.RegExConstant;
import com.esports.web.dao.UserMapper;
import com.esports.web.model.User;
import com.esports.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Description:
 * Author: XJD
 * Date: 2017/12/04
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String username) {
        User user = null;
        if (username.matches(RegExConstant.EMAIL_REG)) {
            user = userMapper.selectByEmail(username);
        } else if (username.matches(RegExConstant.PHONE_REG)) {
            user = userMapper.selectByPhone(username);
        } else {
            user = userMapper.selectByName(username);
        }
        return user;
    }

    @Override
    public User login(String username, String password) {
        User user = null;
        if (username.matches(RegExConstant.EMAIL_REG)) {
            user = userMapper.loginByEmail(username, password);
        } else if (username.matches(RegExConstant.PHONE_REG)) {
            user = userMapper.loginByPhone(username, password);
        } else {
            user = userMapper.loginByName(username, password);
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        int userid = userMapper.insertUser(user);
        return userid;
    }

}
