package com.app.SuperMarketSystem.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.SuperMarketSystem.Service.Storeservice;
import com.app.SuperMarketSystem.model.Store;

@RestController
@CrossOrigin("*")
public class Storecontroller1 {
	
	
  private  final static Logger logger =LoggerFactory.getLogger(Storecontroller1.class);
  
@Autowired
	Storeservice ss;
	
	@PostMapping("/addEmp")
	public Store details( @RequestBody Store s) {
		return ss.addinfo(s);
 }
	@GetMapping("show")
	public List<Store> showdetails(){
		System.out.println("Soap");
		  logger.info("thid uhrbf");
		  logger.debug("debug");
		  logger.warn("warn");
		  logger.error("error");
		  
				  
		return ss.showinfo();
	}
	@PutMapping("update")
	public Store updatedetails(@RequestBody Store s){
		return ss.updateinfo(s);
	}
	@DeleteMapping("delete")
	public String delete( Store s) {
		ss.del(s);
		return "successfull";
	}
	
	
	
	@PostMapping("/addmap")
	public Store detailsCust( @RequestBody Store s) {
		return ss.addEmp(s);
	}
	@GetMapping("showmap")
	public List<Store> showCust(){
		return ss.showEmp();
	}
	@GetMapping("showsort/{storename}")
	public List <Store> storedetails(@PathVariable String storename){
		return ss.storeinfo(storename);
	}
	@GetMapping("showpage/{pgno}/{pgsize}/{storename}")
	public List<Store> storeinfo(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String storename ){
		return ss.storeEmp(pgno, pgsize, storename);
		
	}
	@GetMapping("showquery/{storeid}/{storename}")
	public List<Store> showdetails(@PathVariable int storeid,@PathVariable String storename){
		return ss.Storeinfo(storeid,storename);
	}
	@DeleteMapping("deletequery/{storeid}")
	public String deleteStore(@PathVariable int storeid) {
		return ss.deleteStore(storeid)+"DELETED";
	}
	@PutMapping("updatequery/{newstoreid}/{oldstoreid}")
	public String updateStore(@PathVariable int newstoreid,@PathVariable int oldstoreid) {
		return ss.updateStore(newstoreid, oldstoreid)+"UPDATED";
	}
	
}
