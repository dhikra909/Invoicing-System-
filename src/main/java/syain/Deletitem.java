package syain;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Deletitem {

	public static void main() {
		String url = "jdbc:mysql://localhost:3306/my_Dataapi";
		String user = "root";
		String pass = "root";
		Integer item_ID = 5;
		String item_name = "omd";
		Integer unit_price = 112519;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			java.sql.Statement st = con.createStatement();

			// Deleting from database
			String q1 = "DELETE from item " + "WHERE item_ID = 1 ";
			System.out.println(q1);
			int x = st.executeUpdate(q1);

			if (x > 0)
				System.out.println(" Successfully Updated");
			else
				System.out.println("ERROR OCCURRED :(");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
