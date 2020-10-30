package com.fleet.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.asset.entity.VehicleModelEntity;
import com.fleet.asset.service.VehicleModelService;

@RestController
@CrossOrigin(origins =  "*")
public class VehicleModelController {

	@Autowired
	private VehicleModelService vehicleModelService;
	
	@GetMapping("/vehicleModel")
	public List<VehicleModelEntity> getAllVehicleModel() {
		return vehicleModelService.getVehicleModel();
	}
	
}
