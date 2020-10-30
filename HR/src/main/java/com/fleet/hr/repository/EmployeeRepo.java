package com.fleet.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.hr.modal.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
