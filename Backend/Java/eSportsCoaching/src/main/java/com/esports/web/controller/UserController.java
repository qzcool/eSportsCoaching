package com.esports.web.controller;

import com.esports.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/gamer/profile")
    public String gamerProfile(HttpServletRequest request){
        return "forward:/views/gamer/profile.html";
    }

    @RequestMapping("/gamer/calender")
    public String gamerCalender(HttpServletRequest request){
        return "forward:/views/gamer/calender.html";
    }

    @RequestMapping("/sensei/profile")
    public String senseiProfile(HttpServletRequest request){
        return "forward:/views/sensei/profile.html";
    }
}
