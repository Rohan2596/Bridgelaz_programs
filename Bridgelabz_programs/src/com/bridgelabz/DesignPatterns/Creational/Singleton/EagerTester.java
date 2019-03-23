package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class EagerTester {

	public static void main(String[] args) {
     EagerInitialization instance1=EagerInitialization.getInstance();
     System.out.println("Instance 1 hash:-"+instance1.hashCode());
     EagerInitialization instance2=EagerInitialization.getInstance();
     System.out.println("Instance 1 hash:-"+instance2.hashCode());


	}

}
