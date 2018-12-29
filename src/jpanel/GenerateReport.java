package jpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.toedter.calendar.JCalendar;

import businessProcess.NewCustomerEntry;
import businessProcess.NewSubscriptionEntry;
import businessProcess.Reporting_BP;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JTable;

public class GenerateReport extends JFrame{
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	     //This is the login page
	    private JTextField textField_6;
	    private JTextField textField_1;
	    private JTable table;
	    private JScrollPane jScroll;
	    String [] column_header= {"Customer ID", "Full Name","Door Number","Street Name","City","State","Pin Code"};
	    String [][] column_value = {{"6897", "fs", "21", "sf", "sf", "sdf", "234"},{"6897", "fs", "21", "sf", "sf", "sdf", "234"}};
	    
	    
	    public GenerateReport() {
	    	
	        super();
	        
	        
	        getContentPane().setLayout(null);
			setSize(800, 800);
			setLocation(450,150);
			
			 JTextPane txtpnNewCustomerEntry = new JTextPane();
		        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
		        txtpnNewCustomerEntry.setBounds(145, 29, 516, 45);
		        txtpnNewCustomerEntry.setText("Search for Subscription Report");
		        getContentPane().add(txtpnNewCustomerEntry);
		        
			
			 JLabel lblMonth = new JLabel("Enter Subscription Month");
			 lblMonth.setForeground(new Color(255, 204, 0));
			 lblMonth.setFont(new Font("Courier", Font.BOLD, 16));
			 lblMonth.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
			 lblMonth.setBounds(98, 125, 301, 26);
		        getContentPane().add(lblMonth);
		        
		        
		        
		        //Customer_ID
		        textField_6 = new JTextField();
		        getContentPane().add(textField_6);
		        textField_6.setBounds(440, 123, 130, 36);
		        textField_6.setColumns(10);
		        textField_6.setText("MM");
		        
		        
		        
		        JLabel lblYear = new JLabel("Enter Subscription Year");
		        lblYear.setForeground(new Color(255, 204, 0));
		        lblYear.setFont(new Font("Courier", Font.BOLD, 16));
		        lblYear.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
		        lblYear.setBounds(98, 181, 301, 26);
			        getContentPane().add(lblYear);
			        
			        //Customer_ID
			        textField_1 = new JTextField();
			        getContentPane().add(textField_1);
			        textField_1.setBounds(440, 171, 130, 36);
			        textField_1.setColumns(10);
			        textField_1.setText("YY");
			        
			        JButton btnGatherReport = new JButton("Generate Report");
			        btnGatherReport.setBackground(new Color(204, 255, 255));
			        btnGatherReport.setBounds(443, 245, 124, 36);
				    getContentPane().add(btnGatherReport);
				    
				    
				    
				    
				    JPanel panel = new JPanel();
				    panel.setBounds(6, 357, 788, 374);
				    
				    getContentPane().add(panel);
				    
				    table = new JTable(column_value, column_header);
				    table.setBounds(6, 357, 788, 374);
				    jScroll = new JScrollPane(table);
				    panel.add(jScroll);
				    
			        
				  //Button to go into New Sub entry page
				    btnGatherReport.addActionListener(new ActionListener() {
				  			
				  			@Override
				  			public void actionPerformed(ActionEvent e) {
				  				// TODO Auto-generated method stub
				  				if(e.getSource()==btnGatherReport)
				  				{
				  					System.out.println("Searching for report");
				  					Reporting_BP.searchReportDetails(textField_6.getText(), textField_1.getText());
				  					
				  					
				  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
				  					
				  					//new ReportResults().setVisible(true);
				  				}
				  			
				  			}
				  		});
	       
	    }
}


/*System.out.println("Entered Generate Panel");
	        JFrame frame = new JFrame("main");
	        //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg"));
	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	      // ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
	       //JLabel lable = new JLabel(ii);
	       //JScrollPane jsp = new JScrollPane(lable);
	       //frame.getContentPane().add(jsp);
	       frame.setSize(500, 500);
	       JButton button = new JButton();
	       button.setSize(new Dimension(50, 50));
	       button.setLocation(500, 350);
	      frame.getContentPane().add(button);
	      
	 frame.setVisible(true);

	        JFrame frame = new JFrame("main");
	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        JPanel newPanel = new JPanel();
	        setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	        frame. setSize(1000, 700);
	        
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        getContentPane().add(newPanel);
	        newPanel.setLayout(new GridLayout(1, 0, 0, 0));
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        txtpnNewCustomerEntry.setText("Generate the report for the Annual Year");
	        
	        
	        JButton btnLogout = new JButton("Logout");
	      
	  
	        JButton btnBack = new JButton("Back");
	        
	        JButton btnCancel = new JButton("Cancel");
	        
	        
	        JButton btnAddMoreDetails = new JButton("Generate");
	      
	          //
	        
	    //Back Button's Action Listener
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
				
				
				//Action Listener for the Logout :)  U'ted @17.12.2018
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
	        
	        
	        pack();
	        setLocationRelativeTo(null);*/