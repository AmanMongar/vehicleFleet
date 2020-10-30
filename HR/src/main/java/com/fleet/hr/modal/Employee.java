package com.fleet.hr.modal;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="user_id")
    private int userId;
	@Column(name="emp_first_name")
    private String empFirstName;
	@Column(name="emp_second_name")
    private String empSecondName;
	@Column(name="dob")
    private Date dob;
	@Column(name="j_date")
    private Date jDate;
	@Column(name="emp_cid_no") 
    private String empCidNo;
	@Column(name="emp_address")
    private String empAddress;
	@Column(name="emp_phone_no")
    private int empPhoneNo;
	@Column(name="emp_designation")
    private String empDesignation;
	@Column(name="status")
    private String status;
	@Column(name="gender")
    private String gender;
	@Column(name="image")
    private String image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpSecondName() {
		return empSecondName;
	}
	public void setEmpSecondName(String empSecondName) {
		this.empSecondName = empSecondName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public String getEmpCidNo() {
		return empCidNo;
	}
	public void setEmpCidNo(String empCidNo) {
		this.empCidNo = empCidNo;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(int empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getjDate() {
		return jDate;
	}
	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
