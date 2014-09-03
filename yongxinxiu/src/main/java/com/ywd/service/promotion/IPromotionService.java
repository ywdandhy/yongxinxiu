package com.ywd.service.promotion;

import java.util.List;

import com.ywd.model.Promotion;

public interface IPromotionService {
	public Promotion findById(String id);
	
	public List<Promotion> findByDealerId(String dealerId);
	
	public boolean save(Promotion promotion);
	
	public List<Promotion> findPromotionList();
}
