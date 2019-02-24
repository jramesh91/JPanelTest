package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import jpanel.LoginPage;
import jpanel.SearchCustomer;

public class Rem_Balance{
	public static String Date1="";
	public static String June="500";
	public static String Dec="500";
	public static String isAvailable=""; 
	public static String CurrentPromised="";
	//public int Sum=0;  //To add the subscription copies
	
	
	
	public Rem_Balance()
	{
		super();
	}
	
	public static String saveRemDetails(int Date,String Rem)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			String sq = "UPDATE remaining SET number_of_copies ='"+ Rem +"' where date_sub='"+Date+"'";
			
			stm.executeUpdate(sq);
			
			
			con.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
		return Date1;
	}
	
	
	
	
	public static String checkBalance(int Date_Check)
	{
		int Sum=0;
	
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");
			
			
			
			Statement stm = con.createStatement();
			String query="select * from remaining where date_sub='"+Date_Check+"'";
			ResultSet rs=stm.executeQuery(query);
			while(rs.next())
			{
				isAvailable = rs.getString("number_of_copies");
			}
			
			Statement stm1 = con.createStatement();
			String queryPromised="select copies from new_subscription where Sub_Date='"+Date_Check+"'AND isShipped ='No' AND status = 'Active'";
			ResultSet rs1=stm1.executeQuery(queryPromised);
			while(rs1.next())
			{
				Sum = Sum + Integer.parseInt(rs1.getString("copies"));
			}
			CurrentPromised = String.valueOf(Sum);
	
			con.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
		return "Checking Balance";
	}
	
	
	
	public static void updateRemaining(String Copies,int sub_date)
	{  
		
		 int Balance = 0;//After Deducting the Balance
	
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");
			
			
			Statement stm = con.createStatement();
			String query="select number_of_subs from remaining where date_sub='"+sub_date+"'";
			ResultSet rs=stm.executeQuery(query);
			
			if(rs.next())
			{
			Balance =Integer.parseInt(rs.getString(1));		
			}
			
			Balance = Balance + Integer.parseInt(Copies);
			stm.execute("UPDATE remaining SET number_of_subs ='"+ Balance +"' where date_sub='"+sub_date+"'");	
			
			
			
			
			
			
			con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			}
		
		
	}
	
	public static void modifyRemaining(String sub_id, String addBalance)
	{
		
		String sub_date =sub_id;
		String existing_Balance = "0";
		int Balance =0;
		
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");

			
			
			Statement stm = con.createStatement();
			String query="select * from New_Subscription where Subscription_ID='"+sub_id+"'";
			ResultSet rs=stm.executeQuery(query);
			
			if(rs.next())
			{
			sub_date =rs.getString("Sub_Date");	
			existing_Balance = rs.getString("copies");
			}
			
			
			String rem_query="select number_of_subs from remaining where date_sub='"+sub_date+"'";
			ResultSet rs1=stm.executeQuery(rem_query);
			
			if(rs1.next())
			{
			Balance =Integer.parseInt(rs1.getString(1));		
			}
			
			
			Balance = Balance + Integer.parseInt(addBalance) - Integer.parseInt(existing_Balance);
			stm.execute("UPDATE remaining SET number_of_subs ='"+ Balance +"' where date_sub='"+sub_date+"'");	

			con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			}
		
		
		
		
	}
	

}
