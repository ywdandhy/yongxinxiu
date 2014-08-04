package com.ywd.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/applicationContext.xml","file:WebContent/WEB-INF/spring-servlet.xml"})
@Transactional
public class UserTest {
	@Autowired  
    private WebApplicationContext wac;
    
    @Test
    public void serverTest() throws Exception {
        System.out.println(wac);
    }
}
