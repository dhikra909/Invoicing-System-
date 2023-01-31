package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Reportst {

	public static void reportst() {
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		String sql2 = "SELECT (SELECT count(*) from invoices ) As No_of_Invoices,"
				+ "(SELECT count(*) from item) As No_Of_Items ,"
				+ "(SELECT SUM(unit_price) from item) AS Total_Sales ; ";
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
				System.out.println("No_of_Invoices =" + resultSet.getInt("No_of_Invoices"));
				System.out.println("No_Of_Items =" + resultSet.getInt("No_Of_Items"));
				System.out.println("Total_Sales =" + resultSet.getInt("Total_Sales"));

			}
		}
		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}

}
