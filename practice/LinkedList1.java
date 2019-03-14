//package com.bridgelabz.DataStructure;
//
//class Node1
//{
//	String data;
//	Node1 next;
//}
////class LinkedList: Contains structure and functions of structure of LinkedList
//public class LinkedList1
//	{
//		Node1 head = null;
//		/**
//		 * Function : Function which Performs Insert operation on LinkedList
//		 * @param data : String Value
//		 */
//		public void insertAtLast(String data)
//		{
//			Node1 node = new Node1();
//			node.data = data;
//			if(head == null)
//			{
//				head = node;
//				node.next = null;
//			}
//			else
//			{
//				Node1 n = head;
//				while(n.next!=null)
//				{
//					n = n.next;
//				}
//				node.next = null;
//				n.next = node;
//			}
//		}
//		/**
//		 * Function : Function Which Delete Elements from Linked List 
//		 * @param element : String Value
//		 */
//		public void delete(String element)
//		{
//			Node1 n = head;
//			Node1 prev = head;
//			if(n.data.equals(element)) {
//				head = n.next;
//				return;
//			}
//			while(n.next!=null)
//			{			
//				if(element.equals(n.data))
//				{
//					prev.next = n.next;
//					return;
//				}
//				prev = n;
//				n=n.next;
//			}
//			prev.next = null;
//		}
//		/**
//		 * Function : To delete element at first
//		 */
//		public String deleteAtFirst()
//		{
//			String item;
//			Node1 n = head;
//			head = n.next;
//			item = n.data;
//			return item;
//		}
//		/**
//		 * Function : To delete a node at last
//		 */
//		public String deleteAtLast()
//		{
//			if(head == null)
//				return null;
//			else
//			{
//				Node1 n = head;
//				Node1 prev = head;
//				while(n.next!=null)
//				{
//					prev = n;
//					n = n.next;
//				}	
//				String data = n.data;
//				prev.next = null;
//				return(data);
//			}
//		}
//		/**
//		 * Function : Function to Sort a Linked List
//		 */
//		public void sortList()
//		{
//			Node1 n = head;
//			Node1 prev;
//			prev=n.next;
//			while(n.next!=null)
//			{
//				while(prev.next!=null)
//				{
//					int a = Integer.parseInt(n.data);
//					int b = Integer.parseInt(prev.data);
//					if (a>b) 
//		    		{
//		    			int t = a;
//		    			n.data=String.valueOf(b);
//		    			prev.data = String.valueOf(t);
//		    		}
//					prev=prev.next;
//				}	
//				n=n.next;
//				prev=n.next;
//			}
//		}
//		//It is a Function which displays Linked List 
//		public void show()
//		{
//			Node1 n = head;
//			while(n.next!=null)
//			{
//				System.out.print(n.data+" ");
//				n = n.next;
//			}
//			System.out.print(n.data+" ");
//		}
//		
//		public String get()
//		{
//			Node1 n = head;
//			if(n.next==null) {
//				head=null;
//				return n.data;
//			}
//			head=n.next;
//			return n.data;
//		}
//		//Function to search element in a Linked List
//		public boolean search(String element)
//		{
//			Node1 n =head;
//			while(n!=null)
//			{
//				if(element.equals(n.data))
//					return true;
//				n = n.next;
//			}
//			return false;
//		}
//		//It is a which which check whether a list is empty or not
//		public boolean isEmpty() {
//			if(head==null) {
//				return true;
//			}
//			return false;
//		}
//
//}
////////////////////////////////////////
//String element;
////Creation of Linked List Object
//LinkedList wordList = new LinkedList();
//String word[] = null;
////Calling to readFile function to read a file
//word = DSUtility.readFile(word);
//// Using for each loop to add item in linked list
//for(String item : word)
//{
//	wordList.insertAtLast(item);
//}
////Calling to show function to display Linked List
//wordList.show();
//System.out.println("Enter a Word:=");
////calling to function to get an input from user
//element = Utility.singleStringInput();
////calling to search function to search element in Linked List
//boolean found = Utility.searchString(word, element);
//if(found)
//	wordList.delete(element);
//else
//{
//	wordList.insertAtLast(element);
//}
//wordList.sortList();
////Calling to show function to display Linked List
//wordList.show();
////Calling to writeFile function to write a file a file
//wordList = DSUtility.writeFile(wordList);
