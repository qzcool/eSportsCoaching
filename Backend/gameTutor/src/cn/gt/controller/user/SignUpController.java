package cn.gt.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mysql.jdbc.StringUtils;

import cn.gt.pojo.User;
import cn.gt.service.user.UserService;

@Controller
@RequestMapping("/signUp")
public class SignUpController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	//判断账号是否可用
	@RequestMapping("/userNameExist")
	@ResponseBody
	public String userNameExist(HttpServletRequest request, HttpServletResponse response){
		String showView = "";
		String userName = request.getParameter("userName");
		User user = null;
		if(StringUtils.isNullOrEmpty(userName)){
			showView = "exist";
		}else{
			user = userService.userNameExist(userName);
			if(null != user){
				showView = "exist";
			}else{
				showView = "notexist";
			}
		}
		showView = JSONArray.toJSONString(showView);
		return showView;
		
	}
	
	
	//添加用户
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(HttpServletRequest request, HttpServletResponse response){
		String showView ="";
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String role = request.getParameter("role");
		User user = new User();
		user.setName(userName);
		user.setPwd(userPwd);
		user.setRole(Integer.parseInt(role));
		int i = userService.addUser(user);
		showView = JSON.toJSONString(i);
		return showView;
		
	}
	
	
}
