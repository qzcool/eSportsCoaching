package controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import pojo.Students;
import service.TestServiceImpl;


@Controller
@RequestMapping("/testController")
public class TestController {

	@Autowired
	@Qualifier("TestService")
	private TestServiceImpl testService;
	
	
	//获取班级名称
	@RequestMapping(value="/classFind",produces="text/json;charset=utf-8")
	@ResponseBody
	public String classFind(HttpServletRequest request, HttpServletResponse response){
		List<String> list = testService.classFind();
		String data = JSONArray.toJSONString(list);
		return data;
		
	}
	
	//获取班级名称
	@RequestMapping(value="/stdInsert",produces="text/json;charset=utf-8")
	@ResponseBody
	public String stdInsert(HttpServletRequest request, HttpServletResponse response){
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		String slt = request.getParameter("slt");
		if(sex.equals("男")){
			sex = "0";
		}else{
			sex = "1";
		}
		Students student = new Students();
		student.setCode(code);
		student.setName(name);
		student.setAge(Integer.parseInt(age));
		student.setSex(sex);
		student.setPhone(phone);
		int classId = 0;
		switch(slt){
			case "1609A":
				classId = 1;
				break;
			case "1611A":
				classId = 2;
				break;
			case "1612":
				classId = 3;
				break;
			case "1702A":
				classId = 4;
				break;
		}
		student.setClassId(classId);
		int i = testService.stdInsert(student);
		String showView = JSON.toJSONString(i);
		return showView;
		
	}
}
