package com.ywd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ywd.model.Dealer;
import com.ywd.model.Promotion;

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
	
	/**
	 * 登陆注册聚合页
	 * @return
	 */
	@RequestMapping("/getPromotionDealer")
	private void getPromotionDealer() {
		Promotion promotion = Promotion.findInstance("40289749481fc4be01481fc4d2bf0001");
		System.out.println(promotion.getDescription());
		for (Dealer dealer : promotion.getLsDealers()) {
			System.out.println(dealer.getDescription());
		}}
	
}
