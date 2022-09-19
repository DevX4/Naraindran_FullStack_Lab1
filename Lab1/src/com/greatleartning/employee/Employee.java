package com.greatleartning.employee;

public class Employee {
	
	private String FirstNmae;
	private String LastName; 
	
	public String getFirstNmae() {
		return FirstNmae;
	}
	public void setFirstNmae(String firstNmae) {
		FirstNmae = firstNmae;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public Employee(String firstNmae, String lastName) {
		FirstNmae = firstNmae;
		LastName = lastName;
	}
	public Employee() {

	}
	
	
	
}
