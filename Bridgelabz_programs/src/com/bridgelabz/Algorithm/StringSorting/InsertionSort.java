package com.bridgelabz.Algorithm.StringSorting;

public class InsertionSort {
public static void main(String[] args) {
	long start=System.nanoTime();
	
	String[] string= {"aa","is","aw","zo"};
	int [] array= {1,2,5,3,78,34,0};
	
  	Utility.isInsertionsort(string);
  	
  	long end=System.nanoTime();
	double elasped=(end-start)/1000;
	System.out.println(elasped);
  	
	Utility.insertionsort(array);
	
	long end1=System.nanoTime();
	double elapsed1=(end1-start)/1000;
	System.out.println(elapsed1);

}
}
