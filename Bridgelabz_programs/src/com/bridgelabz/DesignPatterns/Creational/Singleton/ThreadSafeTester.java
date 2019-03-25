package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class ThreadSafeTester {
public static void main(String[] args) {
	ThreadSafe threadSafe=ThreadSafe.getInstance();
	ThreadSafe threadSafe1=ThreadSafe.getInstanceUsingDoubleLocking(); 
	System.out.println("ThreadSafe:-"+threadSafe.hashCode());
	System.out.println("ThreadSafe:-"+threadSafe1.hashCode());
}


}
