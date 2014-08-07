package com.ywd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regional")
public class Regional {
	
	@Id
	int id;
	@Column(name = "name")
	String name;
	@Column(name = "level")
	int level;
	@Column(name = "fatherId")
	int fatherId;
	/** 区域编码*/
	public int getId() {
		return id;
	}
	/** 区域编码*/
	public void setId(int id) {
		this.id = id;
	}
	/** 名称*/
	public String getName() {
		return name;
	}
	/** 名称*/
	public void setName(String name) {
		this.name = name;
	}
	/** 等级*/
	public int getLevel() {
		return level;
	}
	/** 等级*/
	public void setLevel(int lever) {
		this.level = lever;
	}
	/** 上级区域编码*/
	public int getFatherId() {
		return fatherId;
	}
	/** 上级区域编码*/
	public void setFatherId(int fatherId) {
		this.fatherId = fatherId;
	}
	
	
	
	
}
