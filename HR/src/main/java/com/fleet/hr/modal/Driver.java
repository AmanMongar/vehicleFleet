package com.fleet.hr.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_details")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="emp_id")
    private int empId;
	@Column(name="licence_no")
    private String licenceNo;
	@Column(name="vehicle_details_id")
    private int vehicleDetailsId;
	@Column(name="auto_meter_reading")
    private int autoMeterReading;
	@Column(name="approval_status")
    private String approvalStatus;
	@Column(name="approval_date")
    private Date approvalDate;
	@Column(name="approval_by")
    private int approvalBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public int getVehicleDetailsId() {
		return vehicleDetailsId;
	}
	public void setVehicleDetailsId(int vehicleDetailsId) {
		this.vehicleDetailsId = vehicleDetailsId;
	}
	public int getAutoMeterReading() {
		return autoMeterReading;
	}
	public void setAutoMeterReading(int autoMeterReading) {
		this.autoMeterReading = autoMeterReading;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public int getApprovalBy() {
		return approvalBy;
	}
	public void setApprovalBy(int approvalBy) {
		this.approvalBy = approvalBy;
	}

	
	

}
