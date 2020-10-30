package com.fleet.billing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reference_sequence")
public class ReferenceNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int last_sequence;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLast_sequence() {
		return last_sequence;
	}
	public void setLast_sequence(int last_sequence) {
		this.last_sequence = last_sequence;
	}
	
	

}
