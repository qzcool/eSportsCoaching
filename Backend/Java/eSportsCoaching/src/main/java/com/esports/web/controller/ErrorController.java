package com.esports.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Author: XJD
 * Date: 2017-08-27 22:34
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/401")
    public String error401(){
        return "forward:/views/error/login.html";
    }

    @RequestMapping("/403")
    public String error403(){
        return "forward:/views/error/403.html";
    }

    @RequestMapping("/404")
    public String error404(){
        return "forward:/views/error/404.html";
    }

    @RequestMapping("/500")
    public String error500(){
        return "forward:/views/error/500.html";
    }
}
