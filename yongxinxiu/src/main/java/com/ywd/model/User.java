package com.ywd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.base.intf.IModelBase;
import com.ywd.util.springFactory.SpringFactory;

@Entity
@Table(name = "t_user")
public class User implements IModelBase {
	
	@Transient
	@Autowired
	IUserDao iUserDao;
	
	
	/** 主键 */
	
	@Id
	@GenericGenerator(name="systemUUID",strategy="uuid")
	@GeneratedValue(generator="systemUUID")
	String id;

	/** 用户名 */
	@Column(name = "username")
	String username;
	/** 密码 */
	@Column(name = "password")
	String password;
	/** 姓名 */
	@Column(name = "name")
	String name;

	/** 手机 */
	@Column(name = "mobile")
	String mobile;
	
	/** 性别 */
	@Column(name = "sex")
	String sex;
	
	
	/** 主键 */
	public String getId() {
		return id;
	}

	/** 主键 */
	public void setId(String id) {
		this.id = id;
	}

	
	
	/** 用户名 */
	public String getUsername() {
		return username;
	}

	/** 用户名 */
	public void setUsername(String userName) {
		this.username = userName;
	}

	/** 密码 */
	public String getPassword() {
		return password;
	}

	/** 密码 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 姓名 */
	public String getName() {
		return name;
	}

	/** 姓名 */
	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		iUserDao.save(this);
	}
	
	private static IUserDao repo() {
		return SpringFactory.getBean(IUserDao.class);
	}

	/**
	 * 保存或者更新，如果有主键那就更新，没有就插入
	 */
	public void saveOrUpdate() {
		iUserDao.saveOrUpdate(this);
		
	}

	/**
	 * 根据id查询一个实例
	 * @param id
	 * @return
	 */
	public static User findInstance(String id) {
		return repo().queryById(id);
	}

	/**
	 * 删除记录
	 */
	public void delete() {
		repo().delete(this);
	}
	


}
