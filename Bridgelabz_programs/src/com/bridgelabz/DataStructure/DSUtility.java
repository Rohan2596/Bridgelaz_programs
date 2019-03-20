package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.Algorithm.AlgoUtility;
/**
 * Purpose:-Utility class for all the function Which are Repeatedly used 
 * @author Rohan Kadam
 *
 */
public class DSUtility {
	public static String StringInput() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		return string;

	}

	public static int inputInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the interger:- ");
		int integer = scanner.nextInt();
		return integer;

	}

	public static void printString(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}

	public static void printString2d(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static ArrayList<Integer> primerange(int numbers) {

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int i = 0;
		int num = 0;
		// Empty String
	
		for (i = 1; i <= numbers; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				arraylist.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to n are :");

//		System.out.println(arraylist);

		return arraylist;
	}

	public static boolean isAnagram1(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = false;

		if (s1.length() != s2.length()) {
			status = false;
		}

		char[] arrs1 = s1.toLowerCase().toCharArray();
		char[] arrs2 = s2.toLowerCase().toCharArray();

		Arrays.sort(arrs1);
		Arrays.sort(arrs2);

		status = Arrays.equals(arrs1, arrs2);

		return status;

	};


public static String[] readfile(String[] word,String path) {
//	path="/home/admin1/java/java/Bridgelabz_programs/src/com/bridgelabz/DataStructure/abc.txt";
	File file =new File(path);
	try {
	BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
	String string=bufferedReader.readLine();
	while((bufferedReader.readLine())!=null) {
		string=string+bufferedReader.readLine();
		//System.out.println(string);
	}
	word=string.split(" ");
	}catch(Exception e){
		e.printStackTrace();
		
	}
//	System.out.println(string);
	return word;
}

public static Linkedlist writefile(Linkedlist wordlist) {
	File file =new File("/home/admin1/java/java/Bridgelabz_programs/src/com/bridgelabz/DataStructure/abc.txt");
	try {
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
		while(!wordlist.isEmpty()) {
			bufferedWriter.write(wordlist.get()+" ");
			bufferedWriter.flush();
			bufferedWriter.close();
		}
	}catch(Exception e) {
		e.printStackTrace();
	}return wordlist;
}

public static Linkedlist writefile1(Linkedlist wordlist) {
	File file =new File("/home/admin1/java/java/Bridgelabz_programs/src/com/bridgelabz/DataStructure/abc.txt");
	try {
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
		while(!wordlist.isEmpty()) {
			bufferedWriter.write(wordlist.get()+" ");
			bufferedWriter.flush();
			bufferedWriter.close();
		}
	}catch(Exception e) {
		e.printStackTrace();
	}return wordlist;
}
public static boolean serachString(String[] chararray,String key) {
	int start=0;
	int end=chararray.length;
	printString(chararray);
	while(start<=end) {
		int mid=(start+end)/2;
		if(key==chararray[mid]) {
			return true;
		}else if((Math.abs(key.hashCode()))<(Math.abs(chararray[mid].hashCode())) ){
			end=mid-1;
		}else if((Math.abs(key.hashCode()))>(Math.abs(chararray[mid].hashCode()))) 
		{
			start=mid+1;
		}
	}return false;
}


}
