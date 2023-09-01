package com.app.SuperMarketSystem.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Purchase {
	@Id
	private int purchaseid;
	private String list;
	private int billcounter;
	private Date dateofbill;
	
	
	public Purchase() {
		super();
	}
	public Purchase(int purchaseid, String list, int billcounter, Date dateofbill) {
		super();
		this.purchaseid = purchaseid;
		this.list = list;
		this.billcounter = billcounter;
		this.dateofbill = dateofbill;
	}
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public int getBillcounter() {
		return billcounter;
	}
	public void setBillcounter(int billcounter) {
		this.billcounter = billcounter;
	}
	public Date getDateofbill() {
		return dateofbill;
	}
	public void setDateofbill(Date dateofbill) {
		this.dateofbill = dateofbill;
	}
	
}
	