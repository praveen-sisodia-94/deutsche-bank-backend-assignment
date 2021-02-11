package com.assignment.db.employeeapi;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee,String> {

	
}
