package com.ywd.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.ywd.Dao.intf.IPromotionDao;
import com.ywd.service.promotion.IPromotionService;
import com.ywd.util.springFactory.SpringFactory;

@Entity
@Table(name = "t_promotion")
public class Promotion {
	
	@Transient
	@Autowired
	IPromotionDao iPromotionDao;
	
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
	@ManyToMany(targetEntity = Dealer.class,fetch = FetchType.EAGER)
	Set<Dealer> lsDealers;
	
	/**创建时间*/
	@Temporal(TemporalType.TIMESTAMP)//不用set,hibernate会自动把当前时间写入  
    @Column(updatable = false, length = 20)  
    private Date createTime;
	
	/**更新时间*/
	@Temporal(TemporalType.TIMESTAMP)  
    private Date updateTime;
	
	private static IPromotionService repo() {
		return SpringFactory.getBean(IPromotionService.class);
	}
	
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
	public Set<Dealer> getLsDealers() {
		return lsDealers;
	}
	
	/**经销商*/
	public void setLsDealers(Set<Dealer> lsDealers) {
		this.lsDealers = lsDealers;
	}
	
	 /**
	  * 添加经销商
	  * @param dealer
	  */
	public void addDealers(Dealer dealer) {
		if (lsDealers == null) {
			lsDealers = new LinkedHashSet<>();
		}
		lsDealers.add(dealer);
	}
	/**创建时间*/
	public Date getCreateTime() {
		return createTime;
	}
	
	/**更新时间*/
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public boolean save() {
		return repo().save(this);
	}
	
	public static Promotion findInstance(String id) {
		return repo().findById(id);
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Promotion promotion = null;
		try {
			promotion = (Promotion)obj;
		} catch (Exception e) {
			return false;
		}
		return  this.id.equals(promotion.getId());
	}
}
