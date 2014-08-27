package com.ywd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PromotionController {

	
	/**
	 * 登陆注册聚合页
	 * @return
	 */
	@RequestMapping("/promotionListPage")
	private Object getPromotionListPage() {
		ModelAndView modelAndView = new ModelAndView("/view/promotion/promotionList.ftl");
		return modelAndView;
	}
}
