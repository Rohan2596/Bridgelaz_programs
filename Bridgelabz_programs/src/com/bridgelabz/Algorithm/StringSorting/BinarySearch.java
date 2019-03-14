package com.bridgelabz.Algorithm.StringSorting;

public class BinarySearch {

	public static void main(String[] args) {
		
		long start=System.nanoTime();
		String[] string= {"this","is","aw","zo","aa"};
		int [] array= {1,2,4,5,7,8,9};
	
		Utility.isBinarysearch(Utility.isbubblesort(string),"zo");
		
		long end=System.nanoTime();
		double elasped=(end-start)/1000;
		System.out.println(elasped);
		
		Utility.isBinarySearch(array, 7);
		
		
		long end1=System.nanoTime();
		double elapsed1=(end1-start)/1000;
		System.out.println(elapsed1);

		
		
	}

}

