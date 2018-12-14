package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class NewSubscriptionEntry {
	private static String sub_Start;
	private static String Sub_End;
	public static void saveSubscriptionDetails(String sub_id, int customer_id, String date, String amount)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			
			
			Calculate_subscription(date);
			
			String sq = "insert into NEW_SUBSCRIPTION(Subscription_ID,Customer_id,Payment_Date,Number_of_Subscriptions,Amount_Paid,Sub_Start,Sub_End) values('"+sub_id+"',"+customer_id+",'"+date+"','"+amount+"','"+sub_Start+"','"+Sub_End+"')";
			stm.execute(sq);
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
	}
	private static void Calculate_subscription(String date)
	{
		//take the year, then the month, if it is between JUne and December, add December and June if not, June and December of the same year. 
	}
	

}
