package com.esports.web.service;

import com.esports.web.model.User;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/04
 */
public interface IUserService {

    User getUser(String username);

    User login(String username, String password);

    void addUser(User user);
}
