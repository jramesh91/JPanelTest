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
	public static String CurrentBalance="";
	public static int Sum=0;  //To add the subscription copies
	
	
	
	public Rem_Balance()
	{
		super();
	}
	
	public static String saveRemDetails(int Date,String Rem)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
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
	
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			String query="select copies from new_subscription where sub_date='"+Date_Check+"'";
			ResultSet rs=stm.executeQuery(query);
			while(rs.next())
			{
				
				Sum+=Integer.parseInt(rs.getString(1));
			}
			System.out.println("The Number Of Copies Promised:"+ Sum);
		/*	
			Statement Update=con.createStatement();
			String Update_Query="UPDATE remaining SET number_of_copies='"+Sum+"' ";
			Update.executeUpdate(Update_Query);*/
			
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
			
			
		//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			String query="select number_of_subs from remaining where date_sub='"+sub_date+"'";
			ResultSet rs=stm.executeQuery(query);
			
			if(rs.next())
			{
			Balance =Integer.parseInt(rs.getString(1));		
			}
			
			Balance = Balance + Integer.parseInt(Copies);
			stm.execute("UPDATE remaining SET number_of_subs ='"+ Balance +"' where date_sub='"+sub_date+"'");	
			
			/*Statement stm1 = con.createStatement();
			String query1="select rem_balance from remaining where date1='"+date_end+"'";
			 rs=stm.executeQuery(query1);
			
			if(rs.next())
			{
			 String Balance_Start=rs.getString(1);
			 Updated_Copies2=Integer.parseInt(Balance_Start)-Integer.parseInt(Copies);
				
			
			stm1.execute("UPDATE remaining SET rem_balance ='"+ String.valueOf(Updated_Copies2) +"' where date1='"+date_end+"'");			
			} 
			*/
			
			
			
			
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
			
			
		//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
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
			
			/*Statement stm1 = con.createStatement();
			String query1="select rem_balance from remaining where date1='"+date_end+"'";
			 rs=stm.executeQuery(query1);
			
			if(rs.next())
			{
			 String Balance_Start=rs.getString(1);
			 Updated_Copies2=Integer.parseInt(Balance_Start)-Integer.parseInt(Copies);
				
			
			stm1.execute("UPDATE remaining SET rem_balance ='"+ String.valueOf(Updated_Copies2) +"' where date1='"+date_end+"'");			
			} 
			*/
			
			
			
			
			con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			}
		
		
		
		
	}
	

}
