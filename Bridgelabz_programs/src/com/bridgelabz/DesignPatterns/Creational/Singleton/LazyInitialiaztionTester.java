package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class LazyInitialiaztionTester {

	

	public static void main(String[] args) {
		LazyInitialization lis=LazyInitialization.getInstance();
		System.out.println("LazyInitialization1"+lis.hashCode());
		LazyInitialization lis1=LazyInitialization.getInstance();
		System.out.println("LazyInitialization2"+lis1.hashCode());
	}
	}

	

