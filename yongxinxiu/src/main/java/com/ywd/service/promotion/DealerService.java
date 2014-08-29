package com.ywd.service.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywd.Dao.intf.IDealerDao;
import com.ywd.model.Dealer;

@Service
public class DealerService implements IdealerService{
	@Autowired
	IDealerDao dealerDao;
	public Dealer findById(String id) {
		return dealerDao.findById(id);
	}

	public Dealer findByName(String name) {
		return dealerDao.findByName(name);
	}


	public boolean save(Dealer dealer) {
		boolean isSuccess = dealerDao.saveOrUpdate(dealer);
		return isSuccess;
	}
	
}
