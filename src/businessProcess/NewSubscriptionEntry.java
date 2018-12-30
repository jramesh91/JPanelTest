package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class NewSubscriptionEntry {


	
	private static String sub_id;
	public static void saveSubscriptionDetails(String customer_id, String date, String amount,String StartMonth, String StartYear,String EndMonth, String EndYear,String Rem,String msg) //Added "Boolean Message" as a parameter
	{ 
			
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			
			
			//Calculate_subscription(StartD,EndD);
			
			//First check if the Customer ID in the Subscription table already exist, if yes, then update the entire data. 
			//UPDATE table_name
			//SET column1 = value1, column2 = value2, ...
			//		WHERE condition;
			
			String sq0 = "update NEW_SUBSCRIPTION(Subscription_ID,Payment_Date,Amount_Paid,Sub_Start_Month,Sub_Start_Year,Sub_End_Month,Sub_End_Year,Remarks,isShipped) values('"+sub_id+"','"+date+"','"+amount+"','"+StartMonth+"','"+StartYear+"','"+EndMonth+"','"+EndYear+"','"+Rem+"','"+msg+"') WHERE customer_id ='"+customer_id+"'"; 
			
			
			//@15.12.2018 A few columns have been added and few removed.Do execute the queries in MySql:Check the GDrive for Queries 
			String sq = "insert into NEW_SUBSCRIPTION(Subscription_ID,Customer_id,Payment_Date,Amount_Paid,Sub_Start_Month,Sub_Start_Year,Sub_End_Month,Sub_End_Year,Remarks,isShipped) values('"+sub_id+"',"+customer_id+",'"+date+"','"+amount+"','"+StartMonth+"','"+StartYear+"','"+EndMonth+"','"+EndYear+"','"+Rem+"','"+msg+"')";
			stm.execute(sq);
			
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
	}
	
	
	
	private static void Calculate_subscription(String Start, String End)
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
			
			System.out.println("Static var is "+subs_id);	

			
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
