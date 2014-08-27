package com.ywd.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_promotion")
public class Promotion {
	@Id
	@GenericGenerator(name="systemUUID",strategy="uuid")
	@GeneratedValue(generator="systemUUID")
	String id;
	
	/**标题*/
	String title;
	
	/**描述*/
	String description;
	
	/**原价*/
	double originalPrice;
	
	/**现价*/
	double nowPrice;
	
	/**数量,配额*/
	int allNumber;
	
	/**剩余数量*/
	int nowNumber;
	
	/**是否需要申请*/
	boolean needApply;
	
	/**图片url地址*/
	String imageUrl;
	
	
	/**经销商*/
	List<String> lsDealerIds;
	
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
	/**标题*/
	public String getTitle() {
		return title;
	}
	/**标题*/
	public void setTitle(String title) {
		this.title = title;
	}
	/**描述*/
	public String getDescription() {
		return description;
	}
	/**描述*/
	public void setDescription(String description) {
		this.description = description;
	}
	/**原价*/
	public double getOriginalPrice() {
		return originalPrice;
	}
	/**原价*/
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	/**现价*/
	public double getNowPrice() {
		return nowPrice;
	}
	/**现价*/
	public void setNowPrice(double nowPrice) {
		this.nowPrice = nowPrice;
	}
	/**总配额*/
	public int getAllNumber() {
		return allNumber;
	}
	/**总配额*/
	public void setAllNumber(int allNumber) {
		this.allNumber = allNumber;
	}
	/**现配额*/
	public int getNowNumber() {
		return nowNumber;
	}
	/**现配额*/
	public void setNowNumber(int nowNumber) {
		this.nowNumber = nowNumber;
	}
	/**是否需要申请*/
	public boolean isNeedApply() {
		return needApply;
	}
	/**是否需要申请*/
	public void setNeedApply(boolean needApply) {
		this.needApply = needApply;
	}
	/**图片地址*/
	public String getImageUrl() {
		return imageUrl;
	}
	/**图片地址*/
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**经销商*/
	public List<String> getLsDealerIds() {
		return lsDealerIds;
	}
	/**经销商*/
	public void setLsDealerIds(List<String> lsDealerIds) {
		this.lsDealerIds = lsDealerIds;
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
	
	
	
}
