package com.ywd.Dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywd.Dao.intf.IRegionalDao;
import com.ywd.model.Regional;

@Repository
public class RegionalDaoImpl implements IRegionalDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public Session getSession() {
        //事务必须是开启的，否则获取不到  
        return sessionFactory.getCurrentSession();  
    }
	/**根据id查找*/
	public Regional findById(int id) {
		Regional regional = (Regional) getSession().get(Regional.class, id);
		return regional;
	}

	/**根据父节点关联查询子节点*/
	public List<Regional> findByFatherId(String fatherId) {
		@SuppressWarnings("unchecked")
		List<Regional>  lsRegionals = getSession().createCriteria(Regional.class)
			.add(Restrictions.eq("fatherId", Integer.parseInt(fatherId)))
			.addOrder(Order.asc("name"))
			.list();
		return lsRegionals;
	}
	/**根据name查询*/
	public Regional findByName(String name) {
		Regional regional = (Regional) getSession().createCriteria(Regional.class)
		.add(Restrictions.eq("name", name));
		return regional;
	}

}
