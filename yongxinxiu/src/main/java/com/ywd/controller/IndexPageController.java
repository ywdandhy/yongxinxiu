package com.ywd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexPageController {

	@RequestMapping("/index")
	private Object indexPage() {
		System.out.println("2132");
		ModelAndView modelAndView = new ModelAndView("/index.ftl");
		modelAndView.addObject("hellow", "helloWord你妹");
		return modelAndView;
	}
}
