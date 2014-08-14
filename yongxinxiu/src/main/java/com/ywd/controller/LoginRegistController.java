package com.ywd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ywd.model.User;
import com.ywd.service.User.IUserService;

@Controller
public class LoginRegistController {
	@Autowired
	IUserService iUserService;
	
	@RequestMapping("/loginOrRegist")
	private Object regist() {
		ModelAndView modelAndView = new ModelAndView("/view/login/loginOrRegist.ftl");
		return modelAndView;
	}
	
	@RequestMapping(value = "/checkMobile",method = RequestMethod.POST)
	@ResponseBody
	private Object checkMobileIsExist(String mobile) {
		User user = iUserService.queryByMobile(mobile);
		if (null == user) {
			return false;
		}else {
			return true;
		}
		
	}
	
	@RequestMapping("/head")
	private Object head() {
		ModelAndView modelAndView = new ModelAndView("/resource/head.ftl");
		return modelAndView;
	}
}
