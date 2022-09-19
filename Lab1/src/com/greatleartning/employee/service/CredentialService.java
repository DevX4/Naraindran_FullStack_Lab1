package com.greatleartning.employee.service;

public interface CredentialService {
	public char[] generatePasword();
	public String generateEmailId(String firstName, String lastName, String department);
	public void displayCred(String firstName, String lastName, String department);
}

