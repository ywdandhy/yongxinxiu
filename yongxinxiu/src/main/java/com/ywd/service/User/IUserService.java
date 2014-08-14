package com.ywd.service.User;

import com.ywd.model.User;


public interface IUserService  {
	/**保存用户*/
	public void save(User user);
	
	/**根据ID查询用户*/
	public User queryById(String id);
	
	/**根据手机查询*/
	public User queryByMobile(String mobile);
}
