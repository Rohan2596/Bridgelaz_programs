package JdbcPackage;
import java.lang.Class;
public class Demo1Class {

	public static void main(String[] args) throws  ClassNotFoundException {
//		PQR obj=new PQR();
	Class.forName("PQR");
	}

}

class PQR{
	static {
		System.out.println("IN STATIC");
	}
	{
		System.out.println("IN INStANCES");
	}
}