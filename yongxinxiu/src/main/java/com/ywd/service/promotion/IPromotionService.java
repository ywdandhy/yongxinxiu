package com.ywd.service.promotion;

import java.util.List;

import com.ywd.model.Promotion;

public interface IPromotionService {
	public Promotion findById(int id);
	
	public List<Promotion> findByDealerId(String dealerId);
}
