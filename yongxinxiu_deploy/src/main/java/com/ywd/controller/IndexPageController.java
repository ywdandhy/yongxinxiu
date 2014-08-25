package com.ywd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ywd.service.User.IUserService;

@Controller
public class IndexPageController {
	@Autowired
	IUserService iUserService;
	@RequestMapping("/index")
	private Object indexPage() {
		ModelAndView modelAndView = new ModelAndView("/view/index.ftl");
		return modelAndView;
	}
}
