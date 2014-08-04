package com.ywd.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:WEB-INF/applicationContext.xml")
@Transactional
public class UserTest {
	@Autowired
	IUserDao  iUserDao;
	
	@Test
	public void test1(){	
		User user = new User();
		user.setName("杨维达");
		user.setUsername("yangweida");
		user.setPassword("yangweida");
		iUserDao.save(user);
	}
}
