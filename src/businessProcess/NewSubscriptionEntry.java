package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class NewSubscriptionEntry {
	private static String sub_Start;
	private static String Sub_End;
	
	private static String sub_id;
	public static void saveSubscriptionDetails(String customer_id, String date, String amount,String StartD,String EndD,String Rem,String msg) //Added "Boolean Message" as a parameter
	{ 
		
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
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
	public static void validateSubId(int subs_id) {
		// TODO Auto-generated method stub
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			
			
			
			//Check if the ID exist
			String sq = "Select * from NEW_SUBSCRIPTION where Subscription_ID ='"+subs_id+"'";
			ResultSet rs = stm.executeQuery(sq);
			
			while(rs.next())
			{
				System.out.println("R value is "+rs.getRow());
				System.out.println(subs_id+" is the Sub ID");
				
				subs_id++;
				
				
			}
			
			sub_id = String.valueOf(subs_id);
			
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			System.out.println("Thappu da naaye");
			
		}
		
		
	}
	

}
