package com.app.SuperMarketSystem.model;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="supermarket")
public class Store {
	@Id

	private int storeid;
	private String storename;
	private String storeaddress;
	private String list;
	private int amount;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="custId",referencedColumnName = "storeid")
	private List<Customer> sc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="puId")
	private List<Purchase> pr;
	

	public Store() {
		super();
	}

	public Store(int storeid, String storename, String storeaddress, String list, int amount) {
		super();
		this.storeid = storeid;
		this.storename = storename;
		this.storeaddress = storeaddress;
		this.list = list;
		this.amount = amount;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStoreaddress() {
		return storeaddress;
	}

	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Customer> getSc() {
		return sc;
	}

	public void setSc(List<Customer> sc) {
		this.sc = sc;
	}

	public List<Purchase> getPr() {
		return pr;
	}

	public void setPr(List<Purchase> pr) {
		this.pr = pr;
	}
	
}
	
