package com.ywd.Dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywd.Dao.intf.IPromotionDao;
import com.ywd.model.Promotion;

@Repository
public class PromotionDaoImpl implements IPromotionDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		// 事务必须是开启的，否则获取不到
		return sessionFactory.getCurrentSession();
	}
	public Promotion findById(String id) {
		Promotion promotion = (Promotion) getSession().get(Promotion.class, id);
		return promotion;
	}

	public List<Promotion> findByDealerId(String dealerId) {
		@SuppressWarnings("unchecked")
		List<Promotion>  lsPromotions = getSession().createCriteria(Promotion.class)
			.add(Restrictions.eq("lsDealerIds", dealerId))
			.addOrder(Order.asc("name"))
			.list();
		return lsPromotions;
	}
	
	public boolean save(Promotion promotion) {
		try {
			getSession().saveOrUpdate(promotion);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
