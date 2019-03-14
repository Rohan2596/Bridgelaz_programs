package interfacing;

public class App2 {
	public static void main(String[] args) {
		Machine1 mach1= new Machine1();
		mach1.start();
		Person person1 =new Person("Bob");
		person1.greet();
		info info1= new Machine1();
		info1.showinfo();
		info info2 =new Machine1();
		info2.showinfo();
		System.out.println();
		outputinfo(mach1);
		outputinfo(person1);
		
	}
	private static void outputinfo(info info1) {
		info1.showinfo();
	}
}
