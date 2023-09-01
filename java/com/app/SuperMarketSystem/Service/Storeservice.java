package com.app.SuperMarketSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.SuperMarketSystem.Repository.Storerepo;

import com.app.SuperMarketSystem.model.Store;


@Service
public class Storeservice {
	@Autowired
	Storerepo sr;
	
	public Store addinfo(Store s){
		return sr.save(s);
	}
	public List<Store> showinfo(){
		return sr.findAll();
	}
	public Store updateinfo(Store s) {
		return sr.saveAndFlush(s);
	}
	public void del(Store s) {
		sr.delete(s);
		
	}
	public Store addEmp(Store s){
		return sr.save(s);
	}
	public List<Store> showEmp(){
		return sr.findAll();
 }
	public List <Store> storeinfo(String s){
		return sr.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	public List<Store> storeEmp(int pgno,int pgsize,String s){
		 Page<Store> p=sr.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s)));
		 return p.getContent()	;
		 }
	public List<Store> Storeinfo(int storeid,String s){
		return sr.Storeinfo(storeid, s);
	}
	public int deleteStore(int storeid) {
		return sr.deleteStoreinfo(storeid);
	}
	public int updateStore(int storeid,int storeid1){
		return sr.updateStoreinfo(storeid, storeid1);
	}
	
}
