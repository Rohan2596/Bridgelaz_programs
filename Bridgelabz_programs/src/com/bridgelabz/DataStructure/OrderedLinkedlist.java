package com.bridgelabz.DataStructure;
/**
 * OrderedLinked list
 * @author Rohan Kadam
 *
 */
public class OrderedLinkedlist {

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
	wordlist.sortList();
	wordlist.printlist();
	System.out.println("*****************************************");
element=DSUtility.StringInput();
//	boolean found=DSUtility.serachString(word, element);
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

