package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Reporting_BP {
	public static void saveCustomerDetails(String month, String year)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			//String sq = "Search customer_id from NEW_SUBSCRIPTION New(Customer_id,Last_Name,Door_Number,Street_Name,City,State,PinCode) values("+customer_id+",'"+Full_Name+"',"+door_number+",'"+street+"','"+city+"','"+state+"',"+pincode+")";
			//stm.execute(sq);
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}

}
