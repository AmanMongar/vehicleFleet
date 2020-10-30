package com.fleet.asset.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.asset.entity.VehicleModelEntity;
import com.fleet.asset.repository.VehicleModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	private VehicleModelRepository  vehicleModelRepository;
	
	public List<VehicleModelEntity> getVehicleModel() {
		List <VehicleModelEntity> vehicleModel = new ArrayList<>();
		vehicleModelRepository.findAll().forEach(vehicleModel::add);
		return vehicleModel;
	}

}
