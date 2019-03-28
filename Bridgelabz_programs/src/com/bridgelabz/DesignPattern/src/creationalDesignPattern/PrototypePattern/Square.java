package creationalDesignPattern.PrototypePattern;

public class Square extends Shape {
public Square() {
	type="Square";
	
}
@Override
public void draw() {
	System.out.println("Inside SQUARE methods.");
}
}
