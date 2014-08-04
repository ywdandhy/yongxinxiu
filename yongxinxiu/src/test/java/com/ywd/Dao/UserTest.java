package com.ywd.Dao;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
@Transactional
public class UserTest {
	@Autowired  
    private IUserService iUserService;
    
    @Test
    public void serverTest() throws Exception {
    	Assert.assertEquals("21", iUserService.queryById("12").getName());
    }
}
