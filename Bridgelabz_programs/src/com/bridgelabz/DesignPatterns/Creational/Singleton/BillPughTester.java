package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class BillPughTester {

	public static void main(String[] args) {
		BillPugh  bp=BillPugh.getInstance();
		System.out.println("billPugh:-"+bp.hashCode());
		BillPugh bp1=BillPugh.getInstance();
		System.out.println("billPugh:-"+bp1.hashCode());

	}

}
