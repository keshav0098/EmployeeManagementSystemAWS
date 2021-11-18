package com.keshav.ems.aws.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.keshav.ems.aws.util.Employee;

@Repository
public class EmployeeRepository {
	static List<Employee> employees=new ArrayList<>();
	static
	{
		employees.add(new Employee(1, "Keshav", 40000, "FS"));
		employees.add(new Employee(2, "Harshit", 50000, "CC"));
		employees.add(new Employee(7, "Vijit", 40000, "LU"));
		employees.add(new Employee(15, "Ankit", 10000, "GE"));
		employees.add(new Employee(13, "Vikas", 50000, "85000"));
	}

	public List<Employee> dummyDatabaseForEmployee()
	{
		return employees;


	}
}
