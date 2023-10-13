package assignment1;

import java.util.Scanner;

public class Sprint2 {
	public static void main(String [] args) {
	
	//Comment section 
	//Name : Josh
	//Surname : Cloete
	//Student Number : 4024911
	//Project name : Adventure Activity Booking System
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("This project is to create a Adventure Activity Booking System\n");
	System.out.println("How the project will work: ");
	System.out.println("1.) Users can search local adventure related activities (such skydiving,surfing,paragliding etc)");
	System.out.println("2.) Book the activities with ease through with local vendors through the app and website's payment processers.");
	System.out.println("3.) Review the vendors and activities on the app and website");
	System.out.println("4.) Explore like never before.");
	
	System.out.println("\nTo Register Please enter the Following: ");

	System.out.println("Enter First name here: ");
	String fname = input.nextLine();
	System.out.println("Enter Surname here: ");
	String sname = input.nextLine();
	System.out.println("Enter Email Address here: ");
	String email = input.nextLine();
	System.out.println("Enter Password: ");
    String pass = input.nextLine();

    System.out.println("User information registered: ");
	System.out.println("First name: " + fname);
	System.out.println("Surname :" + sname);
	System.out.println("Email Address: " + email);
    System.out.println("Password: " + pass);   
}
}