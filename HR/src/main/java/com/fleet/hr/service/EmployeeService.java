package com.fleet.hr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.hr.modal.Employee;
import com.fleet.hr.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> fetchEmployeeList() {
		List<Employee> employee = new ArrayList<>();
		 employeeRepo.findAll().forEach(employee::add);
		 return employee;
	}

	public Object saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
		
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	

	public Employee deleteEmployee(int id) {
		Employee employee = employeeRepo.findById(id).orElse(null);
		if(employee.getStatus().equals("Y")) {
			employee.setStatus("N");
		}
		else {
			employee.setStatus("Y");
		}
			
			return employeeRepo.save(employee);		
	}

	public Employee getEmployee(int id) {
		Employee employee = employeeRepo.findById(id).orElse(null);
		return employee;
	}


}
