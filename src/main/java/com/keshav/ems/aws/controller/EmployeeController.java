package com.keshav.ems.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.ems.aws.repository.EmployeeRepository;
import com.keshav.ems.aws.util.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		
		return employeeRepository.dummyDatabaseForEmployee();
	}
	
	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		
		return "Wecome to TCS employee management system!!";
	}
	
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id)
	{
		
		Employee employee = employeeRepository.dummyDatabaseForEmployee().stream().filter(emp -> emp.getEmpID()==id).findAny().get();
		return employee;
	}
}
