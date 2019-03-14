package com.bridgelabz.Oops;

public class DeckofCards {
	static int arr[][]=new int[4][13];
public static void main(String[] args) {
		int count=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				if(count<=53) 
				{
					arr[i][j]=count;
					count++;
				}
				else {
					break;
				}
				System.out.print(arr[i][j]+" ");
			}
				
		}
		
	  }
	

}
