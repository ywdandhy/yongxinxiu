package com.ywd.model;

import java.io.File;
import java.net.URISyntaxException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.Dao.intf.IUserDao;

@Entity
@Table(name = "t_user")
public class User {
	
	@Transient
	@Autowired
	IUserDao iUserDao;

	/** 主键 */
	@Id
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

	public static void main(String[] args) throws URISyntaxException {
		String path = User.class.getClassLoader().getResource("").toURI().getPath();
		System.out.println(path);
		User user = new User();
		user.setName("杨维达");
		user.setUsername("yangweida");
		user.setPassword("yangweida");
		File f=new File(path + "WEB-INF/applicationContext.xml");
		Configuration configuration = new AnnotationConfiguration().addCacheableFile(f);
		SessionFactory sf = configuration.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
