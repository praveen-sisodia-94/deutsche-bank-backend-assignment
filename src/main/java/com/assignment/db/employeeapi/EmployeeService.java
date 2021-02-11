package com.assignment.db.employeeapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees ::add);
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
