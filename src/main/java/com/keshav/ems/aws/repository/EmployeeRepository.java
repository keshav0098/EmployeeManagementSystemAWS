package com.keshav.ems.aws.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.keshav.ems.aws.util.Employee;

@Repository
public class EmployeeRepository {


	public List<Employee> dummyDatabaseForEmployee()
	{
		return	Stream.of(new Employee(1, "Keshav", 30000, "FS"),new Employee(2, "Harshit", 50000, "CC"),new Employee(7, "Vijit", 40000, "LU"),
				new Employee(15, "Ankit", 10000, "GE"),new Employee(13, "Vikas", 50000, "85000")).collect(Collectors.toList());


	}
}
