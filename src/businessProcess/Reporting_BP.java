package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;



public class Reporting_BP {
	public static void searchReportDetails(String month, String year)
	{
		ArrayList<String> Customer_id = new ArrayList<String>();
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//Select * from NEW_SUBSCRIPTION WHERE (Sub_Start_year = '20' OR sub_end_year ='18')  AND (sub_start_month = '08' OR Sub_end_month ='08');
			String sq = "Select * from NEW_SUBSCRIPTION WHERE (Sub_Start_year = '"+year+"' OR sub_end_year ='"+year+"')  AND (sub_start_month = '"+month+"' OR Sub_end_month ='"+month+"')";
			 ResultSet rs = stm.executeQuery(sq);
			 
			 
			
			//Try multiple rows to get the password
			while(rs.next()){

			
					
					Customer_id.add(rs.getString("customer_id"));
			
			
			
		}
			con.close();
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		for(int i=0;i<Customer_id.size();i++)
		{
			System.out.println("\n The customer IDs are "+Customer_id.get(i));
			searchCustomerDetails(Customer_id.get(i));
		}
}
	
	protected static void searchCustomerDetails(String c_id)
	{
		try { 
		//JDBC Driver Setup
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
		
		
		
		Statement stm = con.createStatement();
		
		//Select * from Customer WHERE Customer_id = '6897';
		String sq = "Select * from Customer WHERE Customer_id = '"+c_id+"'";
		 ResultSet rs = stm.executeQuery(sq);
		 ResultSetMetaData metadata = rs.getMetaData();
		 int columnCount = metadata.getColumnCount();  
		 
		 
		
		//Try multiple rows to get the values
		while(rs.next()){
	        String row = "";
	        for (int i = 1; i <= columnCount; i++) {
	            row += rs.getString(i) + ", ";          
	        }
		row.toString();
		}
		con.close();
	}
	catch(Exception e) {
		
		System.out.println(e);
		
	}
	}
}
