package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jpanel.LoginPage;

public class NewCustomerEntry {
	
	public static void saveCustomerDetails(int customer_id, String Full_Name, String door_number, String street, String city, String state, String pincode )
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			String sq = "insert into CUSTOMER(Customer_id,Last_Name,Door_Number,Street_Name,City,State,PinCode) values("+customer_id+",'"+Full_Name+"',"+door_number+",'"+street+"','"+city+"','"+state+"',"+pincode+")";
			stm.execute(sq);
			
			//Try multiple rows to get the password
			/*while(rs.next()){

			String password = rs.getString("pass");
			
			//If the entered password and the password in the databse is the same
			if(password.equals(Pass))
			{
			LoginPage.entry = true;	
			System.out.println("The output is "+password);
			
			}
			
			else
			{
				//do nothing
			
			}
		}*/
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}

}
