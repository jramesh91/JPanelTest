package jpanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextPane;
import java.awt.Font;

public class FirstForm extends JFrame{  
	 private JLabel labelUsername = new JLabel("Something");
	    private JLabel labelPassword = new JLabel("Nothing");
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JTextField textField;
	    private JTextField textField_1;
	    private JTextField textField_2;
	    private JTextField textField_3;
	    private JTextField textField_4;
	    private JTextField textField_5;
	    private JTextField textField_6;
	     
	    public FirstForm() {
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
	        
	        JTextPane txtpnCustomerId = new JTextPane();
	        txtpnCustomerId.setText("Customer ID");
	        GridBagConstraints gbc_txtpnCustomerId = new GridBagConstraints();
	        gbc_txtpnCustomerId.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnCustomerId.gridx = 1;
	        gbc_txtpnCustomerId.gridy = 1;
	        newPanel.add(txtpnCustomerId, gbc_txtpnCustomerId);
	        
	        textField_6 = new JTextField();
	        GridBagConstraints gbc_textField_6 = new GridBagConstraints();
	        gbc_textField_6.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_6.gridx = 2;
	        gbc_textField_6.gridy = 1;
	        newPanel.add(textField_6, gbc_textField_6);
	        textField_6.setColumns(10);
	        
	        JTextPane txtpnFullName = new JTextPane();
	        txtpnFullName.setText("Full Name");
	        GridBagConstraints gbc_txtpnFullName = new GridBagConstraints();
	        gbc_txtpnFullName.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnFullName.gridx = 1;
	        gbc_txtpnFullName.gridy = 2;
	        newPanel.add(txtpnFullName, gbc_txtpnFullName);
	        
	        textField = new JTextField();
	        GridBagConstraints gbc_textField = new GridBagConstraints();
	        gbc_textField.insets = new Insets(0, 0, 5, 5);
	        gbc_textField.gridx = 2;
	        gbc_textField.gridy = 2;
	        newPanel.add(textField, gbc_textField);
	        textField.setColumns(10);
	        
	        JTextPane txtpnDoorNumber = new JTextPane();
	        txtpnDoorNumber.setText("Door Number");
	        GridBagConstraints gbc_txtpnDoorNumber = new GridBagConstraints();
	        gbc_txtpnDoorNumber.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnDoorNumber.gridx = 1;
	        gbc_txtpnDoorNumber.gridy = 3;
	        newPanel.add(txtpnDoorNumber, gbc_txtpnDoorNumber);
	        
	        textField_1 = new JTextField();
	        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	        gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_1.gridx = 2;
	        gbc_textField_1.gridy = 3;
	        newPanel.add(textField_1, gbc_textField_1);
	        textField_1.setColumns(10);
	        
	        JTextPane txtpnStreetName = new JTextPane();
	        txtpnStreetName.setText("Street Name");
	        GridBagConstraints gbc_txtpnStreetName = new GridBagConstraints();
	        gbc_txtpnStreetName.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnStreetName.gridx = 1;
	        gbc_txtpnStreetName.gridy = 4;
	        newPanel.add(txtpnStreetName, gbc_txtpnStreetName);
	        
	        textField_2 = new JTextField();
	        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	        gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_2.gridx = 2;
	        gbc_textField_2.gridy = 4;
	        newPanel.add(textField_2, gbc_textField_2);
	        textField_2.setColumns(10);
	        
	        JTextPane txtpnCity = new JTextPane();
	        txtpnCity.setText("City");
	        GridBagConstraints gbc_txtpnCity = new GridBagConstraints();
	        gbc_txtpnCity.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnCity.gridx = 1;
	        gbc_txtpnCity.gridy = 5;
	        newPanel.add(txtpnCity, gbc_txtpnCity);
	        
	        textField_3 = new JTextField();
	        GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	        gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_3.gridx = 2;
	        gbc_textField_3.gridy = 5;
	        newPanel.add(textField_3, gbc_textField_3);
	        textField_3.setColumns(10);
	        
	        JTextPane txtpnState = new JTextPane();
	        txtpnState.setText("State");
	        GridBagConstraints gbc_txtpnState = new GridBagConstraints();
	        gbc_txtpnState.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnState.gridx = 1;
	        gbc_txtpnState.gridy = 6;
	        newPanel.add(txtpnState, gbc_txtpnState);
	        
	        textField_4 = new JTextField();
	        GridBagConstraints gbc_textField_4 = new GridBagConstraints();
	        gbc_textField_4.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_4.gridx = 2;
	        gbc_textField_4.gridy = 6;
	        newPanel.add(textField_4, gbc_textField_4);
	        textField_4.setColumns(10);
	        
	        JTextPane txtpnPinCode = new JTextPane();
	        txtpnPinCode.setText("Pin Code");
	        GridBagConstraints gbc_txtpnPinCode = new GridBagConstraints();
	        gbc_txtpnPinCode.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnPinCode.gridx = 1;
	        gbc_txtpnPinCode.gridy = 7;
	        newPanel.add(txtpnPinCode, gbc_txtpnPinCode);
	        
	        textField_5 = new JTextField();
	        GridBagConstraints gbc_textField_5 = new GridBagConstraints();
	        gbc_textField_5.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
	        gbc_textField_5.gridx = 2;
	        gbc_textField_5.gridy = 7;
	        newPanel.add(textField_5, gbc_textField_5);
	        textField_5.setColumns(10);
	        
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
	         
	        pack();
	        setLocationRelativeTo(null);
	    }
}