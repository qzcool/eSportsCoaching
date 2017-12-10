package com.esports.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.esports.constant.RegExConstant;
import com.esports.web.model.User;
import com.esports.web.service.impl.IdentifyCodeServiceImpl;
import com.esports.web.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Description:
 * Author: XJD
 * Date: 2017-12-09 15:55
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private IdentifyCodeServiceImpl codeService;

    @RequestMapping("/signIn")
    public String signIn() {
        return "forward:/views/signIn.html";
    }

    @RequestMapping("/signUp")
    public String signUp() {
        return "forward:/views/signUp.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        User user = userService.login(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            int role = user.getRole();
            String redirectPath = "redirect:/index";
            if (role == 1) {
                redirectPath = "redirect:/user/gamer/profile";
            } else if (role == 2) {
                redirectPath = "redirect:/user/sensei/profile";
            }
            return redirectPath;
        } else {
            return "forward:login_error";
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request) {
        String nickName = request.getParameter("nickname");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String username = request.getParameter("username");
        String identifyCode = request.getParameter("code");
        User user = new User();
        user.setUsername(nickName);
        user.setRole(Integer.parseInt(role));
        user.setPassword(password);
        if (username.matches(RegExConstant.EMAIL_REG)) {
            user.setEmail(username);
        } else if (username.matches(RegExConstant.PHONE_REG)) {
            user.setPhone(username);
        }
        //验证验证码
        String code = codeService.getIdentifyCode(username);
        if (identifyCode.equals(code)) {
            userService.addUser(user);
            return "redirect: /account/signIn";
        } else {
            return "forward:register_error";
        }
    }

    @RequestMapping(value = "/login_error", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String loginFail() {
        JSONObject json = new JSONObject();
        json.put("code", "201");
        json.put("msg", "账号或者密码错误！");
        return json.toJSONString();
    }

    @RequestMapping(value = "/register_error", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String registerFail() {
        JSONObject json = new JSONObject();
        json.put("code", "202");
        json.put("msg", "验证码错误");
        return json.toJSONString();
    }


}
