package com.bs.mall.pojo;

import java.util.Date;

public class Coupon {
	private Integer couponId;
	private String couponName;
	private Integer couponMoney;
	private Integer couponNum;
	private Date couponStart;
	private Date couponEnd;
	private Integer couponRemainNum;
	public Integer getCouponId() {
		return couponId;
	}
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public Integer getCouponNum() {
		return couponNum;
	}
	public Integer getCouponMoney() {
		return couponMoney;
	}
	public void setCouponMoney(Integer couponMoney) {
		this.couponMoney = couponMoney;
	}
	public void setCouponNum(Integer couponNum) {
		this.couponNum = couponNum;
	}
	public Date getCouponStart() {
		return couponStart;
	}
	public void setCouponStart(Date couponStart) {
		this.couponStart = couponStart;
	}
	public Date getCouponEnd() {
		return couponEnd;
	}
	public void setCouponEnd(Date couponEnd) {
		this.couponEnd = couponEnd;
	}
	public Integer getCouponRemainNum() {
		return couponRemainNum;
	}
	public void setCouponRemainNum(Integer couponRemainNum) {
		this.couponRemainNum = couponRemainNum;
	}
	
}
