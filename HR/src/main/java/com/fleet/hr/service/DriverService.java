package com.fleet.hr.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.hr.modal.Driver;
import com.fleet.hr.repository.DriverRepo;


@Service
public class DriverService {
	
	@Autowired
	private DriverRepo driverRepo;
	
	public List<Driver> fetchDriverList() {
		List<Driver> driver = new ArrayList<>();
		driverRepo.findAll().forEach(driver::add);
		 return driver;
	}

	public Object saveDriver(Driver driver) {
		return driverRepo.save(driver);
		
	}

	public Driver updateDriver(Driver driver) {
		return driverRepo.save(driver);
	}
	

	public Driver getDriver(int id) {
		Driver driver = driverRepo.findById(id).orElse(null);
		return driver;
	}

	public Driver approvalDriver(int id, String status, int user) {
		Date today = new Date();
		Driver driver = driverRepo.findById(id).orElse(null);
		if (status.equals("approved")) {
			driver.setApprovalStatus(status);
			driver.setApprovalDate(today);
			driver.setApprovalBy(user);
		}
		else {
			driver.setApprovalStatus(status);
			driver.setApprovalDate(today);
			driver.setApprovalBy(user);
		}
		
			
			return driverRepo.save(driver);	
	}

//	public Optional<Object> approvalDriver(Driver driver, int id, String status, int user) {
//		Date today = new Date();
//		 driverRepo.findById(id).map(mapper -> {
//			 if (status.equals("approve")) {
//				 mapper.setApprovalStatus("approved");
//				 mapper.setApprovalDate(today);
//				 mapper.setApprovalBy(user);
//				}
//				else {
//					mapper.setApprovalStatus("rejected");
//					mapper.setApprovalDate(today);
//					mapper.setApprovalBy(user);
//				}
//			 return driverRepo.save(mapper);
//		 });
//		 	return null;
//		
//			
//	}


}
