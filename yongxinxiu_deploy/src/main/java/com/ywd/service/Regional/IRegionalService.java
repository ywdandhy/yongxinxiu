package com.ywd.service.Regional;
import java.util.List;

import com.ywd.model.Regional;

public interface IRegionalService {
	
	/**
	 * 根据id查询区域
	 * @return 区域
	 */
	Regional findById(int id);
	
	/**
	 * 根据名称查询区域
	 * @param name
	 * @return 区域
	 */
	Regional findByName(String name);
	
	/**
	 * 根据父id查找子区域
	 * @return 区域
	 */
	List<Regional> findByFatherId(String id);
	
	

}
