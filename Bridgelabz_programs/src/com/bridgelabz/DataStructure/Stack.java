package com.bridgelabz.DataStructure;

public class Stack {
	char [] items=new char[100];
	int i=-1;

public  void push(char x) {
	if(isFull()==true) {
		System.out.println("Stack is Full");
	}else {
		items[++i]=x;
	} 
}
public  char pop( ) {
	if(isEmpty()==true) {
		System.out.println("Stack is Empty");
		return '\0';
	 
	}
	else {
		char element  = items[i];
		i--;
        return element;
	}

}
public boolean isEmpty() {
	return (i==-1)?true:false;
	}
public boolean isFull() {
	return (i==99)?true:false;
}

}
