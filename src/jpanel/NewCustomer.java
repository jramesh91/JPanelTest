package jpanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/*import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;*/

import businessProcess.NewCustomerEntry;
import businessProcess.NewSubscriptionEntry;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

//THis is for Getting Customer Details
public class NewCustomer extends JFrame{  
	 
	    private JTextField textField;
	    private JTextField textField_1;
	    private JTextField textField_2;
	    private JTextField textField_3;
	    private JTextField textField_4;
	    private JTextField textField_5;
	    private JTextField textField_6;
	    private static int customer_id = Math.round(999 + (int)(Math.random() * 9999));
	    private static int Sub_id = Math.round(999 + (int)(Math.random() * 9999));
	    private JTextField txtCustomerId;
	     //This is the login page
	    
	    
	    
	    public NewCustomer() {
	    	super();
	    	
			// add the panel to this frame
	        getContentPane().setLayout(null);
	        setSize(800, 800);
	        setLocation(450,150);
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(269, 28, 301, 45);
	        txtpnNewCustomerEntry.setText("New Customer Entry");
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setForeground(new Color(255, 204, 0));
	        lblCustomerId.setFont(new Font("Courier", Font.BOLD, 16));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCustomerId.setBounds(282, 105, 130, 26);
	        getContentPane().add(lblCustomerId);
	        
	        //Customer_ID
	        textField_6 = new JTextField();
	        getContentPane().add(textField_6);
	        textField_6.setBounds(440, 103, 130, 36);
	        textField_6.setColumns(10);
	        textField_6.setText(String.valueOf(customer_id));
	        
	        JLabel lblFullName = new JLabel("Full Name");
	        lblFullName.setForeground(new Color(255, 204, 0));
	        lblFullName.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblFullName.setBounds(282, 158, 130, 26);
	        getContentPane().add(lblFullName);

	        //Full_name
	        textField = new JTextField();
	        textField.setBounds(440, 151, 130, 36);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        JLabel lblDoor = new JLabel("Door Number");
	        lblDoor.setForeground(new Color(255, 204, 0));
	        lblDoor.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblDoor.setBounds(282, 204, 130, 26);
	        getContentPane().add(lblDoor);

	        //Door Number
	        textField_1 = new JTextField();
	        textField_1.setBounds(440, 202, 130, 36);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel lblStreetNumber = new JLabel("Street Name");
	        lblStreetNumber.setForeground(new Color(255, 204, 0));
	        lblStreetNumber.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblStreetNumber.setBounds(282, 256, 130, 26);
	        getContentPane().add(lblStreetNumber);
	        
	        //Street
	        textField_2 = new JTextField();
	        textField_2.setBounds(440, 250, 130, 36);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblCity = new JLabel("City");
	        lblCity.setForeground(new Color(255, 204, 0));
	        lblCity.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCity.setBounds(282, 302, 130, 26);
	        getContentPane().add(lblCity);
	        
	        //City
	        textField_3 = new JTextField();
	        textField_3.setBounds(440, 298, 130, 36);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	        JLabel lblState = new JLabel("State");
	        lblState.setForeground(new Color(255, 204, 0));
	        lblState.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblState.setBounds(282, 343, 130, 26);
	        getContentPane().add(lblState);
	        
	        //State
	        textField_4 = new JTextField();
	        textField_4.setBounds(440, 341, 130, 36);
	        getContentPane().add(textField_4);
	        textField_4.setColumns(10);
	        
	        JLabel lblPincode = new JLabel("Pincode");
	        lblPincode.setForeground(new Color(255, 204, 0));
	        lblPincode.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblPincode.setBounds(282, 387, 130, 26);
	        getContentPane().add(lblPincode);
	        
	        //Pincode
	        textField_5 = new JTextField();
	        getContentPane().add(textField_5);
	        textField_5.setBounds(440, 385, 130, 36);
	        textField_5.setColumns(10);
	        
	        JButton btnCancel = new JButton("Cancel");
	        btnCancel.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        btnCancel.setBounds(391, 726, 130, 26);
	        getContentPane().add(btnCancel);
	        
	        JButton btnAddMoreDetails = new JButton("Add more details...");
	        btnAddMoreDetails.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        btnAddMoreDetails.setBounds(533, 726, 247, 26);
	        getContentPane().add(btnAddMoreDetails);
	        
/*	        txtCustomerId = new JTextField();
		    txtCustomerId.setText("Customer ID");
		    txtCustomerId.setBounds(446, 98, 130, 26);
		    getContentPane().add(txtCustomerId);
		    txtCustomerId.setColumns(10);*/
	        
	        JLabel lable = new JLabel("",new ImageIcon("back.jpg"),JLabel.CENTER);
		    lable.setBounds(0, 0, 800, 800);
		    getContentPane().add(lable);
		    
		    
	        
	        
	       
	        //Update the table with the data
	        btnAddMoreDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

			}

		});
		
		
		//Button to go into New Sub entry page
		btnAddMoreDetails.addActionListener(new ActionListener() {
					
					@Override 
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==btnAddMoreDetails)
						{
							
							
							//NewSubscriptionEntry.validateSubId(Sub_id);
							NewSubscriptionEntry.validateSubId(Sub_id);
							System.out.println("This is redirected to Subscription Page");
						
						NewCustomerEntry.saveCustomerDetails(textField_6.getText(), textField.getText(), textField_1.getText(),
								textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText());
						SubscriptionPage.firstAfterLanding = false;
						new SubscriptionPage(textField_6.getText()).setVisible(true);
						dispose();
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
				
	       /*  
	        pack();
	        setLocationRelativeTo(null);*/
	    }
}