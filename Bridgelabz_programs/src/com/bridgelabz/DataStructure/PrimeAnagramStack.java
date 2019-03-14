package com.bridgelabz.DataStructure;

import java.util.ArrayList;

public class PrimeAnagramStack {
	static Integer[][] prime_2d = new Integer[13][13];
	static String[][] arr3=new String[168][168];
	

	
	public static void main(String[] args) {
		StackWithLink stack = new StackWithLink();
	     
		ArrayList<Integer> prime2d = DSUtility.primerange(1000);
		System.out.println("****"+prime2d);
		Integer[] arr = new Integer[prime2d.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < prime2d.size(); i++) {
			arr[i] = prime2d.get(i).intValue();}

		for (Integer x : arr) {
			System.out.print(x + " ");
			}
		int count = 0;
		System.out.println(" ************");
		for(int i=0;i<=arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				String str1=arr[i].toString();
				String str2=arr[j].toString();
				
		         boolean status = DSUtility.isAnagram1(str1, str2);
		         if(status)
					{
						
						arr3[i][j]=arr[i]+" "+arr[j] ;
//						System.out.print(arr3[i][j]+" ");
						stack.push(arr3[i][j]);
						count++;
					}

}}
		
 				while(count>0) {
 					System.out.print(" "+stack.pop());
 					count--;
 					
 				}
		}
	}


