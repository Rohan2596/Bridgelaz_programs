package com.bridgelabz.DataStructure;
/**
 * To print elements in Queue
 * @author Rohan Kadam
 *
 */
public class Queue {
char [] items=new char[100];
  static int i=1;
public void pushQ(char x) {
	if(isfull()==true) {
	System.out.println("Queue is full");
}else {
	items[i++]=x;
}}
public char popQ() {
	if(isEmpty()==true) {
		System.out.println("Stack is empty");
		return '\0';
	}
	else {
		char element=items[i];
		--i;
		return element;
	}
}
public int peekQ() {
	i++;
	System.out.println(items[i]);
return items[i];
}

public boolean isEmpty() {
	return (i==-1)?true:false;
}
public boolean isfull() {
	return(i==99)?true:false;
}

public static void main(String args[]) {
	Queue queue=new Queue();
	queue.pushQ('r');
	queue.peekQ();
}}