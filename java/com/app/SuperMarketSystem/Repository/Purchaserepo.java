package com.app.SuperMarketSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SuperMarketSystem.model.Purchase;

public interface Purchaserepo  extends JpaRepository<Purchase,Integer>{

}
