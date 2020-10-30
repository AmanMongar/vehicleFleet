package com.fleet.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.asset.entity.VehicleDetailEntity;
import com.fleet.asset.service.VehicleDetailService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class VehicleDetailController {
	
	@Autowired
	private VehicleDetailService vehicleDetailService;
	
	@GetMapping("/vehicleDetail")
	public List<VehicleDetailEntity> getAllVehicleDetail() {
		return vehicleDetailService.getAllVehicleDetail();
	}
	
	@PostMapping("/vehicleDetail")
	public void saveVehicleDetails(@RequestBody VehicleDetailEntity vehicleDetailEntity) {
		vehicleDetailService.saveVehicleDetails(vehicleDetailEntity);
	}
}
