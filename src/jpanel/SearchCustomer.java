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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.toedter.calendar.JCalendar;

import businessProcess.NewCustomerEntry;
import businessProcess.NewSubscriptionEntry;
import businessProcess.Search;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

public class SearchCustomer extends JFrame{
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	     //This is the login page
	   Search s=new Search();
	   private JTextField textField;
	   private JTextField textField_1;
	   private JTextField textField_2;
	   private JTextField textField_3;
	   private JTextField textField_4;
	   private JTextField textField_5;
	    
	    
	    public SearchCustomer() {
	        super();
	        getContentPane().setLayout(null);
	        setSize(800, 800);
	        setLocation(450,150);
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(269, 28, 301, 45);
	        txtpnNewCustomerEntry.setText("Search Customer");
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setForeground(new Color(0,255,0));
	        lblCustomerId.setFont(new Font("Courier", Font.BOLD,26));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 18));
	        lblCustomerId.setBounds(194, 107, 130,26);
	        getContentPane().add(lblCustomerId);
	        
	        //Getting Customer_ID inorder to search
	        JTextField textField_6 = new JTextField();
	        getContentPane().add(textField_6);
	        textField_6.setBounds(327, 103, 130, 36);
	        textField_6.setColumns(10);
	        
	        JButton btnSearch = new JButton("Search");
	        btnSearch.setBounds(528, 107, 115, 29);
	        getContentPane().add(btnSearch);
	        
	        JLabel lblFullName = new JLabel("Full Name");
	        lblFullName.setBounds(15, 139, 89, 20);
	        getContentPane().add(lblFullName);
	        
	        textField = new JTextField();
	        textField.setBounds(134, 136, 146, 26);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        JLabel lblStreetName = new JLabel("Street Name");
	        lblStreetName.setBounds(15, 175, 89, 20);
	        getContentPane().add(lblStreetName);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(134, 172, 146, 26);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel lblDoorNumber = new JLabel("Door Number");
	        lblDoorNumber.setBounds(15, 232, 104, 20);
	        getContentPane().add(lblDoorNumber);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(134, 229, 146, 26);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblCity = new JLabel("City");
	        lblCity.setBounds(15, 268, 69, 20);
	        getContentPane().add(lblCity);
	        
	        JLabel lblState = new JLabel("State");
	        lblState.setBounds(15, 304, 69, 20);
	        getContentPane().add(lblState);
	        
	        JLabel lblPincode = new JLabel("Pincode");
	        lblPincode.setBounds(15, 340, 69, 20);
	        getContentPane().add(lblPincode);
	        
	        textField_3 = new JTextField();
	        textField_3.setBounds(134, 262, 146, 26);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	        textField_4 = new JTextField();
	        textField_4.setBounds(134, 301, 146, 26);
	        getContentPane().add(textField_4);
	        textField_4.setColumns(10);
	        
	        textField_5 = new JTextField();
	        textField_5.setBounds(134, 337, 146, 26);
	        getContentPane().add(textField_5);
	        textField_5.setColumns(10);
	        
	        btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(e.getSource()==btnSearch)
					{	
						String c=Search.searchCustomerDetails(textField_6.getText());
						
						textField_6.setText(c);
					}
						
					
				}

			});
	    }
}