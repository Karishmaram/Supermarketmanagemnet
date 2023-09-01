package com.app.SuperMarketSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SuperMarketSystem.model.Customer;

public interface Customerrepo extends JpaRepository<Customer, Integer> {

}
