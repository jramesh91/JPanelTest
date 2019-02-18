package jpanel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;*/

import businessProcess.NewCustomerEntry;


import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

//THis is for Getting Customer Details
public class NewCustomer extends JFrame{  
	 
	    private static JTextField textField;
	    private static JTextField textField_1;
	    private static JTextField textField_2;
	    private static JTextField textField_3;
	    private static JTextField textField_4;
	    private static JTextField textField_5;
	    private static JTextField textField_6;
	    
	    public static String customer;
	    public static String fullName = "";
	    public static String door = "";
	    public static String street = "";
	    public static String city = "";
	    public static String state = "";
	    public static String pincode = "";
	    
	    
	    private static int customer_id = Math.round(999 + (int)(Math.random() * 9999));
	   

	     //This is the login page
	    
	    
	    
	    public NewCustomer() {
	    	super();
	    	
	    	
	    	
			// add the panel to this frame
	        getContentPane().setLayout(null);
	        setSize(900, 900);
	        setLocation(450,150);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	        
	        ImageIcon img = new ImageIcon("RIESI_Logo.png");
	        setIconImage(img.getImage());
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(269, 28, 301, 45);
	        txtpnNewCustomerEntry.setText("New Customer Entry");
	        txtpnNewCustomerEntry.setEditable(false);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setForeground(new Color(2, 255, 234));
	        lblCustomerId.setFont(new Font("Courier", Font.BOLD, 16));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCustomerId.setBounds(269, 133, 156, 42);
	        getContentPane().add(lblCustomerId);
	        
	        //Customer_ID
	        textField_6 = new JTextField();
	        getContentPane().add(textField_6);
	        textField_6.setBounds(440, 133, 199, 45);
	        textField_6.setColumns(10);
	        textField_6.setText(String.valueOf(customer_id));
	        
	        JLabel lblFullName = new JLabel("Full Name");
	        lblFullName.setForeground(new Color(2, 255,234));
	        lblFullName.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblFullName.setBounds(269, 205, 130, 26);
	        getContentPane().add(lblFullName);

	        //Full_name
	        textField = new JTextField(fullName);
	        textField.setBounds(440, 194, 199, 45);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        JLabel lblDoor = new JLabel("Door Number");
	        lblDoor.setForeground(new Color(2, 255, 234));
	        lblDoor.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblDoor.setBounds(269, 270, 156, 26);
	        getContentPane().add(lblDoor);

	        //Door Number
	        textField_1 = new JTextField(door);
	        textField_1.setBounds(440, 251, 199, 45);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel lblStreetNumber = new JLabel("Street Name");
	        lblStreetNumber.setForeground(new Color(2, 255, 234));
	        lblStreetNumber.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblStreetNumber.setBounds(269, 321, 143, 36);
	        getContentPane().add(lblStreetNumber);
	        
	        //Street
	        textField_2 = new JTextField(street);
	        textField_2.setBounds(440, 312, 199, 45);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblCity = new JLabel("City");
	        lblCity.setForeground(new Color(2, 255, 234));
	        lblCity.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblCity.setBounds(269, 373, 130, 45);
	        getContentPane().add(lblCity);
	        
	        //City
	        textField_3 = new JTextField(city);
	        textField_3.setBounds(440, 373, 199, 45);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	        JLabel lblState = new JLabel("State");
	        lblState.setForeground(new Color(2, 255, 234));
	        lblState.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblState.setBounds(269, 431, 130, 45);
	        getContentPane().add(lblState);
	        
	        //State
	        textField_4 = new JTextField(state);
	        textField_4.setBounds(440, 434, 199, 45);
	        getContentPane().add(textField_4);
	        textField_4.setColumns(10);
	        
	        JLabel lblPincode = new JLabel("Pincode");
	        lblPincode.setForeground(new Color(2, 255, 234));
	        lblPincode.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblPincode.setBounds(269, 492, 143, 48);
	        getContentPane().add(lblPincode);
	        
	        //Pincode
	        textField_5 = new JTextField(pincode);
	        getContentPane().add(textField_5);
	        textField_5.setBounds(440, 495, 199, 45);
	        textField_5.setColumns(10);
	        
	        JButton btnCancel = new JButton("Cancel");
	        btnCancel.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        btnCancel.setBounds(342, 726, 179, 45);
	        getContentPane().add(btnCancel);
	        
	        JButton btnAddMoreDetails = new JButton("Add more details...");
	        btnAddMoreDetails.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        btnAddMoreDetails.setBounds(533, 726, 247, 45);
	        getContentPane().add(btnAddMoreDetails);
	        

	        JLabel Home = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
		    Home.setBounds(0, 0, 1000, 1000);
		    getContentPane().add(Home);

	       
	      //Back Button's Action Listener
	        btnCancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==btnCancel)
					{
						System.out.println("Again to the LANDING PAGE!");
						dispose();
						new LandingPage().setVisible(true);
					}
				
				}
			});
		
		
		//Button to go into New Sub entry page
		btnAddMoreDetails.addActionListener(new ActionListener() {
					
					@Override 
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
						if(e.getSource()==btnAddMoreDetails)
						{
							setTextField(textField.getText());
							setTextField_1(textField_1.getText());
							setTextField_2(textField_2.getText());
							setTextField_3(textField_3.getText());
							setTextField_4(textField_4.getText());
							setTextField_5(textField_5.getText());
							setTextField_6(textField_6.getText());
							

							System.out.println("This is redirected to Subscription Page");
						
						
						SubscriptionPage.firstAfterLanding = false;
						if(NewCustomerEntry.check)
						{
						new SubscriptionPage(getTextField_6()).setVisible(true);
						dispose();
						}
						}
					
					}
					catch (NullPointerException ex)
					{
						JOptionPane.showMessageDialog(null, "Please enter all the details", "Something wrong", JOptionPane.WARNING_MESSAGE);
						
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
				
	    
	    }


		public static String getTextField() {
			return textField.getText();
		}


		public static void setTextField(String textField) {
			fullName = textField;
		}


		public static String getTextField_1() {
			return textField_1.getText();
		}


		public static void setTextField_1(String textField_1) {
			door = textField_1;
		}


		public static String getTextField_2() {
			return textField_2.getText();
		}


		public static void setTextField_2(String textField_2) {
			street = textField_2;
		}


		public static String getTextField_3() {
			return textField_3.getText();
		}


		public static void setTextField_3(String textField_3) {
			city = textField_3;
		}


		public static String getTextField_4() {
			return textField_4.getText();
		}


		public static void setTextField_4(String textField_4) {
			state = textField_4;
		}


		public static String getTextField_5() {
			return textField_5.getText();
		}


		public static void setTextField_5(String textField_5) {
			pincode  = textField_5;
		}


		public static String getTextField_6() {
			return textField_6.getText();
		}


		public static void setTextField_6(String textField_6) {
			customer = textField_6;
		}


		public static int getCustomer_id() {
			return customer_id;
		}


		public static void setCustomer_id(int customer_id) {
			NewCustomer.customer_id = customer_id;
		}
}