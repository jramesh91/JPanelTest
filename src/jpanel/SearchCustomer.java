package jpanel;
import businessProcess.*;

import java.awt.Color;
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
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.toedter.calendar.JCalendar;

import businessProcess.NewCustomerEntry;
import businessProcess.NewSubscriptionEntry;
import businessProcess.Search_Customer;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SearchCustomer extends JFrame{
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	     
	   Search_Customer s=new Search_Customer();
	   private JTextField textField;
	   private JTextField textField_1;
	   private JTextField textField_2;
	   private JTextField textField_3;
	   private JTextField textField_4;
	   private JTextField textField_5;
	   private static String cust_id="";
	   private JTextField textField_7;
	   private JTextField textField_8;
	   private JTextField textField_9;
	   private JTextField textField_14;
	   private JTextField textField_15;
	   private JTextField textField_10;
	   private JTextField textField_11;
	    
	    
	    public SearchCustomer() {
	        super();
	        getContentPane().setLayout(null);
	        setSize(900, 900);
	        setLocation(450,150);
	        setResizable(false);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        ImageIcon img = new ImageIcon("RIESI_Logo.png");
		    setIconImage(img.getImage());
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(269, 28, 301, 45);
	        txtpnNewCustomerEntry.setText("Search Customer");
	        txtpnNewCustomerEntry.setEditable(false);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        JButton home_button = new JButton("Back");
	        home_button.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        home_button.setBounds(391, 726, 130, 26);
		    getContentPane().add(home_button);
	        
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setForeground(new Color(0,255,0));
	        lblCustomerId.setFont(new Font("Courier", Font.BOLD,26));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblCustomerId.setBounds(194, 107, 130,26);
	        getContentPane().add(lblCustomerId);
	        
	        //Getting Customer_ID inorder to search
	        JTextField textField_6 = new JTextField();
	        
	        getContentPane().add(textField_6);
	        textField_6.setBounds(327, 103, 130, 36);
	        textField_6.setColumns(10);
	        textField_6.setText(cust_id);
	        
	        JButton btnSearch = new JButton("Search");
	        btnSearch.setBounds(528, 107, 115, 29);
	        getContentPane().add(btnSearch);
	        
	        JLabel lblFullName = new JLabel("Full Name");
	        lblFullName.setForeground(new Color(0,255,0));
	        lblFullName.setBounds(41, 226, 115, 20);
	        lblFullName.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        getContentPane().add(lblFullName);
	        
	        textField = new JTextField();
	        textField.setBounds(178, 219, 146, 36);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        //textField.setText(Search.first_name);
	        
	        JLabel lblStreetName = new JLabel("Street Name");
	        lblStreetName.setForeground(new Color(0,255,0));
	        lblStreetName.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblStreetName.setBounds(41, 278, 122, 20);
	        getContentPane().add(lblStreetName);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(178, 271, 146, 36);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel lblDoorNumber = new JLabel("Door Number");
	        lblDoorNumber.setForeground(new Color(0,255,0));
	        lblDoorNumber.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblDoorNumber.setBounds(41, 330, 130, 20);
	        getContentPane().add(lblDoorNumber);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(178, 323, 146, 36);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblCity = new JLabel("City");
	        lblCity.setForeground(new Color(0,255,0));
	        lblCity.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblCity.setBounds(41, 382, 69, 20);
	        getContentPane().add(lblCity);
	        
	        JLabel lblState = new JLabel("State");
	        lblState.setForeground(new Color(0,255,0));
	        lblState.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblState.setBounds(41, 434, 69, 20);
	        getContentPane().add(lblState);
	        
	        JLabel lblPincode = new JLabel("Pincode");
	        lblPincode.setForeground(new Color(0,255,0));
	        lblPincode.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
	        lblPincode.setBounds(41, 486, 89, 20);
	        getContentPane().add(lblPincode);
	        
	        textField_3 = new JTextField();
	        textField_3.setBounds(178, 427, 146, 36);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	        textField_4 = new JTextField();
	        textField_4.setBounds(178, 479, 146, 36);
	        getContentPane().add(textField_4);
	        textField_4.setColumns(10);
	        
	        textField_5 = new JTextField();
	        textField_5.setBounds(178, 375, 146, 36);
	        getContentPane().add(textField_5);
	        textField_5.setColumns(10);
		    
		    JLabel label = new JLabel("");
		    label.setBounds(410, 152, 69, 20);
		    getContentPane().add(label);
		    
		    JLabel lblSubscriptionId = new JLabel("Subscription ID");
		    lblSubscriptionId.setForeground(new Color(0,255,0));
		    lblSubscriptionId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblSubscriptionId.setBounds(375, 226, 174, 20);
		    getContentPane().add(lblSubscriptionId);
		    
		    JLabel lblAmountPaid = new JLabel("Amount Paid");
		    lblAmountPaid.setForeground(new Color(0,255,0));
		    lblAmountPaid.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblAmountPaid.setBounds(375, 330, 146, 20);
		    getContentPane().add(lblAmountPaid);
		    
		    JLabel lblDateOfPayment = new JLabel("Date of Payment");
		    lblDateOfPayment.setForeground(new Color(0,255,0));
		    lblDateOfPayment.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblDateOfPayment.setBounds(375, 278, 146, 20);
		    getContentPane().add(lblDateOfPayment);
		    
		    JLabel lblRemarks = new JLabel("Remarks");
		    lblRemarks.setForeground(new Color(0,255,0));
		    lblRemarks.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblRemarks.setBounds(178, 560, 102, 20);
		    getContentPane().add(lblRemarks);
		    
		    JLabel lblShippedstIssue = new JLabel("Shipped 1st Issue?");
		    lblShippedstIssue.setForeground(new Color(0,255,0));
		    lblShippedstIssue.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblShippedstIssue.setBounds(127, 642, 197, 20);
		    getContentPane().add(lblShippedstIssue);
		    
		    JLabel lblSubscriptionStart = new JLabel("Subscription Start");
		    lblSubscriptionStart.setForeground(new Color(0,255,0));
		    lblSubscriptionStart.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    lblSubscriptionStart.setBounds(375, 382, 174, 20);
		    getContentPane().add(lblSubscriptionStart);
		    
		    textField_7 = new JTextField();
		    textField_7.setBounds(601, 219, 161, 36);
		    getContentPane().add(textField_7);
		    textField_7.setColumns(10);
		    
		    textField_8 = new JTextField();
		    textField_8.setBounds(601, 273, 161, 33);
		    getContentPane().add(textField_8);
		    textField_8.setColumns(10);
		    
		    textField_9 = new JTextField();
		    textField_9.setBounds(601, 324, 161, 34);
		    getContentPane().add(textField_9);
		    textField_9.setColumns(10);
		    
		    textField_14 = new JTextField();
		    textField_14.setBounds(327, 557, 301, 45);
		    getContentPane().add(textField_14);
		    textField_14.setColumns(10);
		    
		    textField_15 = new JTextField();
		    textField_15.setBounds(327, 636, 76, 36);
		    getContentPane().add(textField_15);
		    textField_15.setColumns(10);
		    
		    textField_10 = new JTextField();
		    textField_10.setColumns(10);
		    textField_10.setBounds(601, 376, 161, 34);
		    getContentPane().add(textField_10);
		    
		    JLabel label_1 = new JLabel("Subscription Length");
		    label_1.setForeground(Color.GREEN);
		    label_1.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 20));
		    label_1.setBounds(375, 433, 194, 20);
		    getContentPane().add(label_1);
		    
		    textField_11 = new JTextField();
		    textField_11.setColumns(10);
		    textField_11.setBounds(601, 428, 161, 34);
		    getContentPane().add(textField_11);
	        
		    
			
		    JLabel lable = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
		    lable.setBounds(0, 0, 1000, 1000);
		    getContentPane().add(lable);
	        
	        btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(e.getSource()==btnSearch)
					{	 cust_id=textField_6.getText();
						if(cust_id.equals(""))
						{
						//Pop Up for Empty Box
						JOptionPane.showMessageDialog(null, "Enter the Customer ID", "Invalid Details", JOptionPane.WARNING_MESSAGE);
						}
					System.out.println("Searching Customers");
						Search_Customer.searchCustomerDetails(cust_id);
						textField.setText(Search_Customer.first_name);
						textField_1.setText(Search_Customer.Street);
						textField_2.setText(Search_Customer.Door);
						textField_5.setText(Search_Customer.City);
						textField_3.setText(Search_Customer.State);
						textField_4.setText(Search_Customer.Pin);
						textField_7.setText(Search_Customer.Sub_ID);
						textField_8.setText(Search_Customer.DOP);
						textField_9.setText(Search_Customer.AmtPaid);
						textField_10.setText(Search_Customer.Sub_Start);
						textField_11.setText(Search_Customer.Sub_Length);
						textField_14.setText(Search_Customer.Remarks);
						textField_15.setText(Search_Customer.isShipped); 
						//dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					
	  					//new SearchCustomer().setVisible(true);
						
						
					}
						
					
				}

			});
	        
	        //Enter Key
	        textField_6.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	        	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
	        		System.out.println("Enter Key is pressed!I hope");
	        		cust_id=textField_6.getText();
	        		
					Search_Customer.searchCustomerDetails(cust_id);
					textField.setText(Search_Customer.first_name);
					textField_1.setText(Search_Customer.Street);
					textField_2.setText(Search_Customer.Door);
					textField_5.setText(Search_Customer.City);
					textField_3.setText(Search_Customer.State);
					textField_4.setText(Search_Customer.Pin);
					textField_7.setText(Search_Customer.Sub_ID);
					textField_8.setText(Search_Customer.DOP);
					textField_9.setText(Search_Customer.AmtPaid);
					textField_10.setText(Search_Customer.Sub_Start);
					textField_11.setText(Search_Customer.Sub_Length);
					textField_14.setText(Search_Customer.Remarks);
					textField_15.setText(Search_Customer.isShipped);
	        	}
	        	
	        	}
	        	
	        });
	        
	        
	        //Back Button's Action Listener
	        home_button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==home_button)
					{
						System.out.println("Again to the LANDING PAGE!");
						dispose();
						new LandingPage().setVisible(true);
					}
				
				}
			});
		
	    }
}