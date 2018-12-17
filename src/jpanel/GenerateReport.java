package jpanel;

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

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

public class GenerateReport extends JFrame{
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	     //This is the login page
	    
	    
	    
	    public GenerateReport() {
	        super("JPanel Demo Program");
	        JPanel newPanel = new JPanel();
	        GridBagLayout gbl_newPanel = new GridBagLayout();
	        gbl_newPanel.columnWidths = new int[]{111, 139, 123, 0, 211, 0};
	        gbl_newPanel.rowHeights = new int[]{47, 38, 37, 37, 39, 37, 34, 36, 0, 0, 0};
	        gbl_newPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
	        gbl_newPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	        newPanel.setLayout(gbl_newPanel);
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        getContentPane().add(newPanel);
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        txtpnNewCustomerEntry.setText("Generate the report for the Annual Year");
	        GridBagConstraints gbc_txtpnNewCustomerEntry = new GridBagConstraints();
	        gbc_txtpnNewCustomerEntry.insets = new Insets(0, 0, 5, 5);
	        gbc_txtpnNewCustomerEntry.gridx = 0;
	        gbc_txtpnNewCustomerEntry.gridy = 0;
	        newPanel.add(txtpnNewCustomerEntry, gbc_txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        GridBagConstraints gbc_btnLogout = new GridBagConstraints();
	        gbc_btnLogout.insets = new Insets(0, 0, 5, 0);
	        gbc_btnLogout.gridx = 4;
	        gbc_btnLogout.gridy = 0;
	        newPanel.add(btnLogout, gbc_btnLogout);
	        
	  
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
	        
	        JButton btnAddMoreDetails = new JButton("Generate");
	         GridBagConstraints gbc_btnAddMoreDetails = new GridBagConstraints();
	        gbc_btnAddMoreDetails.gridx = 4;
	        gbc_btnAddMoreDetails.gridy = 9;
	        newPanel.add(btnAddMoreDetails, gbc_btnAddMoreDetails);
	        
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
	        setLocationRelativeTo(null);
	    }
}
