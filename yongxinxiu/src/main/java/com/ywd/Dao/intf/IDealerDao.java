package com.ywd.Dao.intf;

import com.ywd.model.Dealer;

public interface IDealerDao {
	public Dealer findById(String id);
	
	public Dealer findByName(String name);
	
	public boolean saveOrUpdate(Dealer dealer);
}
