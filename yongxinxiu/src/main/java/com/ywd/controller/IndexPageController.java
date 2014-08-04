package com.ywd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;
import com.ywd.service.IUserService;

@Controller
public class IndexPageController {
	@Autowired
	IUserService iUserService;
	@RequestMapping("/index")
	private Object indexPage() {
		System.out.println("2132");
		ModelAndView modelAndView = new ModelAndView("/index.ftl");
		User user = iUserService.queryById("12");
		return modelAndView.addObject("hellow",user.getName());
	}
}
