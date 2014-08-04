package com.ywd.Dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ywd.Dao.intf.IUserDao;
import com.ywd.model.User;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {

	@Autowired
    private SessionFactory sessionFactory;  
   
    public Session getSession() {
        //事务必须是开启的，否则获取不到  
        return sessionFactory.getCurrentSession();  
    }
    
    @Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)   
    {   
        super.setSessionFactory(sessionFactory);   
    } 
	
	public void save(User user) {
		getSession().save(user);
	}

	public User queryById(String id) {
		return (User) getSession().get(User.class, id);
	}

}
