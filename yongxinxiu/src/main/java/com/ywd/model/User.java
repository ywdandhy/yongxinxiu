package com.ywd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.base.intf.IModelBase;
import com.ywd.service.User.IUserService;
import com.ywd.util.springFactory.SpringFactory;

@Entity
@Table(name = "t_user")
public class User implements IModelBase {
	
	@Transient
	@Autowired
	IUserService iUserService;
	
	
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
	
	/**是否是经销商*/
	@Column(name = "isDealer")
	boolean isDealer;
	
	/**当前用户是否有效*/
	@Column(name = "isEnable")
	boolean isEnable;
	
	/**创建时间*/
	@Temporal(TemporalType.TIMESTAMP)//不用set,hibernate会自动把当前时间写入  
    @Column(updatable = false, length = 20)  
    private Date createTime;
	
	/**更新时间*/
	@Temporal(TemporalType.TIMESTAMP)  
    private Date updateTime;
	
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
	

	/**
	 *    手机
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 *    手机
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 性别
	 * @return
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性别
	 * @return
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	/**
	 * 是否是经销商
	 * @return
	 */
	public boolean isDealer() {
		return isDealer;
	}

	/**
	 * 是否是经销商
	 */
	public void setDealer(boolean isDealer) {
		this.isDealer = isDealer;
	}

	/**
	 * 是否有效
	 */
	public boolean isEnable() {
		return isEnable;
	}

	/**
	 * 是否有效
	 */
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	
	private static IUserService repo() {
		return SpringFactory.getBean(IUserService.class);
	}

	/**
	 * 保存或者更新，如果有主键那就更新，没有就插入
	 */
	public void saveOrUpdate() {
		repo().save(this);
		
	}

	/**
	 * 根据id查询一个实例
	 * @param id
	 * @return
	 */
	public static User findInstance(String id) {
		return repo().queryById(id);
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	
	


}
