package businessProcess;

import java.sql.*;

import jpanel.LoginPage;

//Class to validate the Login and Password
public class LoginValidation {
	
	//Connect to the Database to retrieve user ID and Password
	public static void connectDatabase(String user, String Pass)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			String sq = "Select * from Admin_table where Admin_id = '"+user+"'";
			ResultSet rs = stm.executeQuery(sq);
			
			//Try multiple rows to get the password
			while(rs.next()){

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
		}
			//Close the database Connection
			con.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}

}
