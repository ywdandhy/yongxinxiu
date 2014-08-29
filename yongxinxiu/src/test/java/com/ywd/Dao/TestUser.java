package com.ywd.Dao;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.model.User;
import com.ywd.service.User.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
//@Transactional
public class TestUser {
	@Autowired  
    private IUserService iUserService;
    
	
	
//    @Test
    public void queryTest() throws Exception {
    	Assert.assertEquals("yangweida", iUserService.queryById("123").getUsername());
    }
    
    @Test
    public void registTest() {
    	User user = new User();
//    	user.setId("12323");
    	user.setMobile("13916348231");
    	user.setName("mie3434mie");
    	user.setPassword("123456");
    	user.setUsername(user.getMobile());
    	user.saveOrUpdate();
	}
    
//    @Test
//    @Transactional
    public void findInstance() {
		User user =  User.findInstance("40289749481ab7a401481ab84bcf0000");
		Assert.assertEquals("杨维达", user.getName());
	}
    
}
