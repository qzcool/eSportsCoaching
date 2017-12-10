package com.esports.web.controller;

import com.esports.web.service.impl.IdentifyCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
@Controller
@RequestMapping("/identify")
public class IdentifyCodeController {

    @Autowired
    private IdentifyCodeServiceImpl identifyCodeService;

    @RequestMapping("/sendCode")
    @ResponseBody
    public String sendIdentifyCode(HttpServletRequest request){
        identifyCodeService.sendIdentifyCode(request.getParameter("username"));
        return "";
    }
}
