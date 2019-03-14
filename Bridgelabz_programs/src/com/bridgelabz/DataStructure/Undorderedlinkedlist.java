package com.bridgelabz.DataStructure;
/**
 * To Add 0r delete elements in file 
 * @author Rohan Kadam
 *
 */
public class Undorderedlinkedlist {

	public static void main(String[] args) {
		String element;
		Linkedlist wordlist=new Linkedlist();
		String word[]=null;
		String path = ("/home/admin1/java/java/Bridgelabz_programs/src/com/bridgelabz/DataStructure/abc.txt");
		word =DSUtility.readfile(word,path);
		System.out.println(word);
		//	DSUtility.printString(word);
		for(String item:word) {
			wordlist.insertAtLast(item);
		}
		wordlist.printlist();
//		wordlist.sortList();
//		wordlist.printlist();
		element=DSUtility.StringInput();
		boolean found=wordlist.search(element);
		if(found) {
			wordlist.delete(element);
		}
		else {
			wordlist.insertAtLast(element);
			}
	     
		wordlist.printlist();
		wordlist=DSUtility.writefile(wordlist);
		wordlist.printlist();
		}
		

	}

