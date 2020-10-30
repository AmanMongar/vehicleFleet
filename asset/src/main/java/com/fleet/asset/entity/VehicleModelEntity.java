package com.fleet.asset.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_model_master")
public class VehicleModelEntity {
	
	@Id
	private int Vehicle_Model_Id;
	private String Vehicle_Model_Name;
	
	public VehicleModelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleModelEntity(int vehicle_Model_Id, String vehicle_Model_Name) {
		super();
		Vehicle_Model_Id = vehicle_Model_Id;
		Vehicle_Model_Name = vehicle_Model_Name;
	}

	public int getVehicle_Model_Id() {
		return Vehicle_Model_Id;
	}

	public void setVehicle_Model_Id(int vehicle_Model_Id) {
		Vehicle_Model_Id = vehicle_Model_Id;
	}

	public String getVehicle_Model_Name() {
		return Vehicle_Model_Name;
	}

	public void setVehicle_Model_Name(String vehicle_Model_Name) {
		Vehicle_Model_Name = vehicle_Model_Name;
	}
	
}
