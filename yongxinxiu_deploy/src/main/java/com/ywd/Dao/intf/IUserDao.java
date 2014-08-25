package com.ywd.Dao.intf;

import com.ywd.model.User;

public interface IUserDao {
	/**保存用户*/
	public void save(User user);
	/**根据Id查找*/
	public User queryById(String id);
	
	/**
	 * 根据用户名查找
	 * @param username
	 * @return
	 */
	public User queryByUserName(String username);
	
	/**根据手机查询*/
	public User queryByMobile(String mobile);
	
	/**保存或者更新用户，有主键就更新，没有就插入*/
	public void saveOrUpdate(User user);
	
	/**删除用户*/
	public void delete(User user);
	
	
}
