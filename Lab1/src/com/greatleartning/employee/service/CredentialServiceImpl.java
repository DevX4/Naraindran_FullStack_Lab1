package com.greatleartning.employee.service;

import java.util.Random;

public class CredentialServiceImpl implements CredentialService  {
	
	String emailID;

	@Override
	public char[] generatePasword() {
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String number="0123456789";
		String specialChars="!@#$%^&*";
		String combination=upper+lower+specialChars+number;
		int len=8;
		char[] password=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		return password;
	}

	@Override
	public String generateEmailId(String firstName, String lastName, String department) {
		emailID = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".gl.com";
		return emailID;
	}

	@Override
	public void displayCred(String firstName, String lastName, String department) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows: ");
		System.out.println("Your generated EmailId: "+ generateEmailId(firstName, lastName, department));
		System.out.println("Your password: "+ new String(generatePasword()));
	}

	  


}
