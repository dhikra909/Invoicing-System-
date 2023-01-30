package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class reportinvis {

	
	public static void reportinvis() {
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		String sql2 = "SELECT * FROM  invoices";
		Connection con1 = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con1 = DriverManager.getConnection(url, user, pass);
			PreparedStatement stmt = con1.prepareStatement(sql2);

			ResultSet resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				System.out.println("phone_number =" + resultSet.getInt("phone_number"));
				System.out.println("invoice_date =" + resultSet.getInt("invoice_date"));
				System.out.println("customer_full_name =" + resultSet.getNString("customer_full_name"));
				System.out.println("number_of_items =" + resultSet.getInt("number_of_items"));
				System.out.println("total_amount =" + resultSet.getInt("total_amount"));
				System.out.println("balanc =" + resultSet.getInt("balanc"));

			}
		}
		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
