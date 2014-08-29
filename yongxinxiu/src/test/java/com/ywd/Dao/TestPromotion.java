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

		Dealer dealer = new Dealer();
		dealer.setAddress("上海市闵行区七宝镇");
		dealer.setPhone("400-33234-567");
		dealer.setImageUrl("dsgdfg/dsf");
		dealer.setDescription("我是上海最大的珠宝经销商");
		dealer.save();
	
	
		Promotion promotion = new Promotion();
		promotion.setImageUrl("sad");
		promotion.setTitle("周大生珠宝50分钻戒");
		promotion.setNeedApply(false);
		promotion.setDescription("周大生珠宝周大生珠宝周大生珠宝周大生珠宝周大生珠宝");
		promotion.setNowPrice(8000);
		promotion.setNowNumber(200);
		promotion.setOriginalPrice(20000);
		promotion.addDealers(dealer);
		promotion.save();
	}
}
