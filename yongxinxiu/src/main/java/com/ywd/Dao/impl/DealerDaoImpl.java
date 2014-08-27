package com.ywd.Dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.Dao.intf.IDealerDao;
import com.ywd.model.Dealer;

public class DealerDaoImpl implements IDealerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		// 事务必须是开启的，否则获取不到
		return sessionFactory.getCurrentSession();
	}
	
	public Dealer findById(int id) {
		Dealer dealer = (Dealer) getSession().get(Dealer.class, id);
		return dealer;
	}

	public Dealer findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
