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
	public static void saveSubscriptionDetails( String customer_id, String date, String amount,int SubMonth, String sub_length,String Rem,String msg,String copies) //Added "Boolean Message" as a parameter
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
			
			//@15.12.2018 A few columns have been added and few removed.Do execute the queries in MySql:Check the GDrive for Queries 
			String sq = "insert into NEW_SUBSCRIPTION(Customer_id,Payment_Date,Amount_Paid,Sub_Date,sub_length,Remarks,isShipped,copies) values("+customer_id+",'"+date+"','"+amount+"','"+SubMonth+"','"+sub_length+"','"+Rem+"','"+msg+"','"+copies+"')";
			stm.execute(sq);
			
			
			String search_customer = "Select * from NEW_SUBSCRIPTION where customer_id ='"+customer_id+"'";
			ResultSet r = stm.executeQuery(search_customer);
			//stm.execute(sq);
			
			/*if (!r.next() ) {
				//INSERT A NEW ROW
				stm.execute(sq);
			} 
			else
			{
				//UPDATE THE EXISTING ROW
				String sq0 = "update NEW_SUBSCRIPTION(Payment_Date,Amount_Paid,Sub_Start_Month,Sub_Start_Year,Sub_End_Month,Sub_End_Year,Remarks,isShipped) values('"+date+"','"+amount+"','"+StartMonth+"','"+StartYear+"','"+EndMonth+"','"+EndYear+"','"+Rem+"','"+msg+"') WHERE customer_id ='"+customer_id+"'"; 
				stm.execute(sq0);
			}*/
			
			
			
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
	
	
	public static String checkAvailability(String Copies,String Start_Month,String Start_Year,String End_Month,String End_Year) {
	System.out.println("Value of Copy is"+Copies);
	try { 
		//JDBC Driver Setup
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
		
		
		Statement stm = con.createStatement();
		
		
		String date_query=Start_Month+Start_Year;
		String date_query_end=End_Month+End_Year;
		
		
		String select_query="select rem_balance from remaining where date1='"+date_query+"' ";
		ResultSet rs=stm.executeQuery(select_query);
		
		while(rs.next())
		{
			if(Integer.parseInt(Copies)<= Integer.parseInt(rs.getString(1)))
			{
				isAvailable_Start="Yes";
				System.out.println("Copies are available for June!");
			}
			else
			{
				isAvailable_Start="No";
				System.out.println("Copies aren't available for June!");
			}
		}
		
		
		
		String select_query1="select rem_balance from remaining where date1='"+date_query_end+"' ";
		ResultSet rs1=stm.executeQuery(select_query1);
		
		while(rs1.next())
		{
			if(Integer.parseInt(Copies)<= Integer.parseInt(rs1.getString(1)))
			{
				isAvailable_End="Yes";
				System.out.println("Copies are available for Dec!");
			}
			else
			{
				isAvailable_End="No";
				System.out.println("Copies aren't available for Dec!");
			}
		}
			
			con.close();
	}
		
		
	
	
	catch(Exception e) {
		
		System.out.println(e);
		System.out.println(":(");}
		
	return Copies;	
	}
	

}
