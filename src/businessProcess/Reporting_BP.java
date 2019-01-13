package businessProcess;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import jpanel.GenerateReport;





public class Reporting_BP {
	
	public static int main_columnCount;
	private static int array_row = 0;
	
	public static void searchReportDetails(String month, String year)
	{
		ArrayList<String> Customer_id = new ArrayList<String>();
		
		try { 
			//JDBC Driver Setup
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qwerty", "root", "root");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "Genesys@01");
			
			
			
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
		
		
		 //System.out.println("The length of the row is "+rs.);
		 main_columnCount = Customer_id.size();
		 
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
		GenerateReport.column_value = new String [main_columnCount][columnCount];
		 //System.out.println("The length of the row is "+rs.);
		 
		 
		
		//Try multiple rows to get the values
		while(rs.next()){
	        String row = "";
	        for (int i = 1; i <= columnCount; i++) {
	        	System.out.println("The "+i+"th value is "+rs.getString(i)+" and the column value is "+columnCount);
	            GenerateReport.column_value[array_row][i-1] = rs.getString(i).toString();
	           
	        }
	        array_row++;
		}
		con.close();
	}
	catch(Exception e) {
		
		System.out.println(e);
		
	}
	}
	
	/*private static void sendDataToExcel()
	{
		workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

         CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way 
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(Employee employee: employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getName());

            row.createCell(1)
                    .setCellValue(employee.getEmail());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getDateOfBirth());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3)
                    .setCellValue(employee.getSalary());
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
	}*/
}
