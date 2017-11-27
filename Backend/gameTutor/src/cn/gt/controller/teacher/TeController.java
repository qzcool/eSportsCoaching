package cn.gt.controller.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gt.service.teacher.TeService;

@Controller
@RequestMapping("/teacher")
public class TeController {

	@Autowired
	@Qualifier("teService")
	private TeService teService;
}
