package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import jpanel.SearchCustomerIDPage;

public class SearchforID {

	public static int main_columnCount;
	private static int array_row = 0;

	public static void searchCustomer(String cus) {
		ArrayList<String> Customer_id = new ArrayList<String>();

		try {
			// JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");

			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root",
			"Genesys@01");

			Statement stm = con.createStatement();
			String sq = "Select * from Customer WHERE Last_name LIKE '" + cus + "%'";
			ResultSet rs = stm.executeQuery(sq);

			while (rs.next()) {
				Customer_id.add(rs.getString("customer_id"));
			}
			con.close();
		} catch (Exception e) {

			System.out.println(e);

		}

		// System.out.println("The length of the row is "+rs.);
		main_columnCount = Customer_id.size();
		SearchCustomerIDPage.column_value = new String[main_columnCount][7];

		for (int i = 0; i < Customer_id.size(); i++) {
			System.out.println("\n The customer IDs are " + Customer_id.get(i));
			searchCustomerDetails(Customer_id.get(i));
		}
		array_row = 0;
	}

	protected static void searchCustomerDetails(String c_id) {
		try {
			// JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");

			 //Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root","root");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");

			Statement stm = con.createStatement();
			System.out.println("Accessing the db..");
			// Select * from Customer WHERE Customer_id = '6897';
			String sq = "Select * from Customer WHERE Customer_id = '" + c_id + "'";
			ResultSet rs = stm.executeQuery(sq);
			ResultSetMetaData metadata = rs.getMetaData();
			int columnCount = metadata.getColumnCount();

			

			// Try multiple rows to get the values
			while (rs.next()) {
				// String row = "";
				System.out.println("the array count is " + array_row);
				for (int i = 1; i <= columnCount; i++) {
					SearchCustomerIDPage.column_value[array_row][i - 1] = rs.getString(i);

				}
				array_row = array_row + 1;
				System.out.println("The column Length is" + Arrays.toString(SearchCustomerIDPage.column_value));
			}
			con.close();

		} catch (Exception e) {

			System.out.println(e);

		}
	}

}
