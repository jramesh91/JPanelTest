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
	
	
	public Rem_Balance()
	{
		super();
	}
	
	public static String saveRemDetails(String Month,String Year,String Rem)
	{
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			
			if(Month.equals("06")||Month.equals("6")||Month.equals("Jun"))//||(Month=="6")||(Month=="Jun")||(Month=="June"))
			{ 
			Date1=Month+Year;	
			
			String sq = "insert into remaining(date1,rem_balance_june,rem_balance_dec)values('"+Date1+"','"+Rem+"','"+Dec +"')";
			System.out.println("This insert working");
			stm.executeUpdate(sq);
			}
			else if(Month.equals("12")||Month.equals("Dec"))
			{
				Date1=Month+Year;	
				
				String sq = "insert into remaining(date1,rem_balance_june,rem_balance_dec)values('"+Date1+"','"+June+"','"+Rem+"')";
				System.out.println("This insert  working");
				stm.executeUpdate(sq);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Have you entered anything other than June,December?","Warning!!!",JOptionPane.ERROR_MESSAGE);
			}
			con.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
		return Date1;
	}
	

}
