package com.greatleartning.employee.test;

import java.util.Scanner;

import com.greatleartning.employee.service.CredentialServiceImpl;

public class EmployeeTesting {

	public static void main(String[] args) {
		
		CredentialServiceImpl cs = new CredentialServiceImpl();
		System.out.println("Welcome aboard to Great Learning !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name :");
		String firstName = sc.nextLine();
		System.out.println("Enter your Last name :");
		String lastName = sc.nextLine();
		
		String department = null;
		System.out.println("Choose your department from the options below");
		System.out.println("1.Technical");
		System.out.println("2.Admininstration");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			department="tech";
			break;
		case 2:
			department="ad";
			break;
		case 3:
			department="hr";
			break;
		case 4:
			department="lg";
			break;
		}
		
		cs.generatePasword();
		cs.generateEmailId(firstName, lastName, department);
		cs.displayCred(firstName, lastName, department);
		sc.close();
	}

}
