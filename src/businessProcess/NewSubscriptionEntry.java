package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class NewSubscriptionEntry {


	public static String isAvailable_Start="";
	public static String isAvailable_End="";
	
	private static String sub_id;
	public static void saveSubscriptionDetails( String customer_id, String date, String amount,int SubMonth, String sub_length,String Rem,String msg,String copies,String Status) //Added "Boolean Message" as a parameter
	{ 
			
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		    //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			
			
			//Calculate_subscription(StartD,EndD);
			
			//First check if the Customer ID in the Subscription table already exist, if yes, then update the entire data. 
			//UPDATE table_name
			//SET column1 = value1, column2 = value2, ...
			//		WHERE condition;
			
			//@15.12.2018 A few columns have been added and few removed.Do execute the queries in MySql:Check the GDrive for Queries 
			String sq = "insert into NEW_SUBSCRIPTION(Customer_id,Payment_Date,Amount_Paid,Sub_Date,sub_length,Remarks,isShipped,copies,status) values("+customer_id+",'"+date+"','"+amount+"','"+SubMonth+"','"+sub_length+"','"+Rem+"','"+msg+"','"+copies+"','"+ Status +"')";
			stm.execute(sq);
			
			
			
			
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
	}
	
	
	
	
	public static void validateSubId(int subs_id) {
		// TODO Auto-generated method stub
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
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
	
	
	
	//Modify Subscription Method:
	public static String modifySubscription(String Subscription_ID,String isShipped,String Status,String Copies,String Remarks)
	{
		System.out.println("SubsId id:"+Subscription_ID+ "    Issue Status:"+isShipped+"    Active/Inactive:"+Status);
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			//Statement Execution Part
			Statement stm = con.createStatement();
			String update_query="UPDATE new_subscription SET Remarks='"+Remarks+"',isShipped='"+ isShipped+"',status='"+Status +"', copies='"+Copies +"'  WHERE Subscription_ID='"+Subscription_ID +"' ";
		    stm.executeUpdate(update_query);
		    con.close();
			}
		catch(Exception e)
		{
			System.out.println("Exception in Updation is: "+e);
		}
		
		return "Good";
	}
	
	
	
	
	

}
