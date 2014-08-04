package com.ywd.Dao.intf;

import com.ywd.model.User;

public interface IUserDao {
	/**保存用户*/
	public void save(User user);
	/**根据Id查找*/
	public User queryById(String id);
}
