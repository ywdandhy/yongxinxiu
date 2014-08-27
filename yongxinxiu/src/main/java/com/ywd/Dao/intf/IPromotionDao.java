package com.ywd.Dao.intf;

import java.util.List;

import com.ywd.model.Promotion;

public interface IPromotionDao {
	public Promotion findById(int id);
	
	public List<Promotion> findByDealerId(String dealerId);
}
