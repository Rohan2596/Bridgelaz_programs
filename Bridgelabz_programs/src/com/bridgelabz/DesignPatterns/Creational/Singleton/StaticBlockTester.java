package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class StaticBlockTester {

	public static void main(String[] args) {
     StaticBlockSingleton instance=StaticBlockSingleton.getInstance();
     System.out.println("Instance:-"+instance.hashCode());
     StaticBlockSingleton instance1=StaticBlockSingleton.getInstance();
     System.out.println("Instaces:-"+instance1.hashCode());
	}

}
