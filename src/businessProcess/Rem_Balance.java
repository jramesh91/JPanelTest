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
			
			if(Month.equals("06")||Month.equals("6"))//||(Month=="6")
			{ 
			Date1=Month+Year;	
			
			String sq = "insert into remaining(date1,rem_balance)values('"+Date1+"','"+Rem+"')";
			System.out.println("This insert working");
			stm.executeUpdate(sq);
			}
			else if(Month.equals("12")||Month.equals("Dec"))
			{
				Date1=Month+Year;	
				
				String sq = "insert into remaining(date1,rem_balance)values('"+Date1+"','"+Rem+"')";
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
	
	
	
	
	public static String checkBalance(String Month,String Year)
	{
		 String Date_Check=Month+Year;
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			String query="select rem_balance from remaining where date1='"+Date_Check+"'";
			ResultSet rs=stm.executeQuery(query);
			while(rs.next())
			{
				CurrentBalance=rs.getString(1);
			}
			
			con.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
		return Month;
	}
	
	
	
	public static void updateRemaining(String Copies,String Start_Month,String Start_Year,String End_Month,String End_Year)
	{  String date_start=Start_Month+Start_Year;
		String date_end=End_Month+End_Year;
		int Updated_Copies,Updated_Copies2; //After Deducting the Balance
	
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
			Statement stm = con.createStatement();
			String query="select rem_balance from remaining where date1='"+date_start+"'";
			ResultSet rs=stm.executeQuery(query);
			
			if(rs.next())
			{
			 String Balance_Start=rs.getString(1);
			 Updated_Copies=Integer.parseInt(Balance_Start)-Integer.parseInt(Copies);
				
			
			stm.execute("UPDATE remaining SET rem_balance ='"+ String.valueOf(Updated_Copies) +"' where date1='"+date_start+"'");			
			}
			
			Statement stm1 = con.createStatement();
			String query1="select rem_balance from remaining where date1='"+date_end+"'";
			 rs=stm.executeQuery(query1);
			
			if(rs.next())
			{
			 String Balance_Start=rs.getString(1);
			 Updated_Copies2=Integer.parseInt(Balance_Start)-Integer.parseInt(Copies);
				
			
			stm1.execute("UPDATE remaining SET rem_balance ='"+ String.valueOf(Updated_Copies2) +"' where date1='"+date_end+"'");			
			} 
			
			
			
			
			
			con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			}
		
		
	}
	

}
