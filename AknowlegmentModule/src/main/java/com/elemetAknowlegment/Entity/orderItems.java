package com.elemetAknowlegment.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class orderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orditemId;
	private int productNo;
	private String productName;
	private String productQuantity;
	private String productPrice;
	public int getOrditemId() {
		return orditemId;
	}
	public void setOrditemId(int orditemId) {
		this.orditemId = orditemId;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "orderItems [orditemId=" + orditemId + ", productNo=" + productNo + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}
	public orderItems(int orditemId, int productNo, String productName, String productQuantity, String productPrice) {
		super();
		this.orditemId = orditemId;
		this.productNo = productNo;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	
	

}
