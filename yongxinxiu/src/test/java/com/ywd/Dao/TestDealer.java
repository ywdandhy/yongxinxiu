package com.ywd.Dao;

import org.hibernate.sql.Update;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
@Transactional
public class TestDealer {
	
	@Test
	private void Update() {
		// TODO Auto-generated method stub

	}
	
}
