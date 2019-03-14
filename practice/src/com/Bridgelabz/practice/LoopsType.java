package com.Bridgelabz.practice;

import java.util.Scanner;

public class LoopsType {

	public static void main(String[] args) {
//		int value = 0;
//		while(value<10)
//		{
//			System.out.println("Hello world");
//			value =value + 1;
//		}
//		int age=25;
//		int weigth=48;
//		if (age>=18) {
//			if (weigth>50) {
//				System.out.println("You are eligible to donate blood");
//				}else {
//					System.out.println("You are not eligible to donate");
//					
//				}
//		}else {
//			System.out.println("Age must be greater than 18");
//		}
//		int marks=84;
//		if(marks<50) {
//			System.out.println("Fail");
//		}
//		else if(marks>=50&& marks<60) {
//			System.out.println("D grade");
//		}else if (marks>=70 && marks<70) {
//			System.out.println("C grade");
//		}else {
//			System.out.println("A+ grade");
//		}
//		for (int i=0;i<5;i++) {
//			System.out.println("the value of i "+i);
//			System.out.printf("the value of %d\n",i);
//		}
		
//		Scanner scanner =new Scanner(System.in);
		/*System.out.println("Enter the Number:");
		int value=scanner.nextInt();
		while(value!=5) {
			System.out.println("Enter a Number ");
			value =scanner.nextInt();
		}
		System.out.println("Got 5!");
		
		int value=0;
		do {
			System.out.println("Enter the next number");
			value =scanner.nextInt();
		}while(value!=5);
		System.out.println("GOT 5!");
		*/
		Scanner input =new Scanner(System.in);
		System.out.println("please enter a command:");
		String text =input.nextLine();
		switch (text){
			case "start":
				System.out.println("Matched Started");
				break;
			case "stop":
				System.out.println("Machine Stopped");
				break;
			default:
				System.out.println("Command not Recongized");
		
		}
		}
}


