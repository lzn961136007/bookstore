package com.bs.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetail {

	private Integer expressId;
	private Integer expressNumbers;
	private String expressName;
	private double expressCost;
	private String expressStatus;

	private Integer addressId;
	private String addressMobile;
	private String addressConsignee;
	private String addressProvince;
	private String addressCity;
	private String addressCounty;
	private String addressDetail;

	private String orderId;
	private Integer userId;
	private List<Book> books = new ArrayList<Book>();

	private String orderTime;
	private Integer orderStatus;
	private String totalPrice;


	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public Integer getExpressNumbers() {
		return expressNumbers;
	}

	public void setExpressNumbers(Integer expressNumbers) {
		this.expressNumbers = expressNumbers;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public double getExpressCost() {
		return expressCost;
	}

	public void setExpressCost(double expressCost) {
		this.expressCost = expressCost;
	}

	public String getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(String expressStatus) {
		this.expressStatus = expressStatus;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressMobile() {
		return addressMobile;
	}

	public void setAddressMobile(String addressMobile) {
		this.addressMobile = addressMobile;
	}

	public String getAddressConsignee() {
		return addressConsignee;
	}

	public void setAddressConsignee(String addressConsignee) {
		this.addressConsignee = addressConsignee;
	}

	public String getAddressProvince() {
		return addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressCounty() {
		return addressCounty;
	}

	public void setAddressCounty(String addressCounty) {
		this.addressCounty = addressCounty;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrivce(String totalPrice) {
		this.totalPrice = totalPrice;
	}



	public OrderDetail(Integer expressId, Integer expressNumbers, String expressName, double expressCost,
			String expressStatus, Integer addressId, String addressMobile, String addressConsignee,
			String addressProvince, String addressCity, String addressCounty, String addressDetail, String orderId,
			Integer userId,List<Book> books, String orderTime, Integer orderStatus, String totalPrice,
			String bookNum) {
		super();
		this.expressId = expressId;
		this.expressNumbers = expressNumbers;
		this.expressName = expressName;
		this.expressCost = expressCost;
		this.expressStatus = expressStatus;
		this.addressId = addressId;
		this.addressMobile = addressMobile;
		this.addressConsignee = addressConsignee;
		this.addressProvince = addressProvince;
		this.addressCity = addressCity;
		this.addressCounty = addressCounty;
		this.addressDetail = addressDetail;
		this.orderId = orderId;
		this.userId = userId;

		this.books = books;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
		this.totalPrice = totalPrice;

	}

	public OrderDetail() {
		super();
	}

	@Override
	public String toString() {
		return "orderDetail [expressId=" + expressId + ", expressNumbers=" + expressNumbers + ", expressName="
				+ expressName + ", expressCost=" + expressCost + ", expressStatus=" + expressStatus + ", addressId="
				+ addressId + ", addressMobile=" + addressMobile + ", addressConsignee=" + addressConsignee
				+ ", addressProvince=" + addressProvince + ", addressCity=" + addressCity + ", addressCounty="
				+ addressCounty + ", addressDetail=" + addressDetail + ", orderId=" + orderId + ", userId=" + userId
				+ ", books=" + books + ", orderTime=" + orderTime + ", orderStatus="
				+ orderStatus + ", totalPrice=" + totalPrice + "]";
	}

}
