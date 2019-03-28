package JdbcPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//Java Database Connectivity 
/**
 * 
 * @author Rohan Kadam
 * Seven Steps
 * 1. import 
 * 2.load & register the driver
 * 3.Create connection
 * 4.create Statement
 * 5.execute the query
 * 6.process the results
 * 7.close
 */
public class DemoClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/AddressBook";
		String uname="root";
		String pass="test";
	String query="SELECT * FROM Person";
//		String query="INSERT INTO Person VALUES('Ramlala',7894561235,'chennai')";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("DemoClass.main()::driver loaded");
		Connection con=DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection established");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
//		int count =st.executeUpdate(query);
		while(rs.next()) {
			System.out.println(" PhoneNumber:-"+rs.getInt(2)+" Name:-"+rs.getString(1)+" City:-"+rs.getString(3));
		}
//		System.out.println(query);
		st.close();
		con.close();
		
	
	} 

}
