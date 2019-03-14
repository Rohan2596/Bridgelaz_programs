package com.bridgelabz.DataStructure;

import java.util.ArrayList;
/**
 * To Print Prime Numbers in 2d Array
 * @author Rohan Kadam
 *
 */
public class PrimeNumbers_Ds11 {
	static Integer[][] prime_2d = new Integer[10][25];
	static int count=0;

	public static void main(String[] args) {
		ArrayList<Integer> prime2d = DSUtility.primerange(1000);
		System.out.println("****"+prime2d);
		Integer[] arr = new Integer[prime2d.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < prime2d.size(); i++) {
			arr[i] = prime2d.get(i).intValue();}

		for (Integer x : arr) {
			System.out.print(x + " ");}
System.out.println(" ");

		//Assigning elements for 1d array to 2d Array
		for(int i=0;i<10;i++) {
			int k = 0;
			for (int j=0;j<168;j++) {
				
					if(arr[j] >= (i*100) && arr[j] < ((i+1)*100))
					{
						prime_2d[i][k]=arr[j];
						k++;
					}
				}
			
			}
		
		for(int i = 0; i < prime_2d.length; i++)
		{
			for(int j = 0; j < prime_2d[0].length; j++)
			{if(prime_2d[i][j]!=null) {
				System.out.print(prime_2d[i][j] + " ");
			}}
			System.out.println();
		}
 
	}
}
/*for(int i=0;i<13;i++) {
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
			}System.out.println();*/
//if(prime_2d[i][j]<=100) {
//	System.out.print(prime_2d[i][j]+" ");
//}
//if(prime_2d[1][j]>100&& prime_2d[1][j]<=200) {
//
// 	System.out.print(prime_2d[i][j]+" ");
//}
//if(prime_2d[i][j]>200&& prime_2d[i][j]<=300) {
//	System.out.print(prime_2d[i][j]+" ");
//}


