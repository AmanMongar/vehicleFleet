package com.fleet.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepo extends JpaRepository<TravelHistory, Integer>{
	@Query(value = "SELECT * FROM travel_history_db u WHERE u.request = ?1 AND u.status = 'Y'",nativeQuery = true)
	TravelHistory finfByRequest(String request);
		
}
