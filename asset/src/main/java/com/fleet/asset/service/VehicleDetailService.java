package com.fleet.asset.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.asset.entity.VehicleDetailEntity;
import com.fleet.asset.repository.VehicleDetailRepository;

@Service
public class VehicleDetailService {

	@Autowired
	private VehicleDetailRepository vehicleDetailRepository;
	
	
	public List<VehicleDetailEntity> getAllVehicleDetail() {
		return vehicleDetailRepository.findAll();
	}


	


	public void saveVehicleDetails(VehicleDetailEntity vehicleDetailEntity) {
		vehicleDetailRepository.save(vehicleDetailEntity);
	}


	
}
