package com.fleet.hr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.hr.modal.User;
import com.fleet.hr.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> fetchUserList() {
		List<User> user = new ArrayList<>();
		 userRepo.findAll().forEach(user::add);
		 return user;
	}

	public Object saveUser(User user) {
		return userRepo.save(user);
		
	}

	public User updateUser(User user) {
		return userRepo.save(user);
	}
	

	public User deleteUser(int id) {
		User user = userRepo.findById(id).orElse(null);
		if(user.getStatus().equals("Y")) {
			user.setStatus("N");
		}
		else {
			user.setStatus("Y");
		}
			
			return userRepo.save(user);		
	}

	public User getUser(int id) {
		User user = userRepo.findById(id).orElse(null);
		return user;
	}

	public User getUsername(String username) {
		User user = userRepo.findByUsername(username);
		return user;
	}


}
