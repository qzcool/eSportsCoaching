package com.esports.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: XJD
 * Date: 2018/01/06
 */
@Controller
@RequestMapping("/sensei")
public class SenseiController {

    @RequestMapping("/profile")
    public String senseiProfile(HttpServletRequest request){
        return "forward:/views/sensei/profile.html";
    }

}
