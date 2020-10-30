package com.fleet.asset.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_type_master")
public class VehicleTypeEntity {
	
	@Id
	private int Vehicle_Type_Id;
	private String Vehicle_Type_Name;
	
	
	public VehicleTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleTypeEntity(int vehicle_Type_Id, String vehicle_Type_Name) {
		super();
		Vehicle_Type_Id = vehicle_Type_Id;
		Vehicle_Type_Name = vehicle_Type_Name;
	}


	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}


	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}


	public String getVehicle_Type_Name() {
		return Vehicle_Type_Name;
	}


	public void setVehicle_Type_Name(String vehicle_Type_Name) {
		Vehicle_Type_Name = vehicle_Type_Name;
	}
	
}
