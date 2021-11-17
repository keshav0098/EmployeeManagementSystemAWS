package com.keshav.ems.aws.util;

public class Employee {
	private int empID;
	private String empName;
	private int salary;
	private String department;
	public int getEmpID() {
		return empID;
	}
	public Employee() {
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public Employee(int empID, String empName, int salary, String department) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
