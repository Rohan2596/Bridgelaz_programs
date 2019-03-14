package com.bridgelabz.Algorithm.StringSorting;

public class Utility {
	public static String[] isbubblesort(String[] chararray) {
		int n=chararray.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if((Math.abs(chararray[j].hashCode()))>(Math.abs(chararray[j+1].hashCode()))){
					String temp=chararray[j];
					chararray[j]=chararray[j+1];
					chararray[j+1]= temp;
					System.out.println(chararray);
				}
			}
		}printString(chararray);
		return chararray;
	}
	public static void bublesort(int[] arr) {
		 int n = arr.length;
	     for (int i = 0; i < n-1; i++) {
	         for (int j = 0; j < n-i-1; j++)
	             if (arr[j] > arr[j+1])
	             {
	                 
	                 int temp = arr[j];
	                 arr[j] = arr[j+1];
	                 arr[j+1] = temp;
	             }
	     }printArray(arr);
	}
	public static void insertionsort(int[] arr) {
		int i,temp,j;
		for(i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i-1;
		while(j>=0 && arr[j]>temp) {
			arr[j+1]=arr[j];
			j=j-1;
		}arr[j+1]=temp;
		}	printArray(arr);
		}
	public static void isBinarySearch(int [] arr, int key) {
		int start=0;
		int end=arr.length;
		printArray(arr);
		while(start<=end) {
			 int mid=(start+end)/2;
			if (key==arr[mid]) {System.out.println("elements found at position"+mid);
			break;
			}else if (key<arr[mid]) {
				end=mid-1;
			}else if(key>arr[mid]) {start=mid+1;
			}else {System.out.println("element not found");}
			
		}
	}
	public static void printArray(int arr[]) 
	{ 
	for (int i = 0; i < arr.length; i++) 
	System.out.print(arr[i] + " "); 

	System.out.println(); 
	}
	public static void printString(String arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}
	
	public static void isInsertionsort(String[] chararray) {
		int i,j;
		int temp;
		for(i=1;i<chararray.length;i++) {
		temp=Math.abs(chararray[i].hashCode());
			j=i-1;
		while(j>=0 && (Math.abs(chararray[j].hashCode())>temp)){
			chararray[j+1]=chararray[j];
			j=j-1;
			}
		chararray[j+1]=chararray[i];
			System.out.println(chararray[j+1]);
		}
		printString(chararray);
	}
public static void isBinarysearch(String[] chararray,String key) {
	int start=0;
	int end=chararray.length;
	printString(chararray);
	while(start<=end) {
		int mid=(start+end)/2;
		if(key==chararray[mid]) {
			System.out.println("Elements found at position"+mid);
		break;
		}else if((Math.abs(key.hashCode()))<(Math.abs(chararray[mid].hashCode())) ){
			end=mid-1;
		}else if((Math.abs(key.hashCode()))>(Math.abs(chararray[mid].hashCode()))) 
		{
			start=mid+1;
		}
	}System.out.println("elements not found");
}


}
