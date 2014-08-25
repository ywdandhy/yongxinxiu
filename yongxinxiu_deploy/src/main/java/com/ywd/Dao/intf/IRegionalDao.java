package com.ywd.Dao.intf;


import java.util.List;

import com.ywd.model.Regional;

public interface IRegionalDao {
	public Regional findById(int id);
	
	public Regional findByName(String name);
	
	public List<Regional> findByFatherId(String fatherId);
}
