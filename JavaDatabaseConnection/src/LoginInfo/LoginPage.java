package LoginInfo;

import java.sql.*;

public class LoginPage {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/LOGININFO";
		String uname = "root";
		String pass = "test";

		do {
			System.out.println("1.Login");
			System.out.println("2.New Registration");
			System.out.println("3.Delete");
			System.out.println("4.Show Database");
			System.out.println("5.Exit");
			System.out.println("Enter the choice");
			int ch = LoginServices.integerInput();
			switch (ch) {
			case 1:
				System.out.println("Login");
				String query = "select * from INFO";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uname, pass);
//				System.out.println("LoginPage.main()");

				PreparedStatement preparedStatement = con.prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery();

				System.out.println("Enter the username");
				String username = LoginServices.stringInput();
				System.out.println("Enter the Password");
				String password = LoginServices.stringInput();
				boolean login = true;
				while (resultSet.next() && login == true) {
//					System.out.println("USERNAME:- " + resultSet.getString(1));
					if ((username.equals(resultSet.getString(1))) && (password.equals(resultSet.getString(2)))) {
						System.out.println("Login successfull");
						login = false;
					} else {
						login = true;

					}
				}
				break;
			case 2:
				System.out.println("Registration of new User");
				System.out.println("Enter the username");
				String username1 = LoginServices.stringInput();
				System.out.println("Enter the Password");
				String password2 = LoginServices.stringInput();
				String query1 = "INSERT INTO INFO VALUES(\"" + username1 + "\",\"" + password2 + "\")";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con1 = DriverManager.getConnection(url, uname, pass);
				Statement preparedStatement1 = con1.createStatement();
				int resultSet1 = preparedStatement1.executeUpdate(query1);

				break;
			case 3:
				System.out.println("");
				System.out.println("Deleting  of User using username");
				System.out.println("Enter the username");
				String username2 = LoginServices.stringInput();

				String query2 = "DELETE FROM INFO WHERE USERNAME = (\"" + username2 + "\")";
			Class.forName("com.mysql.jdbc.Driver");
				Connection con2 = DriverManager.getConnection(url, uname, pass);
				Statement preparedStatement2 = con2.createStatement();
				int resultSet2 = preparedStatement2.executeUpdate(query2);

				break;
			case 4:
				System.out.println("Show the Database");
				String Query="SELECT * FROM INFO";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con3=DriverManager.getConnection(url,uname,pass);
				Statement statement=con3.createStatement();
				ResultSet rs=statement.executeQuery(Query);
				while(rs.next()) {
					System.out.println("Username:- "+rs.getString(1)+" Password:- "+rs.getString(2));
				}
				

				break;
			case 5:
				System.out.println("Program Quited");
				return;
			}
		} while (true);

	}

}
