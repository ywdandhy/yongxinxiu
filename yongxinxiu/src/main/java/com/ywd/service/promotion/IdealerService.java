package com.ywd.service.promotion;

import com.ywd.model.Dealer;

public interface IdealerService {
	public Dealer findById(int id);
	
	public Dealer findByName(String name);
}
