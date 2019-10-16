package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companyNameUrl;
	private boolean emailValid;

	private int mailBoxCapacity;
	private int defaultPasswordLength;

	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		// initialize variables
		this.defaultPasswordLength = 7;
		this.companyNameUrl = ".BigDevs.com";
		this.mailBoxCapacity = 500;
		this.emailValid = true;

		// Call a method to ask for department
		this.department = setDepartment();


		// Call a method to set a random password
		this.password = setPassword(this.defaultPasswordLength);
		System.out.println("Your default password is: " + this.password);

		// initialize the email
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + this.companyNameUrl.toLowerCase();

		// print email
		System.out.println("Your email is: " + email);
		System.out.println("Your email was created with succes!");
		

	}

	// Ask the user for the department
	public String setDepartment() {

		System.out.print("Select your department: 0 for User, 1 for Sales, 2 for Development, or 3 for Accounting: ");
		Scanner in = new Scanner(System.in);
		int UserNumber = in.nextInt();

		if (UserNumber == 1) {
			return "Sales";

		} else if (UserNumber == 2) {
			return "Development";

		} else if (UserNumber == 3) {
			return "Accounting";

		} else {
			return "user";
		}

	}

	// Set a random password
	public String setPassword(int length) {

		String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!$?";

		char[] randomPassword = new char[length];

		for (int i = 0; i < length; i++) {

			int random = (int) (Math.random() * password.length());
			randomPassword[i] = password.charAt(random);

		}

		return new String(randomPassword);

	}

	// Method to change the password
	public void changePassword(String password) {
		this.password = password;

	}

	// Set the mailBox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;

	}

	// Set the alterEmail
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;

	}



	// Get methods
	public String getPassword() {
		return this.password;
	}

	public String getAlternateEmail() {
		return this.alternateEmail;
	}

	public int getMailBoxCapacity() {
		return this.mailBoxCapacity;
	}

	// Method to show info about a new user

	public String showInfo() {
		System.out.println();

		return "NAME: " + firstName + " " + lastName + "\n" + "COMPANY EMAIL: " + email + "\n" + "EMAIL BOX STORAGE: "
				+ mailBoxCapacity + "MB" + "\n" + "DEPARTMENT: " + department + "\n" + "DEFAULT PASSWORD:  " + password
				+ "\n" + "EMAIL VALID: " + emailValid;

	}

}
