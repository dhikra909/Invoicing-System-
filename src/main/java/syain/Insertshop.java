package syain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertshop {

	public static void maininsrt_shop() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");

			// Entering the data
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter Shop_Name: ");
			String Shop_Name = scanner.next();
			System.out.println("enter id : ");
			Integer id = scanner.nextInt();

			// Inserting data using SQL query
			String sql = "insert into Shop_Name(Shop_Name,id) values('" + Shop_Name + "'," + id + ")";
			Statement st = con.createStatement();
			//
			// Executing query
			int m = st.executeUpdate(sql);
			if (m >= 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			// Closing the connections
			con.close();
		} else {
			System.out.println("Database Connection failed");
		}

	}

}
