package com.bridgelab.functional;

import java.util.*;
public class Two2darray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  scanner  =new Scanner(System.in);
       int n1=scanner.nextInt();
       int n2=scanner.nextInt();
       int [][] arr= new int[n1][n2];
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr.length;j++) {
    		   Random rand =new Random();
    		int n=rand.nextInt(100);
    		   arr[i][j]=n;
    		   System.out.println(arr[i][j]+" ");
    	   }
       }
	}

}
