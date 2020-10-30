package com.fleet.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.hr.modal.Employee;
import com.fleet.hr.service.EmployeeService;


@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String defaultPage() {
		return "Vechicle Management System";
	}
	
	@GetMapping("/employee-list")
	public List<Employee> fetchEmployeeList(){
		return employeeService.fetchEmployeeList();
		
	}
	
	@GetMapping("/get-employee/{id}")
	public Employee getEmployee(@PathVariable ("id") int id){
		return employeeService.getEmployee(id);
		
	}
	
	@PostMapping("/employee-save")
	public Object saveEmployee(@RequestBody Employee employee){
		try {
			employeeService.saveEmployee(employee);
		} catch (Exception e) {
			System.out.print(e);
		}
		return employee;
		
		
	}
	
	@PutMapping("/employee-update")
	public Employee updateEmployee(@RequestBody Employee employee){
		try {
		employeeService.updateEmployee(employee);
		} catch (Exception e) {
			System.out.print(e);
		}
		return employee;
		
	}
	
	@PutMapping("/employee-delete/{id}")
	public Employee deleteEmployee(@PathVariable ("id") int id){
		return employeeService.deleteEmployee(id);
				
	}

}
