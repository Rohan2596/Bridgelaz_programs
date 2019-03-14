package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hashing {

		public static void main(String[] args) throws IOException {
			
			String element = "hashing.txt";
			int reminder,integerNumber;
			//Creation of Linked List Object
			Linkedlist wordList[] = new Linkedlist[11];
			String numbers[] = null;
			
			for(int j=0;j<=10;j++)
			{
				wordList[j] = new Linkedlist();
			}
			//Calling to readFile function to read a file
			numbers = DSUtility.readfile(numbers, element);
			
			for(int i=0;i<numbers.length;i++)
			{
				integerNumber = Integer.parseInt(numbers[i]);
				reminder = integerNumber%11;
				wordList[reminder].insertAtLast(numbers[i]);
				
			}
			//Calling to show function to display Linked List
			for(int i=0;i<11;i++)
			{
				if(wordList[i].isEmpty()) {
					System.out.print(i+"=====");
				}else {
					System.out.println();
					System.out.print(i+"=====");
				wordList[i].printlist();}
			}	
			System.out.println("Enter a Number:=");
			//calling to function to get an input from user
			element = DSUtility.StringInput();
			reminder = Integer.parseInt(element)%11;
			
			//calling to search function to search element in Linked List
			
			if(wordList[reminder].search(element))
				wordList[reminder].delete(element);
			else
			{
				wordList[reminder].insertAtLast(element);
			}
			//Calling to show function to display Linked List
			for(int i=0;i<11;i++)
			{
				if(wordList[i].isEmpty())
				{
					System.out.print(i+"=====");
				}else {
					System.out.println();
					System.out.print(i+"=====");
				wordList[i].printlist();}
			}	
			FileWriter fw = new FileWriter(element);
			fw.write(" ");
			fw.close();
			//Calling to writeFile function to write a file a file
			for(int i=0;i<11;i++)
			{
				if(wordList[i].isEmpty())
					continue;
			DSUtility.writefile1(wordList[i]);
			}	
		}
	

	}
