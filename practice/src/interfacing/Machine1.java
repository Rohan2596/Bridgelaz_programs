package interfacing;

public class Machine1 implements info {
	private int id2 = 7;
	public void start() {
		System.out.println("Machine started");
		
	}
	@Override
	public void showinfo() {
		System.out.println("Person id %2d:-"+id2);
		
	}

}
