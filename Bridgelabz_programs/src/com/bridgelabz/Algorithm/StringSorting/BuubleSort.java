package com.bridgelabz.Algorithm.StringSorting;

public class BuubleSort {

	public static void main(String[] args) {
		long start=System.nanoTime();
		
		String[] string= {"this","is","aw","zo","aa"};
		int [] array= {23,54,64,23,87};
		
		Utility.isbubblesort(string);
		
		long end=System.nanoTime();
		double elasped=(end-start)/1000;
		System.out.println(elasped);
		
		Utility.bublesort(array);
		
		long end1=System.nanoTime();
		double elapsed1=(end1-start)/1000;
		System.out.println(elapsed1);
	}
}
