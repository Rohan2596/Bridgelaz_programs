package com.bridgelabz.DataStructure;
class Node<T>{
	T data;
	Node next;
}
public class Linkedlist {   
Node head=null;
public void printlist() {
	Node n=head;
	while(n.next!=null) {
		System.out.print(n.data+" ");
		
		n=n.next;

	}

	System.out.println(n.data+" ");
}
public boolean isEmpty() {
	if(head==null) {
		return true;
		
	}
	return false ;
}
public <T> void insertAtLast(T data)
{
	Node node = new Node();
	node.data = data;
	if(head == null)
	{
		head = node;
		node.next = null;
	}
	else
	{
		Node n = head;
		while(n.next!=null)
		{
			n = n.next;
		}
		node.next = null;
		n.next = node;
	}
}

 public <T> void delete(T element) {
	 Node n=head;
	 Node prev=head;
	 if(n.data.equals(element)) {
		 head=n.next;
		 return;
	 }
	 while(n.next!=null) {
		 {
			 if(element.equals(n.data)) {
			 prev.next=n.next;
			 return;
			 }
			 prev=n;
			 n=n.next;
		 }
		 }prev.next=null;
	 }
 public <T> T deletefirst() {
	 T item;
	 Node n=head;
	 head=n.next;
	 item=(T) n.data;
	 return item;
 }
 public <T>  T deleteAtlast() {
	 if(head==null) 
		 return null;
	 else {
		 Node n=head;
		 Node prev=head;
		 while(n.next!=null) {
			 prev=n;
		
			 n=n.next;
			
		 }
	 
	 T data=(T)n.data;
	 prev.next=null;
	 return data;
	 }
 }
 public <T> boolean search(T element) {
	 Node n=head;
	 while(n!=null) {
		 if(element.equals(n.data)) {
			 return true;}
			n=n.next; 
		 
	 }
	 return false;
	 }

 public void sortList()
	{
		Node n = head;
		Node prev;
		prev=n.next;
		while(n.next!=null)
		{
			while(prev!=null)
			{
				int a = Integer.parseInt((String) n.data);
				int b = Integer.parseInt((String) prev.data);
				if (a>b) 
	    		{
	    			int t = a;
	    			n.data=String.valueOf(b);
	    			prev.data = String.valueOf(t);
	    		}
				prev=prev.next;
			}	
			n=n.next;
			prev=n.next;
		}
}
 
 public <T> T getlast() {
	 Node temp = head;
	 while(temp.next==null) {
		 temp = temp.next;
	 }
	 System.out.println(temp.data+"Returning");
	 return (T)temp.data;
 }
 public <T> T get() {
	 Node n=head;
	 if(n.next==null) {
		 return (T)n.data;
	 }head=n.next;
	 return (T)n.data;
 }

 public <T> T getFirst() {
	 Node temp = head;
	if(head != null) {
		head = head.next;
		return (T)temp.data;
	}
	return null;
 }
 
public static <T> void main(String[] args) {
	Linkedlist list=new Linkedlist();
	list.insertAtLast(1);
	list.insertAtLast(5);
	list.insertAtLast("c");
	list.insertAtLast("11");
	list.insertAtLast("9");
	list.insertAtLast("8");
	list.insertAtLast("7");
	
//	list.sortList();
//	list.delete("rohan");
	list.printlist();
	
}
}


