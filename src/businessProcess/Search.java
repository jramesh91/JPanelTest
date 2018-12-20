package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jpanel.LoginPage;
import jpanel.SearchCustomer;

public class Search{
	public Search()
	{
		super();
	}
	
	public static String searchCustomerDetails(String customer_id)
	{
		String customer_id1 = null;
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			String sq = " SELECT * from Customer inner join new_subscription on Customer.customer_id=new_subscription.customer_id where customer.customer_id='"+customer_id+"' ";
			ResultSet rss=stm.executeQuery(sq);
			while(rss.next())
			{
				 customer_id1=rss.getString(1);
				 String customer_id12 = rss.getString(4);
				 String customer_id3 = rss.getString(8);
				 String customer_id4 = rss.getString(7);
				 System.out.println(customer_id1+customer_id12);
				
			}
			
			
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		return customer_id1;
		
	}

}
