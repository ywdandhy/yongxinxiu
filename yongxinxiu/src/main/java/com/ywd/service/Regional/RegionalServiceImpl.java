package com.ywd.service.Regional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywd.Dao.intf.IRegionalDao;
import com.ywd.model.Regional;
//@Transactional
@Service
public class RegionalServiceImpl implements IRegionalService{
	@Autowired
	IRegionalDao regionalDao;
	
	public Regional findById(int id) {
		return regionalDao.findById(id);
	}

	public Regional findByName(String name) {
		return regionalDao.findByName(name);
	}

	public List<Regional> findByFatherId(String id) {
		return regionalDao.findByFatherId(id);
	}
	
}
