package org.example;

import java.util.List;
public class Employee{
	private List<EmployeeItem> employee;

	public List<EmployeeItem> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeItem> employee) {
		this.employee = employee;
	}

	public Employee(List<EmployeeItem> employee) {
		this.employee = employee;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employee=" + employee +
				'}';
	}
}