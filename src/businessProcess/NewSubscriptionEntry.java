package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class NewSubscriptionEntry {
	private static String sub_Start;
	private static String Sub_End;
	public static void saveSubscriptionDetails(String sub_id, int customer_id, String date, String amount,String StartD,String EndD,String Rem,String msg) //Added "Boolean Message" as a parameter
	{ 
		
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			
			
			Calculate_subscription(date);
			//@15.12.2018 A few columns have been added and few removed.Do execute the queries in MySql:Check the GDrive for Queries 
			String sq = "insert into NEW_SUBSCRIPTION(Subscription_ID,Customer_id,Payment_Date,Amount_Paid,Sub_Start,Sub_End,Remarks,isShipped) values('"+sub_id+"',"+customer_id+",'"+date+"','"+amount+"','"+StartD+"','"+EndD+"','"+Rem+"','"+msg+"')";
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
