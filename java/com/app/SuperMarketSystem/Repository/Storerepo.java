package com.app.SuperMarketSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.SuperMarketSystem.model.Store;

import jakarta.transaction.Transactional;

public interface Storerepo extends JpaRepository<Store, Integer>{
	@Query(value="select * from supermarket where storeid=:s or storename=:sn",nativeQuery=true)
	public List<Store>Storeinfo(@Param("s")int storeid,@Param("sn")String storename);
	
	@Modifying
	@Transactional
	@Query(value="delete from supermarket where storeid=:s",nativeQuery=true)
	public int deleteStoreinfo(@Param("s")int storeid);
	
	@Modifying
	@Transactional
	@Query(value="update supermarket set storeid=?1 where storeid=12",nativeQuery=true)
	public int updateStoreinfo(int newstoreid, int oldstoreid);
}