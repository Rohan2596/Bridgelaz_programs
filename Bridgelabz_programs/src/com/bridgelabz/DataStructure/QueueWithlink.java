package com.bridgelabz.DataStructure;
/**
 * BuildingQueue Class using Linked list
 * @author Rohan Kadam
 *
 * @param <T> Generic
 */
public class QueueWithlink<T>{
Linkedlist list= new Linkedlist();
public void  engueu(T element) {
	list.insertAtLast(element);
}
public T dequeu() {
	return list.deletefirst();
	}
public void display() {
	list.getlast();
	}
public boolean isEmpty() {
return list.isEmpty();
}
}
