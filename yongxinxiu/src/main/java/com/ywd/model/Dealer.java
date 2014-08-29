package com.ywd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.Dao.intf.IDealerDao;
import com.ywd.service.promotion.IdealerService;
import com.ywd.util.springFactory.SpringFactory;

/**
 * 经销商
 * @author ywd
 *
 */
@Entity
@Table(name = "t_Dealer")
public class Dealer {
	
	@Transient
	@Autowired
	IDealerDao iDealerDao;
	
	/** 主键 */
	@Id
	@GenericGenerator(name="systemUUID",strategy="uuid")
	@GeneratedValue(generator="systemUUID")
	String id;
	
	/**经销商名称*/
	String name;
	
	/**经销商图片*/
	String imageUrl;
	
	/**经销商简介*/
	String description;
	
	/**经销商地址*/
	String address;
	
	/**经销商电话*/
	String phone;
	
	/**创建时间*/
	@Temporal(TemporalType.TIMESTAMP)//不用set,hibernate会自动把当前时间写入  
    @Column(updatable = false, length = 20)  
    private Date createTime;
	
	/**更新时间*/
	@Temporal(TemporalType.TIMESTAMP)  
    private Date updateTime;

	/**主键*/
	public String getId() {
		return id;
	}
	/**主键*/
	public void setId(String id) {
		this.id = id;
	}
	/**经销商名称*/
	public String getName() {
		return name;
	}
	/**经销商名称*/
	public void setName(String name) {
		this.name = name;
	}
	/**图片地址*/
	public String getImageUrl() {
		return imageUrl;
	}
	/**图片地址*/
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**简介*/
	public String getDescription() {
		return description;
	}
	/**简介*/
	public void setDescription(String description) {
		this.description = description;
	}
	/**地址*/
	public String getAddress() {
		return address;
	}
	/**地址*/
	public void setAddress(String address) {
		this.address = address;
	}
	/**电话*/
	public String getPhone() {
		return phone;
	}
	/**电话*/
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**创建时间*/
	public Date getCreateTime() {
		return createTime;
	}
	/**创建时间*/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**更新时间*/
	public Date getUpdateTime() {
		return updateTime;
	}
	/**更新时间*/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	private static IdealerService repo() {
		return SpringFactory.getBean(IdealerService.class);
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Dealer dealer = null;
		try {
			dealer = (Dealer)obj;
		} catch (Exception e) {
			return false;
		}
		return  this.id.equals(dealer.getId());
	}
	
	/**
	 * 保存自己
	 * @return
	 */
	public boolean save() {
		return repo().save(this);
	}
	
	public static Dealer findInstance(String id) {
		return repo().findById(id);
	}
	
}
