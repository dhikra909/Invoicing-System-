package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Updeteitem {

	public static void updeteitrm() {
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		String sql2 = "SELECT FROM Employee where unit_price =4";
		Connection con1 = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con1 = DriverManager.getConnection(url, user, pass);
			// Creating a statement
			Statement st = con1.createStatement();
			ResultSet resultSet = st.executeQuery(sql2);
			// System.out.println(resultSet);
			int count=0;
	 {
				Integer unit_price = resultSet.getInt("id");
				System.out.println(unit_price);
				count++;
			}
		}
		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
	
	
	
	
	
	
	
	
	
}
