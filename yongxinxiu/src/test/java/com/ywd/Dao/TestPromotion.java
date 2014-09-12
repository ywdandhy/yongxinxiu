package com.ywd.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ywd.model.Dealer;
import com.ywd.model.Promotion;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
//@Transactional
public class TestPromotion {
	
	@Test
	public void update() {
		for (int i = 0; i < 5; i++) {
			Dealer dealer = new Dealer();
			dealer.setAddress("上海市闵行区七宝镇");
			dealer.setPhone("400-33234-567");
			dealer.setImageUrl("dsgdfg/dsf");
			dealer.setDescription(i + "我是上海最大的珠宝经销商");
			dealer.save();
		
		
			Promotion promotion = new Promotion();
			promotion.setImageUrl("sad");
			promotion.setTitle(i + "周大生珠宝50分钻戒");
			promotion.setNeedApply(false);
			promotion.setDescription("周大生珠宝周大生珠宝周大生珠宝周大生珠宝周大生珠宝很好很强大，"
					+ "提供婚戒定制服务，为您分忧,周大生珠宝周大生珠宝周大生珠宝周大生珠宝周大生珠宝很好"
					+ "很强大，提供婚戒定制服务，为您分忧,周大生珠宝周大生珠宝周大生珠宝周大生珠宝周大生"
					+ "珠宝很好很强大，提供婚戒定制服务，为您分忧,周大生珠宝周大生珠宝周大生珠宝周大生珠"
					+ "宝周大生珠宝很好很强大");
			promotion.setNowPrice(8000);
			promotion.setNowNumber(200);
			promotion.setOriginalPrice(20000);
			promotion.addDealers(dealer);
			promotion.save();
		}
		
	}
	
//	@Test
	public void testAutoTime() {
		Promotion promotion = Promotion.findInstance("40289775483461f501483461fe870001");
		promotion.setTitle("45周大生珠宝50分钻戒");
		promotion.save();
	}
}
