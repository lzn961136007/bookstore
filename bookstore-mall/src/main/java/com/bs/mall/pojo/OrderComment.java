package com.bs.mall.pojo;

public class OrderComment {
	private Integer primaryId;
	private String orderId;
	private Integer userId;
	private String orderCommentContent;
	private Integer orderCommentSpScore;
	private Integer orderCommentFwScore;
	private Integer orderCommentWlScore;
	private String orderCommentCreatetime;
	private Double totalPrice;
	public Integer getPrimaryId() {
		return primaryId;
	}
	public void setPrimaryId(Integer primaryId) {
		this.primaryId = primaryId;
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
	public String getOrderCommentContent() {
		return orderCommentContent;
	}
	public void setOrderCommentContent(String orderCommentContent) {
		this.orderCommentContent = orderCommentContent;
	}

	public Integer getOrderCommentSpScore() {
		return orderCommentSpScore;
	}
	public void setOrderCommentSpScore(Integer orderCommentSpScore) {
		this.orderCommentSpScore = orderCommentSpScore;
	}
	public Integer getOrderCommentFwScore() {
		return orderCommentFwScore;
	}
	public void setOrderCommentFwScore(Integer orderCommentFwScore) {
		this.orderCommentFwScore = orderCommentFwScore;
	}
	public Integer getOrderCommentWlScore() {
		return orderCommentWlScore;
	}
	public void setOrderCommentWlScore(Integer orderCommentWlScore) {
		this.orderCommentWlScore = orderCommentWlScore;
	}
	public String getOrderCommentCreatetime() {
		return orderCommentCreatetime;
	}
	public void setOrderCommentCreatetime(String orderCommentCreatetime) {
		this.orderCommentCreatetime = orderCommentCreatetime;
	}
	
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "OrderComment [primaryId=" + primaryId + ", orderId=" + orderId + ", userId=" + userId
				+ ", orderCommentContent=" + orderCommentContent + ", orderCommentSpScore=" + orderCommentSpScore
				+ ", orderCommentFwScore=" + orderCommentFwScore + ", orderCommentWlScore=" + orderCommentWlScore
				+ ", orderCommentCreatetime=" + orderCommentCreatetime + ", totalPrice=" + totalPrice + "]";
	}
}	
