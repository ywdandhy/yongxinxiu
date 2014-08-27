package com.ywd.service.promotion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywd.Dao.intf.IPromotionDao;
import com.ywd.model.Promotion;

@Service
public class PromotionServiceImpl implements IPromotionService{

	@Autowired
	IPromotionDao iPromotionDao;
	
	public Promotion findById(int id) {
		return iPromotionDao.findById(id);
	}

	public List<Promotion> findByDealerId(String dealerId) {
		return iPromotionDao.findByDealerId(dealerId);
	}
	
}
