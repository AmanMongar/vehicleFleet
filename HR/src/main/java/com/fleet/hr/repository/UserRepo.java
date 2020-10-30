package com.fleet.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fleet.hr.modal.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM user_details u WHERE u.username = ?1",nativeQuery = true)
	User findByUsername(String username);

}
