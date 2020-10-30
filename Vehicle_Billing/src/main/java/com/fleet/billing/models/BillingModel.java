package com.fleet.billing.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "driver_billing")
public class BillingModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference_no;
	private Date bill_claim_date;
	private String bill_no;
	private Date bill_date;
	private int fuel_rate;
	private int fuel_quantity;
	private int total_amount;
	private String bill_approved;
	private String bill_stage;
	private String cheque_no;
	private String submited_by;
	private String updated_by;
	private Date updated_on;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReference_no() {
		return reference_no;
	}
	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}
	public Date getBill_claim_date() {
		return bill_claim_date;
	}
	public void setBill_claim_date(Date bill_claim_date) {
		this.bill_claim_date = bill_claim_date;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public Date getBill_date() {
		return bill_date;
	}
	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}
	public int getFuel_rate() {
		return fuel_rate;
	}
	public void setFuel_rate(int fuel_rate) {
		this.fuel_rate = fuel_rate;
	}
	public int getFuel_quantity() {
		return fuel_quantity;
	}
	public void setFuel_quantity(int fuel_quantity) {
		this.fuel_quantity = fuel_quantity;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public String getBill_approved() {
		return bill_approved;
	}
	public void setBill_approved(String bill_approved) {
		this.bill_approved = bill_approved;
	}
	public String getBill_stage() {
		return bill_stage;
	}
	public void setBill_stage(String bill_stage) {
		this.bill_stage = bill_stage;
	}
	public String getCheque_no() {
		return cheque_no;
	}
	public void setCheque_no(String cheque_no) {
		this.cheque_no = cheque_no;
	}
	public String getSubmited_by() {
		return submited_by;
	}
	public void setSubmited_by(String submited_by) {
		this.submited_by = submited_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
