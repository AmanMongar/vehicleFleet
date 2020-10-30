package com.fleet.asset.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.asset.entity.VehicleTypeEntity;
import com.fleet.asset.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	 
	
	public List<VehicleTypeEntity> getVehicleType() {
		
		List <VehicleTypeEntity> vehicleType = new ArrayList<>();
		vehicleTypeRepository.findAll().forEach(vehicleType::add);
		return vehicleType;
		
		
	
	}

}
