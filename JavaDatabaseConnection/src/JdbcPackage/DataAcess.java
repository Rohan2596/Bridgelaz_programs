package JdbcPackage;
import java.sql.*;
public class DataAcess {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/AddressBook";
	String username="root";
	String password="test";
	String Query="SELECT * FROM Person";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(Query);
	while(rs.next()) {
		System.out.println(" Name:-"+rs.getString(1).toUpperCase()+" PhoneNUMber:-"+rs.getInt(2)+" City:-"+rs.getString(3));
	}
	st.close();
	con.close();
}
}
