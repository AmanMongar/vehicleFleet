package com.fleet.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.hr.modal.Driver;
import com.fleet.hr.service.DriverService;



@RestController
@CrossOrigin("*")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
//	@RequestMapping("/")
//	public String defaultPage() {
//		return "Vechicle Management System";
//	}
	
	@GetMapping("/driver-list")
	public List<Driver> fetchDriverList(){
		return driverService.fetchDriverList();
		
	}
	
	@GetMapping("/get-driver/{id}")
	public Driver getDriver(@PathVariable ("id") int id){
		return driverService.getDriver(id);
		
	}
	
	@PostMapping("/driver-save")
	public Object saveDriver(@RequestBody Driver driver){
		try {
			driverService.saveDriver(driver);
		} catch (Exception e) {
			System.out.print(e);
		}
		return driver;
		
		
	}
	
	@PutMapping("/driver-update")
	public Driver updateDriver(@RequestBody Driver driver){
		try {
			driverService.updateDriver(driver);
		} catch (Exception e) {
			System.out.print(e);
		}
		return driver;
		
	}
	
	@PutMapping("/driver-approval/{id}/{status}/{user}")
	public Driver approvalDriver(@PathVariable ("id") int id, @PathVariable ("status") String status, @PathVariable ("user") int user){
		return driverService.approvalDriver(id, status, user);
				
	}


}
