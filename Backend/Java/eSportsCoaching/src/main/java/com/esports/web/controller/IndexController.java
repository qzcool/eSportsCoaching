package com.esports.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * Author: XJD
 * Date: 2017-08-26 16:25
 */
@Controller
public class IndexController {

    @RequestMapping(value = "*")
    public String homePage(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:/index";
    }

    @RequestMapping(value = "/index")
    public String homePage(HttpServletRequest request) {
        return "forward:/views/index.html";
    }

}
