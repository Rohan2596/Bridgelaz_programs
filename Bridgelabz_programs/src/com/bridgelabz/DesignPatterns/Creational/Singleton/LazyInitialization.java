package com.bridgelabz.DesignPatterns.Creational.Singleton;
import java.util.*;
public class LazyInitialization {
 private static LazyInitialization firstInstance=null;
 String [] scrabblerletters= {"a", "a", "a", "a", "a", "a", "a", "a", "a",
		"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
         "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
         "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
         "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
         "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
         "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
         "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

 private LinkedList<String> letterList=new LinkedList<String>(Arrays.asList(scrabblerletters));
 
 
 private LazyInitialization() {}
 public static LazyInitialization getInstance() {
	if(firstInstance==null) {
		firstInstance=new LazyInitialization();
	}
	return  firstInstance;
 }
}
