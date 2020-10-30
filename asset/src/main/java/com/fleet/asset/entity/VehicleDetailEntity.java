package com.fleet.asset.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_details")
public class VehicleDetailEntity {

	@Id
	private int id;
	private String 	vehicle_Name;
	private String vehicle_Number;
	private String description;
	private int Vehicle_Type_Id;
	private int Vehicle_Model_Id; 
	private String status;
	
	public VehicleDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleDetailEntity(int id, String vehicle_Name, String vehicle_Number, String description,
			int vehicle_Type_Id, int vehicle_Model_Id, String status) {
		super();
		this.id = id;
		this.vehicle_Name = vehicle_Name;
		this.vehicle_Number = vehicle_Number;
		this.description = description;
		Vehicle_Type_Id = vehicle_Type_Id;
		Vehicle_Model_Id = vehicle_Model_Id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicle_Name() {
		return vehicle_Name;
	}

	public void setVehicle_Name(String vehicle_Name) {
		this.vehicle_Name = vehicle_Name;
	}

	public String getVehicle_Number() {
		return vehicle_Number;
	}

	public void setVehicle_Number(String vehicle_Number) {
		this.vehicle_Number = vehicle_Number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}

	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}

	public int getVehicle_Model_Id() {
		return Vehicle_Model_Id;
	}

	public void setVehicle_Model_Id(int vehicle_Model_Id) {
		Vehicle_Model_Id = vehicle_Model_Id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
