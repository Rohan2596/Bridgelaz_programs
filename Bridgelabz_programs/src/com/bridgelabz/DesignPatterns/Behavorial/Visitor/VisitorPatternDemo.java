package com.bridgelabz.DesignPatterns.Behavorial.Visitor;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerParts computerParts=new Computer();
		computerParts.accept(new ComputerPartDisplayVisitor());
	}
}
