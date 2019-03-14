package com.bridgelabz.Algorithm;

import java.io.*;

public class BinaryWordlist {

	private static FileReader filereader;

	public static void main(String[] args) throws IOException {
    
		String[] word=null;
		File file=new File("/home/admin1/Desktop/java.txt");
		try {
			BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));
			String string =bufferedReader.readLine();
			while(bufferedReader.readLine()!=null)
			{
				string=string+bufferedReader.readLine();
			}
			word=string.split(" ");
		}catch (Exception e) {
			e.printStackTrace();
		}
		word=AlgoUtility.Stringbubblesort(word);
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
	System.out.println("Enter the word  to search");
	String element=AlgoUtility.inputString();
	AlgoUtility.StringBinaryWordlist(word,element);
	} 


}
//word = Utility.bubbleSort(word);
//for(int i=0;i<word.length;i++)
//{
//	System.out.println(word[i]);
//}
//System.out.println("Enter the Word to Search:");
//String element= Utility.singleStringInput();
//Utility.searchString(word, element);
//}