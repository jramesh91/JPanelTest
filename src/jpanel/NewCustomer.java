package jpanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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

import javax.swing.JTextPane;
import java.awt.Font;

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
	     //This is the login page
	    
	    
	    
	    public NewCustomer() {
	        super("JPanel Demo Program");
	        JPanel newPanel = new JPanel();
	        GridBagLayout gbl_newPanel = new GridBagLayout();
	        gbl_newPanel.columnWidths = new int[]{111, 139, 123, 211, 0};
	        gbl_newPanel.rowHeights = new int[]{47, 38, 37, 37, 39, 37, 34, 36, 0, 0, 0};
	        gbl_newPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
	        gbl_newPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	        newPanel.setLayout(gbl_newPanel);
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        getContentPane().add(newPanel);
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        txtpnNewCustomerEntry.setText("New Customer Entry");
	        GridBagConstraints gbc_txtpnNewCustomerEntry = new GridBagConstraints();
	        gbc_txtpnNewCustomerEntry.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnNewCustomerEntry.gridx = 0;
	        gbc_txtpnNewCustomerEntry.gridy = 0;
	        newPanel.add(txtpnNewCustomerEntry, gbc_txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        GridBagConstraints gbc_btnLogout = new GridBagConstraints();
	        gbc_btnLogout.insets = new Insets(0, 0, 5, 0);
	        gbc_btnLogout.gridx = 3;
	        gbc_btnLogout.gridy = 0;
	        newPanel.add(btnLogout, gbc_btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        GridBagConstraints gbc_lblCustomerId = new GridBagConstraints();
	        gbc_lblCustomerId.insets = new Insets(0, 0, 5, 5);
	        gbc_lblCustomerId.anchor = GridBagConstraints.EAST;
	        gbc_lblCustomerId.gridx = 1;
	        gbc_lblCustomerId.gridy = 1;
	        newPanel.add(lblCustomerId, gbc_lblCustomerId);
	        
	        textField_6 = new JTextField();
	        GridBagConstraints gbc_textField_6 = new GridBagConstraints();
	        gbc_textField_6.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_6.gridx = 2;
	        gbc_textField_6.gridy = 1;
	        newPanel.add(textField_6, gbc_textField_6);
	        textField_6.setColumns(10);
	        textField_6.setText(String.valueOf(customer_id));
	        
	        JLabel lblFullName = new JLabel("Full Name");
	        GridBagConstraints gbc_lblFullName = new GridBagConstraints();
	        gbc_lblFullName.insets = new Insets(0, 0, 5, 5);
	        gbc_lblFullName.anchor = GridBagConstraints.EAST;
	        gbc_lblFullName.gridx = 1;
	        gbc_lblFullName.gridy = 2;
	        newPanel.add(lblFullName, gbc_lblFullName);

	        
	        textField = new JTextField();
	        GridBagConstraints gbc_textField = new GridBagConstraints();
	        gbc_textField.insets = new Insets(0, 0, 5, 5);
	        gbc_textField.gridx = 2;
	        gbc_textField.gridy = 2;
	        newPanel.add(textField, gbc_textField);
	        textField.setColumns(10);
	        
	        JLabel lblDoor = new JLabel("Door Number");
	        GridBagConstraints gbc_lblDoor = new GridBagConstraints();
	        gbc_lblDoor.insets = new Insets(0, 0, 5, 5);
	        gbc_lblDoor.anchor = GridBagConstraints.EAST;
	        gbc_lblDoor.gridx = 1;
	        gbc_lblDoor.gridy = 3;
	        newPanel.add(lblDoor, gbc_lblDoor);

	        
	        textField_1 = new JTextField();
	        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	        gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_1.gridx = 2;
	        gbc_textField_1.gridy = 3;
	        newPanel.add(textField_1, gbc_textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel lblStreetNumber = new JLabel("Street Name");
	        GridBagConstraints gbc_lblStreetNumber = new GridBagConstraints();
	        gbc_lblStreetNumber.insets = new Insets(0, 0, 5, 5);
	        gbc_lblStreetNumber.anchor = GridBagConstraints.EAST;
	        gbc_lblStreetNumber.gridx = 1;
	        gbc_lblStreetNumber.gridy = 4;
	        newPanel.add(lblStreetNumber, gbc_lblStreetNumber);
	        
	        textField_2 = new JTextField();
	        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	        gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_2.gridx = 2;
	        gbc_textField_2.gridy = 4;
	        newPanel.add(textField_2, gbc_textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblCity = new JLabel("City");
	        GridBagConstraints gbc_lblCity = new GridBagConstraints();
	        gbc_lblCity.insets = new Insets(0, 0, 5, 5);
	        gbc_lblCity.anchor = GridBagConstraints.EAST;
	        gbc_lblCity.gridx = 1;
	        gbc_lblCity.gridy = 5;
	        newPanel.add(lblCity, gbc_lblCity);
	        
	        textField_3 = new JTextField();
	        GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	        gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_3.gridx = 2;
	        gbc_textField_3.gridy = 5;
	        newPanel.add(textField_3, gbc_textField_3);
	        textField_3.setColumns(10);
	        
	        JLabel lblState = new JLabel("State");
	        GridBagConstraints gbc_lblState = new GridBagConstraints();
	        gbc_lblState.insets = new Insets(0, 0, 5, 5);
	        gbc_lblState.anchor = GridBagConstraints.EAST;
	        gbc_lblState.gridx = 1;
	        gbc_lblState.gridy = 6;
	        newPanel.add(lblState, gbc_lblState);;
	        
	        textField_4 = new JTextField();
	        GridBagConstraints gbc_textField_4 = new GridBagConstraints();
	        gbc_textField_4.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_4.gridx = 2;
	        gbc_textField_4.gridy = 6;
	        newPanel.add(textField_4, gbc_textField_4);
	        textField_4.setColumns(10);
	        
	        JLabel lblPincode = new JLabel("Pincode");
	        GridBagConstraints gbc_lblPincode = new GridBagConstraints();
	        gbc_lblPincode.insets = new Insets(0, 0, 5, 5);
	        gbc_lblPincode.anchor = GridBagConstraints.EAST;
	        gbc_lblPincode.gridx = 1;
	        gbc_lblPincode.gridy = 7;
	        newPanel.add(lblPincode, gbc_lblPincode);
	        
	        textField_5 = new JTextField();
	        GridBagConstraints gbc_textField_5 = new GridBagConstraints();
	        gbc_textField_5.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_5.gridx = 2;
	        gbc_textField_5.gridy = 7;
	        newPanel.add(textField_5, gbc_textField_5);
	        textField_5.setColumns(10);
	        
	        JButton btnBack = new JButton("Back");
	        GridBagConstraints gbc_btnBack = new GridBagConstraints();
	        gbc_btnBack.insets = new Insets(0, 0, 0, 5);
	        gbc_btnBack.gridx = 1;
	        gbc_btnBack.gridy = 9;
	        newPanel.add(btnBack, gbc_btnBack);
	        
	        JButton btnCancel = new JButton("Cancel");
	        GridBagConstraints gbc_btnCancel = new GridBagConstraints();
	        gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
	        gbc_btnCancel.gridx = 2;
	        gbc_btnCancel.gridy = 9;
	        newPanel.add(btnCancel, gbc_btnCancel);
	        
	        JButton btnAddMoreDetails = new JButton("Add more details...");
	         GridBagConstraints gbc_btnAddMoreDetails = new GridBagConstraints();
	        gbc_btnAddMoreDetails.gridx = 3;
	        gbc_btnAddMoreDetails.gridy = 9;
	        newPanel.add(btnAddMoreDetails, gbc_btnAddMoreDetails);
	        
	        
	       
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
							System.out.println("This is redirected to Subscription Page");
						
						NewCustomerEntry.saveCustomerDetails(textField_6.getText(), textField.getText(), textField_1.getText(),
								textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText());
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
				
	         
	        pack();
	        setLocationRelativeTo(null);
	    }
}