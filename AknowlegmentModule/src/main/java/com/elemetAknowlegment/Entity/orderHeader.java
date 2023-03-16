package com.elemetAknowlegment.Entity;

import java.time.LocalDate;

public class orderHeader {
	
	private int ordId;
	private String userName;
	private String userMobileNo;
	private String purchaseOrdNo;
	private LocalDate purchaseOrdDate;
	
	
	@Override
	public String toString() {
		return "orderHeader [ordId=" + ordId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", purchaseOrdNo=" + purchaseOrdNo + ", purchaseOrdDate=" + purchaseOrdDate + ", orderitems="
				+ orderitems + ", address=" + address + "]";
	}
	private orderItems orderitems;
	private address address;
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getPurchaseOrdNo() {
		return purchaseOrdNo;
	}
	public void setPurchaseOrdNo(String purchaseOrdNo) {
		this.purchaseOrdNo = purchaseOrdNo;
	}
	public LocalDate getPurchaseOrdDate() {
		return purchaseOrdDate;
	}
	public void setPurchaseOrdDate(LocalDate purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}
	public orderItems getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(orderItems orderitems) {
		this.orderitems = orderitems;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public orderHeader(int ordId, String userName, String userMobileNo, String purchaseOrdNo, LocalDate purchaseOrdDate,
			orderItems orderitems, com.elemetAknowlegment.Entity.address address) {
		super();
		this.ordId = ordId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.purchaseOrdNo = purchaseOrdNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderitems = orderitems;
		this.address = address;
	}

}
