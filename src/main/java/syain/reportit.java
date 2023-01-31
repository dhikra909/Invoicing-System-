package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Reportit {
	public static void reportitm(String url,String user,String pass) {
//		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
//		// Username and password to access DB
//		// Custom initialization
//		String user = "root";
//		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		String sql2 = "SELECT * FROM  item";
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
