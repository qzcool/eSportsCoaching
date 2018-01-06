package com.esports.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.esports.web.model.User;
import com.esports.web.model.UserProfile;
import com.esports.web.service.impl.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/23
 */
@Controller
@RequestMapping("/gamer")
public class GamerController {

    @Autowired
    private GamerService gamerService;

    //gamer的逻辑处理
    @RequestMapping(value = "/update/profile", method = RequestMethod.POST)
    public String updateProfile(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        UserProfile profile = new UserProfile();
        profile.setUserid(user.getUserid());
        profile.setNickname(request.getParameter("nickname"));
        profile.setGameLabel(request.getParameter("gameLabel"));
        profile.setImg(request.getParameter("img"));
        profile.setIntroduction(request.getParameter("introduction"));
        gamerService.updateProfile(profile);
       return "redirect:/gamer/lesson/calender";
    }

    @RequestMapping(value = "/lesson/calender")
    public String lessonCalender(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        JSONObject json = new JSONObject();   //课程相关信息
        json.put("name","xjd");
        json.put("xxx","xxx");
        return "forward:/gamer/calender";
    }

    @RequestMapping(value = "/lesson/myReviews")
    public String lessonReviews(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        System.out.println(user);
        JSONObject json = new JSONObject();   //评论相关信息
        json.put("name","xjd");
        json.put("xxx","xxx");
        return "forward:/gamer/myReviews";
    }

    //页面跳转相关
    @RequestMapping("/profile")
    public String gamerProfile(HttpServletRequest request){
        return "forward:/views/gamer/profile.html";
    }

    @RequestMapping("/myReviews")
    public String gamerReviews(HttpServletRequest request){
        return "forward:/views/gamer/myReviews.html";
    }

    @RequestMapping("/calender")
    public String gamerCalender(HttpServletRequest request){
        return "forward:/views/gamer/calender.html";
    }
    @RequestMapping("/getFreeLessons")
    public String freeLessons(HttpServletRequest request){
        return "forward:/views/gamer/getFreeLessons.html";
    }

    @RequestMapping("/accountSetting")
    public String accountSetting(HttpServletRequest request){
        return "forward:/views/gamer/accountSetting.html";
    }

    @RequestMapping("/summary")
    public String accountSummary(HttpServletRequest request){
        return "forward:/views/gamer/summary.html";
    }

    @RequestMapping("/history")
    public String tradeHistory(HttpServletRequest request){
        return "forward:/views/gamer/history.html";
    }

}
