package com.ywd.service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;
import com.ywd.util.other.MD5Util;
import com.ywd.util.other.ReturnObj;
import com.ywd.util.validate.Validate;
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
	public ReturnObj registUser(User user) {
		if (!Validate.isMobile(user.getUsername())) {
			return new ReturnObj(false, "手机格式不正确");
		}
		//密码进行md5加密后保存数据库
		try {
			String passwordMd5 = MD5Util.getMD5Str(user.getPassword());
			user.setPassword(passwordMd5);
			iUserDao.saveOrUpdate(user);
		} catch (Exception e) {
			return new ReturnObj(false, "失败,请重试");
		}
		return new ReturnObj(true, "注册成功");
	}
	
	

}
