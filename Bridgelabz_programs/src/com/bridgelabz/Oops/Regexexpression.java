package com.bridgelabz.Oops;

import java.util.regex.Pattern;

public class Regexexpression {

	public static void main(String[] args) {
		String bio = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println(bio);
		String pattern = "[a-zA-Z]+";
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
		System.out.println("Enter the Date");
		String date = JsonUtil.SingleStringInput();
		if (Pattern.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", date)) {
			bio = bio.replaceAll("01/01/2016", date);
		}
		System.out.println(bio);

	}

}
