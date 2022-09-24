package org.example;


import java.util.ArrayList;
import java.util.List;

public class EmployeeItem{
	private String firstName;
	private String lastName;
	private String city;

	public EmployeeItem(String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public EmployeeItem() {
	}

	public boolean equals(EmployeeItem student)
	{
		/*if (this == student)
			return true;
		if (student == null
				|| this.getClass() != student.getClass())
			return false;*/
		EmployeeItem p1 = (EmployeeItem) student;   // student object

		// Checking only if attribute- name
		// and age is same and ignoring breed
		//EmployeeItem p2=new EmployeeItem();  // emp1 object

		return this.firstName.equals(p1.firstName) && this.lastName.equals(p1.lastName) && this.city.equals(p1.city);
		/*return p2.getFirstName().equals(p1.firstName)
				&& p2.getLastName().equals(p1.lastName) && p2.getCity().equals(p1.city);*/
	}


	@Override
	public String toString() {
		return "EmployeeItem{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", city=" + city +
				'}';
	}
}