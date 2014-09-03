package com.ywd.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ywd.model.Dealer;
import com.ywd.model.Promotion;
import com.ywd.service.promotion.IdealerService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
//@Transactional
public class TestDealer {
	
	@Autowired
	IdealerService idealerService;
	
//	@Test
	public void update() {
		Dealer dealer = new Dealer();
		dealer.setAddress("上海市闵行区七宝镇");
		dealer.setPhone("400-33234-567");
		dealer.setImageUrl("dsgdfg/dsf");
		dealer.setDescription("我是上海最大的珠宝经销商");
		dealer.save();
	
	}
//	@Test
	public void findOne() {
		Promotion promotion = Promotion.findInstance("40289749481fc4be01481fc4d2bf0001");
		System.out.println(promotion.getDescription());
		for (Dealer dealer : promotion.getLsDealers()) {
			System.out.println(dealer.getDescription());
		}		
	}
	
	@Test
	public void findOne1() {
		Promotion promotion = Promotion.findInstance("40289749481fc4be01481fc4d2bf0001");
		System.out.println(promotion.getCreateTime());
		System.out.println(promotion.getUpdateTime());	
	}
	
}
