package businessProcess;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import jpanel.GenerateReport;





public class Reporting_BP {
	
	public static int main_columnCount;
	private static int array_row = 0;
	
	public static void searchReportDetails(int subDate)
	{
		ArrayList<String> Customer_id = new ArrayList<String>();
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");

			
			
			Statement stm = con.createStatement();
			
			
			String sq = "Select * from NEW_SUBSCRIPTION WHERE sub_Date = '"+subDate+"' AND isShipped ='No' AND Status = 'Active'";
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
		
		
		 //System.out.println("The length of the row is "+rs.);
		 main_columnCount = Customer_id.size();
		 GenerateReport.column_value = new String [main_columnCount][7];
		 
		for(int i=0;i<Customer_id.size();i++)
		{
			System.out.println("\n The customer IDs are "+Customer_id.get(i));
			searchCustomerDetails(Customer_id.get(i));
		}
		array_row = 0;
}
	
	protected static void searchCustomerDetails(String c_id)
	{
		try { 
		//JDBC Driver Setup
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root@123");

		
		
		Statement stm = con.createStatement();
		
		//Select * from Customer WHERE Customer_id = '6897';
		String sq = "Select * from Customer WHERE Customer_id = '"+c_id+"'";
		 ResultSet rs = stm.executeQuery(sq);
		 ResultSetMetaData metadata = rs.getMetaData();
		 int columnCount = metadata.getColumnCount();  
		
		 //System.out.println("The length of the row is "+rs.);
		 
		 
		
		//Try multiple rows to get the values
		while(rs.next()){
	        //String row = "";
			System.out.println("the array count is "+array_row);
	        for (int i = 1; i <= columnCount; i++) {
	        	GenerateReport.column_value[array_row][i-1] = rs.getString(i);
	           
	        }
	        array_row = array_row+1;
	        System.out.println("The columnd Length is"+Arrays.toString(GenerateReport.column_value));
		}
		con.close();
		
	}
	catch(Exception e) {
		
		System.out.println(e);
		
	}
	}
	
	
}
