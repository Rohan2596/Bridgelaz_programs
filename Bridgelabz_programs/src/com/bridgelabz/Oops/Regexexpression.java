package com.bridgelabz.Oops;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.swing.plaf.BorderUIResource;
/**
 * Purpose :-Regex expression for pattern matching 
 * @author Rohan Kadam
 *Date:-19/03/2019
 */
public class Regexexpression {

	public static void main(String[] args) {
		String bio = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println(bio);
		String pattern = "[a-zA-Z]+";//string pattern for 
		System.out.println("Enter the name of ");
		String name = JsonUtil.SingleStringInput();
		System.out.println("Enter your fullname:-");
		String fullname = JsonUtil.SingleStringInput();
		Pattern r = Pattern.compile(pattern);
		if (Pattern.matches(pattern, name)) {
			bio = bio.replaceAll("<<name>>", name);
			bio = bio.replaceAll("<<full name>>", fullname);
		}
		System.out.println("Please Enter your Mobile Numbers");
		String numbers = JsonUtil.SingleStringInput();
		if (Pattern.matches("[789][0-9]{9}", numbers)) {
			bio = bio.replaceAll("x{10}", numbers);
		}
	  String pattern1 = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern1);
       java.util.Date today = Calendar.getInstance().getTime();        
	    String todayAsString = df.format(today);

		// Print it!
		System.out.println("Today is: " + todayAsString);
         
			bio = bio.replaceAll("01/01/2016", todayAsString);
			
			
		System.out.println("===================================");
		System.out.println(bio);
		 
	}

}
