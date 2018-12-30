package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jpanel.LoginPage;
import jpanel.SearchCustomer;

public class Search_Customer{
	public static  String Door="";
	public static  String City ="";
	public static String State="" ;
	public static String Pin="" ;
	public static  String Cust_ID="" ;
	public static  String AmtPaid ;
	public static String DOP ;
	public static  String Start_Mth ;
	public static  String Start_Year ;
	public static  String End_Mth ;
	public static  String End_Year ;
	public static  String Remarks ;
	public static  String Street;
	public static String customer_id1;
	public static String first_name="";
	public static String isShipped;
	
	public Search_Customer()
	{
		super();
	}
	
	public static String searchCustomerDetails(String customer_id)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
		//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			String sq = " SELECT * from Customer inner join new_subscription on Customer.customer_id=new_subscription.customer_id where customer.customer_id='"+customer_id+"' ";
			ResultSet rss=stm.executeQuery(sq);
			while(rss.next())
			{
				 customer_id1=rss.getString("Customer_id");
				 //System.out.println("Static Value wo initializing "+first_name);
				 first_name = rss.getString("Last_Name");
				 Street=rss.getString("Street_Name");
				 Door=rss.getString("Door_Number");
				 City=rss.getString("City");
				 State=rss.getString("State");
				 Pin=rss.getString("PinCode");
				 Cust_ID=rss.getString("Customer_id");
				 AmtPaid=rss.getString("Amount_Paid");
				 DOP=rss.getString("Payment_Date");
				 Start_Mth=rss.getString("Sub_Start_month");
				 Start_Year=rss.getString("Sub_Start_year");
				 End_Mth=rss.getString("Sub_End_Month");
				 End_Year=rss.getString("Sub_End_year");
				 Remarks=rss.getString("Remarks");
				 isShipped=rss.getString("isShipped");
			
				
				
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