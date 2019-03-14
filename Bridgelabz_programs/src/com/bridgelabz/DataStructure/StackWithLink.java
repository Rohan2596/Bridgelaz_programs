package com.bridgelabz.DataStructure;

public class StackWithLink<T> {

	Linkedlist list = new Linkedlist();
	
	public void push(T element) {
		list.insertAtLast(element);
	}
	public T pop() {
		return list.deleteAtlast();
	}
	public void peak() {
		list.getlast();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
