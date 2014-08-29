package com.ywd.service.promotion;

import com.ywd.model.Dealer;

public interface IdealerService {
	public Dealer findById(String id);
	
	public Dealer findByName(String name);
	
	public boolean save(Dealer dealer);
}
