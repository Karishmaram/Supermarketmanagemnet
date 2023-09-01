package com.app.SuperMarketSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	private int customerId;
	private String customerName;
	private String customeraddress;
	private long phoneno;
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customeraddress, long phoneno) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customeraddress = customeraddress;
		this.phoneno = phoneno;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	


}
