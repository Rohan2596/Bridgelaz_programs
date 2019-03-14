package com.Bridgelabz.practice;
class Frog1{
	private int id;
	private String name;
	public Frog1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return String.format("%2d : %s",id,name);
//		StringBuilder sb =new StringBuilder();
//		sb.append(id).append(" : ").append(name);
//		return sb.toString();
		
	}
}
public class StringType {

	public static void main(String[] args) {
//		String text="hello";
//		
//		String blank =" ";
//		String name="bob";
//		String gretting =text+blank+ name;
//		System.out.println(text);
//		System.out.println(gretting);
//		System.out.println("hello" + " "+"Bob");
//		System.out.println("My Integer is "+text +".");
//		byte a=126;
//		System.out.println(a);
//		a++;
//		System.out.println(a);
//		a++;
//		System.out.println(a);
		Frog1 frog1 =new Frog1(7,"freddy");
		Frog1 frog2 =new Frog1(8,"Fredddda");
		System.out.println(frog1);
		System.out.println(frog2);
		
	}

}
