package com.bridgelabz.DesignPatterns.Creational.Singleton;

import java.lang.reflect.Constructor;

public class Reflection {
public static void main(String[] args) {
	EagerInitialization instanceOne=EagerInitialization.getInstance();
	EagerInitialization instanceTwo=null;
	try {
		Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			constructor.setAccessible(true);
			instanceTwo=(EagerInitialization)constructor.newInstance();
		    break;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("InstanceOne:-"+instanceOne.hashCode());
	System.out.println("Instancetwo:-"+instanceTwo.hashCode());
}
}
