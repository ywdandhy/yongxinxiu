package com.ywd.controller;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginRegistController {
	
	@RequestMapping("/loginOrRegist")
	private Object regist() {
		ModelAndView modelAndView = new ModelAndView("/view/login/loginOrRegist.ftl");
		return modelAndView;
	}
	
	@RequestMapping(value = "/checkMobile",method = RequestMethod.POST)
	@ResponseBody
	private Object checkMobileIsExist(String mobile) {
		ModelAndView modelAndView = new ModelAndView();
		return false;
	}
	
	@RequestMapping("/head")
	private Object head() {
		ModelAndView modelAndView = new ModelAndView("/resource/head.ftl");
		return modelAndView;
	}
}
