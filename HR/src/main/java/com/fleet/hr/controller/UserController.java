package com.fleet.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.hr.modal.User;
import com.fleet.hr.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping("/")
//	public String defaultPage() {
//		return "Vechicle Management System";
//	}
	
	@GetMapping("/user-list")
	public List<User> fetchUserList(){
		return userService.fetchUserList();
		
	}
	
	@GetMapping("/get-user/{id}")
	public User getUser(@PathVariable ("id") int id){
		return userService.getUser(id);
		
	}
	
	@GetMapping("/get-username/{username}")
	public User getUser(@PathVariable ("username") String username){
		return userService.getUsername(username);
		
	}
	
	@PostMapping("/user-save")
	public Object saveUser(@RequestBody User user){
		try {
			userService.saveUser(user);
		} catch (Exception e) {
			System.out.print(e);
		}
		return user;
		
		
	}
	
	@PutMapping("/user-update")
	public User updateUser(@RequestBody User user){
		try {
		userService.updateUser(user);
		} catch (Exception e) {
			System.out.print(e);
		}
		return user;
		
	}
	
	@PutMapping("/user-delete/{id}")
	public User deleteUser(@PathVariable ("id") int id){
		return userService.deleteUser(id);
				
	}
	

}
