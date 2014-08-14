package com.ywd.service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;
@Transactional
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDao iUserDao;
	public void save(User user) {
		iUserDao.save(user);
	}
	public User queryById(String id) {
		return iUserDao.queryById(id);
	}
	public User queryByMobile(String mobile) {
		return iUserDao.queryByMobile(mobile);
	}
	
	

}
