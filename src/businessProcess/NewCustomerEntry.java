package businessProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

import jpanel.LoginPage;

public class NewCustomerEntry {
	public static boolean check = true;
	
	public static void saveCustomerDetails(String customer_id, String Full_Name, String door_number, String street, String city, String state, String pincode )
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			//statement to fetch the user ID's entire Row
			String sq = "insert into CUSTOMER(Customer_id,Last_Name,Door_Number,Street_Name,City,State,PinCode) values("+customer_id+",'"+Full_Name+"','"+door_number+"','"+street+"','"+city+"','"+state+"',"+pincode+")";
			stm.execute(sq);
			
			//Close the database Connection
			con.close();
			check = true;
			
			
		}
		
		catch(MySQLSyntaxErrorException e) {
			
			System.out.println("1");
			JOptionPane.showMessageDialog(null, "Please enter all the details", "Something wrong", JOptionPane.WARNING_MESSAGE);
			check = false;
			
		}
		catch(SQLException f)
		{
			System.out.println("2");
			JOptionPane.showMessageDialog(null, "Please enter all the details", "Something wrong", JOptionPane.WARNING_MESSAGE);
			check = false;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("3");
			JOptionPane.showMessageDialog(null, "Please enter all the details", "Something wrong", JOptionPane.WARNING_MESSAGE);
			check = false;
		}
		
		
	}

}
