package com.ywd.service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;
import com.ywd.util.other.MD5Util;
import com.ywd.util.other.ReturnObj;
import com.ywd.util.validate.Validate;

@Service
public class UserServiceImpl implements IUserService {
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
		if (null != queryByMobile(user.getUsername())) {
			return new ReturnObj(false, "手机已经注册过了");
		}
		// 密码进行md5加密后保存数据库
		String passwordMd5 = MD5Util.getMD5Str(user.getPassword());
		user.setPassword(passwordMd5);
		iUserDao.save(user);
		return new ReturnObj(true, "注册成功",user);
	}
	
	public ReturnObj login(String userName , String password) {
		User user = iUserDao.queryByUserName(userName);
		if (null == user) {
			return new ReturnObj(false, "用户名或者密码错误", user);
		}
		String passwordMD5 = MD5Util.getMD5Str(password);
		if (passwordMD5.equals(user.getPassword())) {
			return new ReturnObj(true, "登陆成功", user);
		}else {
			return new ReturnObj(false, "用户名或者密码错误", user);
		}
	}

}
