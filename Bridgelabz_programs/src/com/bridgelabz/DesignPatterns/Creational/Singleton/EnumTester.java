package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class EnumTester {

	public static void main(String[] args) {
	EnumMethod en=EnumMethod.INSTANCE;
    System.out.println("Enum1:- "+en.hashCode());
    EnumMethod en1=EnumMethod.INSTANCE;
    System.out.println("Enum2:- "+en1.hashCode());


	}

}
