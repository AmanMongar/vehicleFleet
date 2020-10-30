package com.fleet.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.asset.entity.VehicleTypeEntity;
import com.fleet.asset.service.VehicleTypeService;


@RestController
@CrossOrigin(origins = "*")
public class VehicleTypeController {

	@Autowired
	private VehicleTypeService vehicleTypeService;
	
	@GetMapping("/vehicleType")
	public List<VehicleTypeEntity> getAllVehicleType() {
		return vehicleTypeService.getVehicleType();
	}
	
	
}
