package jpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import businessProcess.Reporting_BP;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTable;

public class GenerateReport extends JFrame{
	    private static DefaultTableModel tableModel;
	    private JTable table;
	    private JScrollPane jScroll;
	    public static String [] column_header= {"Customer ID", "Full Name","Door Number","Street Name","City","State","Pin Code"};
	    public static String column_ToPrint= "Customer ID, Full Name,Door Number,Street Name,City,State,Pin Code";
	    public static String [][] column_hea= {{"Customer ID", "Full Name","Door Number","Street Name","City","State","Pin Code"},{"Customer ID", "Full Name","Door Number","Street Name","City","State","Pin Code"}};
	    public static Object [][] column_value;
	    public static Object [][] column_toPrint;
	    
	    
	    public GenerateReport() {
	    	
	        super();
	        
	        
	        getContentPane().setLayout(null);
			setSize(900, 900);
			setResizable(false);
			setLocation(450,150);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			 JTextPane txtpnNewCustomerEntry = new JTextPane();
		        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
		        txtpnNewCustomerEntry.setBounds(98, 27, 503, 45);
		        txtpnNewCustomerEntry.setText("Search for Subscription Report");
		        txtpnNewCustomerEntry.setEditable(false);
		        getContentPane().add(txtpnNewCustomerEntry);
		        
		        
		        ImageIcon img = new ImageIcon("RIESI_Logo.png");
		        setIconImage(img.getImage());
			
		        JLabel lblMonth = new JLabel("Enter Subscription Date");
		        lblMonth.setForeground(new Color(2,255,234));
		        lblMonth.setFont(new Font("Courier", Font.BOLD, 16));
		        lblMonth.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
		        lblMonth.setBounds(98, 125, 311, 34);
		        getContentPane().add(lblMonth);
			        
			    JButton btnGatherReport = new JButton("Generate Report");
			    btnGatherReport.setBackground(new Color(204, 255, 255));
			    btnGatherReport.setBounds(618, 123, 166, 36);
				getContentPane().add(btnGatherReport);
				    
				    
				    
				    
				JPanel panel = new JPanel();
				panel.setBounds(47, 227, 788, 374);
				getContentPane().add(panel);
				    
				tableModel = new DefaultTableModel(column_header,100);
				table = new JTable(tableModel);
				table.setBounds(6, 357, 788, 374);
				jScroll = new JScrollPane(table);
				panel.add(jScroll);
				    
				JButton btnBack = new JButton("Back");
				btnBack.setBounds(214, 698, 124, 36);
				getContentPane().add(btnBack);
				    
				JButton btnLogout = new JButton("Logout");
				btnLogout.setBounds(648, 16, 115, 29);
				getContentPane().add(btnLogout);
				    
				JDateChooser dateChooser = new JDateChooser();
				dateChooser.setBounds(443, 125, 147, 34);
				getContentPane().add(dateChooser);
				    
				JButton btnExport = new JButton("Export");
			    btnExport.setBounds(631, 698, 130, 36);
			    getContentPane().add(btnExport);
				    
			    DateFormat month_year = new SimpleDateFormat("MMYYYY");
				    
				    
					//ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
			    JLabel lable = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
			    lable.setBounds(0, 0, 894, 1000);
			    getContentPane().add(lable);
				    
				    
			        
				    //Button to go into New Sub entry page
			    btnGatherReport.addActionListener(new ActionListener() {
				    	
				  			
				  			@Override
				  			public void actionPerformed(ActionEvent e) {
				  				try {
				  					
				  				// TODO Auto-generated method stub
				  					if(e.getSource()==btnGatherReport)
				  				{
				  					System.out.println("Searching for report");
				  					int date_of_sub = Integer.parseInt(month_year.format(dateChooser.getDate()));
				  					Reporting_BP.searchReportDetails(date_of_sub);
				  					tableModel.getDataVector().removeAllElements();
				  					tableModel.fireTableDataChanged();
				  					for(int i = 0; i<column_value.length; i++)
				  					{
				  					tableModel.insertRow(i, column_value[i]);
				  					
				  					}
				  						
				  				}
				  				
				  				column_toPrint = column_value;
				  				column_value = null;
				  				
				       
				  			}
				  			
				  			catch (NullPointerException ex)
							{
								JOptionPane.showMessageDialog(null, "Please Select a date before generating a report", "Error", JOptionPane.WARNING_MESSAGE);
								
							}
							}
				  		});
				    
				    
				    
				    
				    
				  //Action Listener for the Logout
					btnLogout.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(e.getSource()==btnLogout)
							{System.out.println("Confirming....");
							JDialog.setDefaultLookAndFeelDecorated(true);
						    int response = JOptionPane.showConfirmDialog(null, "You Sure?You want to Logout?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						    if (response == JOptionPane.NO_OPTION)
						    {
						      System.out.println("Confirmation Declined");
						    } else if (response == JOptionPane.YES_OPTION)
						    {
						      System.out.println("Confirmation Accepted");
						      dispose();
						      LoginPage.entry=false;
						      new LoginPage().setVisible(true);
						    } }
						
						}
					});
					
					
					
					btnBack.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(e.getSource()==btnBack)
							{
								System.out.println("Again to the LANDING PAGE!");
								dispose();
								new LandingPage().setVisible(true);
							}
						
						}
					});
					
					btnExport.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							try {
							if(e.getSource()==btnExport)
							{
								System.out.println("Creating a file and putting the data in");
								String filename = Integer.parseInt(month_year.format(dateChooser.getDate()))+".txt";
								try {
									PrintWriter outputStream = new PrintWriter(filename);
									outputStream.println(column_ToPrint);
									for(int i = 0; i<column_toPrint.length; i++)
				  					{
										for(int j=0; j <= 6; j++)
										{
										outputStream.print(String.valueOf(column_toPrint[i][j])+" ,");
										}
										outputStream.println();
				  					}
									
									outputStream.close();
									JOptionPane.showMessageDialog(null, "File has been created in the name of "+filename, "Data export Confirmation", JOptionPane.INFORMATION_MESSAGE);
								}
								catch (FileNotFoundException ex)
								{
									ex.printStackTrace();
									
								}
								
								
							}
						
						}
						
						catch (NullPointerException ex)
						{
							JOptionPane.showMessageDialog(null, "Please generate report before exporting", "No File Generated", JOptionPane.WARNING_MESSAGE);
							
						}
						}
					});
				    
				    
	    }
}



