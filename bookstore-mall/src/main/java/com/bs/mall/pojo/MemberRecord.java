package com.bs.mall.pojo;

public class MemberRecord {
	private Integer userId;
	private Integer memberId;
	private String userName;
	private String memberName;
	private Double memberMoney;
	private String createTime;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Double getMemberMoney() {
		return memberMoney;
	}
	public void setMemberMoney(Double memberMoney) {
		this.memberMoney = memberMoney;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
