package com.Bridgelabz.practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line =input.nextLine();
		int value =input.nextInt();
		System.out.println(value);
		System.out.println("You entered:"+line);
	}

}
