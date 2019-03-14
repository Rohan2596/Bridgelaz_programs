package com.bridgelabz.DataStructure;

import java.util.ArrayList;

import com.bridgelabz.Algorithm.AlgoUtility;
/**
 * PrimeAnagram2D
 * To print Numbers that are prime and anagram 
 * @author admin1
 *
 */
public class PrimeAnagram2D {
	static Integer[][] prime_2d = new Integer[13][13];
	static String[][] arr3=new String[168][168];
	static int count=0;

	public static void main(String[] args) {
		ArrayList<Integer> prime2d = DSUtility.primerange(1000);
		System.out.println("****"+prime2d);
		Integer[] arr = new Integer[prime2d.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < prime2d.size(); i++) {
			arr[i] = prime2d.get(i).intValue();}

		for (Integer x : arr) {
			System.out.print(x + " ");
			}
		
System.out.println(" ************");

for(int i=0;i<=arr.length;i++) {
	
	for (int j=i+1;j<arr.length;j++) {
		String str1=arr[i].toString();
		String str2=arr[j].toString();

         boolean status = DSUtility.isAnagram1(str1, str2);
         if(status)
			{
				
				arr3[i][j]=arr[i]+" "+arr[j];
				System.out.print(arr3[i][j]+" ");
			}

	}}
System.out.println(" ");
System.out.println("Sectional Matrix");
		//Assigning elements for 1d array to 2d Array
		for(int i=0;i<13;i++) {
			for (int j=0;j<13;j++) {
				int countA = count++;
				if(countA < 168)
				{
					prime_2d[i][j]=arr[countA];
				}
				else
				{
					break;
				}

				System.out.print(prime_2d[i][j]+" ");
			}System.out.println();
			}
		
		
	}

}
