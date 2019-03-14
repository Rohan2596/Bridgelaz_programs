//package com.Bridgelabz.practice;
//
//import java.util.ArrayList;
//
//public class Prime2D {
//public static void main(String[] args) {
//	
//
//	// TODO Auto-generated method stub
//	ArrayList primeList[]= new ArrayList[10];
//	int cnt=0,i=0,temp=100;
//	
//	//Creating multiple objects of prime number list list and storing into a n array of list
//	for(int j=0;j<10;j++)
//	{
//		primeList[j] = new ArrayList();
//	}
//	//Checking Prime Numbers and storing into a list
//	while(i<10)
//	{
//		for(int num=2;num<=1000;num++)
//		{
//			cnt = Utility.checkPrime(num);
//			if(cnt==0)
//				primeList[i].add(num);
//			if(num==temp)
//			{
//				i++;
//				temp=temp+100;
//				}
//			}	
//	}
//	for(ArrayList listItem : primeList)
//		System.out.println(listItem);
//}
//}
////class Calendar
////{
////	public static void main(String []args) {
////		int year;
////		int month;
////		int startDayOfMonth;
////		int spaces;
////		System.out.println("Enter the Year");
////		year = Utility.singleIntegerInput();
////		System.out.println("Enter the Start Day of month");
////		startDayOfMonth = Utility.singleIntegerInput();
////		spaces = startDayOfMonth;
////		String [] months = {"","January","February","March","April","May","June","July","August",
////							"September","October","November","December"};
////		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
////		for(int M=1;M<=12;M++)
////		{
////			if((year%400==0)&&(year%100!=0)||(year%4==0)&&M==2)
////				days[M]=29;
////			System.out.println("          "+ months[M] + " " + year);
////			System.out.println("______________________________________");
////            System.out.println("   Sun  Mon  Tue  Wed  Thu  Fri  Sat");
////            spaces = (days[M-1] + spaces)%7;
////            for (int i = 0; i < spaces; i++)
////                System.out.print("     ");
////            for (int i = 1; i <= days[M]; i++) {
////                System.out.printf(" %3d ", i);
////                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
////            }
////            System.out.println();
////		}
////		
////	}
////}
