package com.ywd.Dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.model.Regional;
import com.ywd.service.Regional.IRegionalService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
@Transactional
public class TestRegional {
	
	@Autowired
	IRegionalService regionalService;
	
	@Test
	public void findById() {
		Regional regional = regionalService.findById(320000);
		Assert.assertEquals("江苏省", regional.getName());
	}
	
	@Test
	public void findByFatherId(){
		List<Regional> lsRegionals = regionalService.findByFatherId("320000");
		for (Regional regional : lsRegionals) {
			System.out.println(regional.getName());
		}
	}
	
}
