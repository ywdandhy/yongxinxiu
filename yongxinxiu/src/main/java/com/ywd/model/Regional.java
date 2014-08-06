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
	@Column
	String name;
	@Column
	String level;
	@Column
	int father;
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
	public String getLevel() {
		return level;
	}
	/** 等级*/
	public void setLevel(String lever) {
		this.level = lever;
	}
	/** 上级区域编码*/
	public int getFather() {
		return father;
	}
	/** 上级区域编码*/
	public void setFather(int father) {
		this.father = father;
	}
	
	
	
}
