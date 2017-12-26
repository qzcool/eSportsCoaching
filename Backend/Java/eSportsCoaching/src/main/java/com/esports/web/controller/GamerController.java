package com.esports.web.controller;

import com.esports.web.model.User;
import com.esports.web.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/23
 */
@Controller
@RequestMapping("/gamer")
public class GamerController {

    @RequestMapping(value = "/update/profile", method = RequestMethod.POST)
    public String updateProfile(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        UserProfile profile = new UserProfile();
        profile.setUserid(user.getUserid());
//        profile.setNickname();
       return null;
    }
}
