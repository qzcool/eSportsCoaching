package cn.gt.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gt.service.student.StService;

@Controller
@RequestMapping("/student")
public class StController {

	@Autowired
	@Qualifier("stService")
	private StService stService;
}
