package syain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void maininsrt(String url,String user,String pass) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
//		String username = "root";
//		String password = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		if (con != null) {
			System.out.println("Database Connected successfully");

			// Entering the data
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter customer_full_name: ");
			String customer_full_name = scanner.next();
			System.out.println("enter  phone_number : ");
			Integer phone_number = scanner.nextInt();
			System.out.println("enter invoice_date : ");
			Integer invoice_date = scanner.nextInt();
			System.out.println("enter num_results : ");
			Integer num_results = scanner.nextInt();
			System.out.println("enter number_of_items : ");
			Integer number_of_items = scanner.nextInt();
			System.out.println("enter total_amount : ");
			Integer total_amount = scanner.nextInt();
			System.out.println("enter paid_amount : ");
			Integer paid_amount = scanner.nextInt();
			System.out.println("enter balanc : ");
			Integer balanc = scanner.nextInt();
			System.out.println("enter Tel  : ");
			Integer Tel  = scanner.nextInt();
			System.out.println("enter Fax: ");
			Integer Fax = scanner.nextInt();
			System.out.println("enter Email: ");
			String Email = scanner.next();
			System.out.println("enter Website: ");
			String Website = scanner.next();
			System.out.println("enter item_ID  : ");
			Integer item_ID  = scanner.nextInt();
			// Inserting data using SQL query
			String sql = "insert into invoices (customer_full_name,phone_number,invoice_date,num_results,number_of_items,total_amount,paid_amount,balanc,Tel,Fax,Email,Website,item_ID) values('"
					+ customer_full_name + "'," + phone_number + "," + invoice_date + "," + num_results + "," + number_of_items + "," + total_amount + ","
					+ paid_amount + "," + balanc + "," + Tel + "," + Fax  + ",'" + Email + "','" + Website +"',"+ item_ID
					+ ")";
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

	public static void maininsrt_item(String url,String user,String pass) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
//		String username = "root";
//		String password = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		if (con != null) {
			System.out.println("Database Connected successfully");

			// Entering the data
			Scanner scanner = new Scanner(System.in);

			System.out.println("enter item_name: ");
			String item_name = scanner.next();
			System.out.println("enter  unit_price : ");
			Integer unit_price = scanner.nextInt();
			System.out.println("enter quantity : ");
			Integer quantity = scanner.nextInt();
			System.out.println("enter qty_amount : ");
			Integer qty_amount = scanner.nextInt();
			System.out.println("enter price : ");
			Integer price = scanner.nextInt();

			// Inserting data using SQL query
			String sql = "insert into item(item_name,unit_price,quantity,qty_amount,price) values('" + item_name + "',"
					+ unit_price + "," + quantity + "," + qty_amount + "," + price + ")";
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
