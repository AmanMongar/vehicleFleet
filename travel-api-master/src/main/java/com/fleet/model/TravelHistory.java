package com.fleet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "driver_travel_history")
public class TravelHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="date_of_travel")
	private Date dateOfTravel;
	@Column(name="designation")
	private String designstion;
	@Column(name="distance_cover")
	private float distanceCover;
	@Column(name="emp_id")
	private int empId;
	@Column(name="end_km")
	private float endKm;
	@Column(name="purpose")
	private String purpose;
	@Column(name="source")
	private String source;
	@Column(name="start_km")
	private float startKm;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	@Column(name="vehicle_id")
	private int vehicleId;
	@Column(name="request")
	private String request;
	
	
	public TravelHistory() {
		super();
	}
	public TravelHistory(int id, Date dateOfTravel, String designstion, float distanceCover, int empId, float endKm,
			String purpose, String source, float startKm, String updatedBy, Date updatedOn, int vehicleId,
			String request) {
		super();
		this.id = id;
		this.dateOfTravel = dateOfTravel;
		this.designstion = designstion;
		this.distanceCover = distanceCover;
		this.empId = empId;
		this.endKm = endKm;
		this.purpose = purpose;
		this.source = source;
		this.startKm = startKm;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.vehicleId = vehicleId;
		this.request = request;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getDesignstion() {
		return designstion;
	}
	public void setDesignstion(String designstion) {
		this.designstion = designstion;
	}
	public float getDistanceCover() {
		return distanceCover;
	}
	public void setDistanceCover(float distanceCover) {
		this.distanceCover = distanceCover;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getEndKm() {
		return endKm;
	}
	public void setEndKm(float endKm) {
		this.endKm = endKm;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public float getStartKm() {
		return startKm;
	}
	public void setStartKm(float startKm) {
		this.startKm = startKm;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	
	
}
