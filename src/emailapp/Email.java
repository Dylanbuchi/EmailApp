package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailBoxCapacity;

	// Constructor to receive the first and last name + department.
	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("Email created with success! : " + firstName + " " + lastName);
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

	}

	// Ask the user for the department.
	public String setDepartment() {

		System.out.print("Select your department: 1 for Sales, 2 for Development, 3 for Accounting or 0 for nothing: ");
		Scanner in = new Scanner(System.in);
		int UserNumber = in.nextInt();

		if (UserNumber == 1) {
			return "sales";

		} else if (UserNumber == 2) {
			return "Development";

		} else if (UserNumber == 3) {
			return "Accounting";

		} else {
			return "";
		}

	}
}
