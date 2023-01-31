package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search {

	public static void Searchinv() {
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("invo_number : ");
		Integer invo_number = scanner.nextInt();
		

		String sql2 = "SELECT * FROM invoices INNER JOIN item "
				+ "ON item.item_ID = invoices.item_ID WHERE invoices.id = " + invo_number;
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
				System.out.println("customer_full_name =" + resultSet.getNString("customer_full_name"));
				System.out.println("phone_number =" + resultSet.getInt("phone_number"));
				System.out.println("invoice_date =" + resultSet.getInt("invoice_date"));
				System.out.println("num_results =" + resultSet.getInt("num_results"));
				System.out.println("number_of_items =" + resultSet.getInt("number_of_items"));
				System.out.println("total_amount =" + resultSet.getInt("total_amount"));
				System.out.println("paid_amount =" + resultSet.getInt("paid_amount"));
				System.out.println("balanc =" + resultSet.getInt("balanc"));
				System.out.println("Tel =" + resultSet.getInt("Tel"));
				System.out.println("Fax =" + resultSet.getInt("Fax"));
				System.out.println("Email =" + resultSet.getNString("Email"));
				System.out.println("Website =" + resultSet.getNString("Website"));
				System.out.println("item_ID =" + resultSet.getInt("item_ID"));
				System.out.println("item_name =" + resultSet.getNString("item_name"));
				System.out.println("unit_price =" + resultSet.getInt("unit_price"));
				System.out.println("quantity =" + resultSet.getInt("quantity"));
				System.out.println("qty_amount =" + resultSet.getInt("qty_amount"));
				System.out.println("price =" + resultSet.getInt("price"));
				System.out.println("id =" + resultSet.getInt("id"));
				

			}
		}
		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
	
	
}
