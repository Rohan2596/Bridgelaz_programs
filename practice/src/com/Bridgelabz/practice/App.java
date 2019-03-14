package com.Bridgelabz.practice;
//class Person{
//	String name;
//	int age;
//	void greet() {
//		System.out.println("hello to you");
//	}
//	int claculateYearToRetirement() {
//		int yearLeft=65-age;
//		System.out.println(yearLeft);
//		return yearLeft;
//	}
//	int getAge() {
//		return age;
//	}
//	String getName(){
//		return name;
//	}
//	void speak() {
//		for (int i=0;i<3;i++) {
//		System.out.println("My name is:- "+name+"and i am "+age+" years old");
//	}}
//}
//class Robot{
//	public void speak(String text){
//		System.out.println(text);
//		}
//	public void jump(int height) {
//		System.out.println("Jumping:"+height);
//	}
//	public void move(String direction,double distance) {
//		System.out.println("moving"+ distance +"meters in direction"+ direction);
//	}
//}
class Frog{
	private String name;
	 private int age;
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class App {
	public static void main(String[] args) {
//		Person person1 =new Person();
//		person1.name="joe bloggs";
//		person1.age=37;
//		person1.speak();
//		person1.greet();
//		int Age=person1.getAge();
//		String name=person1.getName()
//		int years=person1.claculateYearToRetirement();
//		System.out.println("years till retirements"+years);
//		Person person2  = new Person();
//		person2.age=20;
//		person2.name="sarah smiths";
//		person2.speak();
//		person2.greet();
//		int years1= person2.claculateYearToRetirement();
//		System.out.println("years till retirements"+years1);
//	System.out.println(person1.name);
//	System.out.println(person2.name);
//		Robot sam=new Robot();
//		sam.speak("hi I'm Sam");
//		sam.jump(7);
//		sam.move("west", 12.2);
//		String greeting="hello there";
//		sam.speak(greeting);
//		int value =14;
//		sam.jump(value);
		Frog frog1= new Frog();
//		frog1.name="Bertie";
//		frog1.age=1;
		frog1.setAge(1);
		frog1.setName("Bertie");
		System.out.println(frog1.getName()+"="+frog1.getAge());
		}

}
