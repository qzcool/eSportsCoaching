package cn.gt.controller.admins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gt.service.admins.AdService;

@Controller
@RequestMapping("/admins")
public class AdController {

	@Autowired
	@Qualifier("adService")
	private AdService adService;
}
