package com.esports.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/gamer/profile")
    public String gamerProfile(){
        return "forward:/views/gamer/profile.html";
    }

    @RequestMapping("/sensei/profile")
    public String senseiProfile(){
        return "forward:/views/sensei/profile.html";
    }
}
