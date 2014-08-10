package com.ywd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginRegistController {
	
	@RequestMapping("/regist")
	private Object regist() {
		ModelAndView modelAndView = new ModelAndView("/view/login/regist.ftl");
		return modelAndView;
	}
	
	@RequestMapping("/head")
	private Object head() {
		ModelAndView modelAndView = new ModelAndView("/resource/head.ftl");
		return modelAndView;
	}
}
