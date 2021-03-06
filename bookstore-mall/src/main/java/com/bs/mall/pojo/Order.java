package com.bs.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String orderId;
	private Integer userId;
	private Integer bookId;
	private String bookName;
	private String bookProfile;
	private String bookCoverImage;
	private double bookSalesPrice;
	private Integer orderStatus;
	private String totalPrivce;
	private String bookNum;
	private List<Author> bookAuthor = new ArrayList<Author>();
	
	
	
	public List<Author> getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(List<Author> bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookProfile() {
		return bookProfile;
	}

	public void setBookProfile(String bookProfile) {
		this.bookProfile = bookProfile;
	}

	public String getBookCoverImage() {
		return bookCoverImage;
	}

	public void setBookCoverImage(String bookCoverImage) {
		this.bookCoverImage = bookCoverImage;
	}

	public double getBookSalesPrice() {
		return bookSalesPrice;
	}

	public void setBookSalesPrice(double bookSalesPrice) {
		this.bookSalesPrice = bookSalesPrice;
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

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getTotalPrivce() {
		return totalPrivce;
	}

	public void setTotalPrivce(String totalPrivce) {
		this.totalPrivce = totalPrivce;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public Order(String orderId, Integer userId, Integer bookId, String bookName, String bookProfile,
			String bookCoverImage, double bookSalesPrice, Integer orderStatus, String totalPrivce, String bookNum,
			List<Author> bookAuthor) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookProfile = bookProfile;
		this.bookCoverImage = bookCoverImage;
		this.bookSalesPrice = bookSalesPrice;
		this.orderStatus = orderStatus;
		this.totalPrivce = totalPrivce;
		this.bookNum = bookNum;
		this.bookAuthor = bookAuthor;
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", bookId=" + bookId + ", bookName=" + bookName
				+ ", bookProfile=" + bookProfile + ", bookCoverImage=" + bookCoverImage + ", bookSalesPrice="
				+ bookSalesPrice + ", orderStatus=" + orderStatus + ", totalPrivce=" + totalPrivce + ", bookNum="
				+ bookNum + ", bookAuthor=" + bookAuthor + "]";
	}



}
