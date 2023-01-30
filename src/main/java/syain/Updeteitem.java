package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Updeteitem {

	public static void updatitemp() {

		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item_ID: ");
		Integer idInput = scanner.nextInt();

		String sql2 = "UPDATE item SET price= 9 where item_ID<=" + idInput;

		Connection con1 = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con1 = DriverManager.getConnection(url, user, pass);
			// Creating a statement
			Statement st = con1.createStatement();

		}
		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}

	}

}
