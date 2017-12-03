package com.esports.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * Author: XJD
 * Date: 2017-09-02 16:55
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return "forward:/views/login.html";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout() {

        return null;
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register() {

        return null;
    }

}
