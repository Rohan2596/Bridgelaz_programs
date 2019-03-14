package com.bridgelab.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
private static Scanner scanner;

public static void main(String[] args) {
	scanner = new Scanner(System.in);
	String str1=scanner.nextLine();
	String str2=scanner.nextLine();
	 int s1=str1.length();
	 int s2=str1.length();
	 if(s1==s2) {
		 System.out.println("Length are equals");
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
	char[] str3=str1.toCharArray();
	char[] str4=str2.toCharArray();
	Arrays.sort(str4);
	Arrays.sort(str3);
	if (Arrays.equals(str3, str4)) {System.out.println("anangrams");
	}else {System.out.println("Not an anagram");}
	 }else {System.out.println("length are not equals");}
	
	
}
}
