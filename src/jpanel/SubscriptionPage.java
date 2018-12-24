package jpanel;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SubscriptionPage extends JFrame{

	 private JTextField textField;
	    private JTextField textField_2;
	    private JTextField textField_6;
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	    private JTextField textField_1;
	    public static boolean firstAfterLanding= true;
	 
	    
	    
	    
	    public SubscriptionPage(String cust_id) {
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
	        txtpnNewCustomerEntry.setText("Enter Subscription Details");
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
	        gbc_textField_6.gridx = 2;
	        gbc_textField_6.gridy = 1;
	        newPanel.add(textField_6, gbc_textField_6);
	        textField_6.setColumns(10);
	        
	        
	        if(cust_id == null)
	        textField_6.setText("Enter Customer ID");
	        else
	        {
	        textField_6.setText(cust_id);
	        textField_6.setEditable(false);
	        }
	        
	        JLabel lblSubscriptionId = new JLabel("Subscription ID");
	        GridBagConstraints gbc_lblSubscriptionId = new GridBagConstraints();
	        gbc_lblSubscriptionId.insets = new Insets(0, 0, 5, 5);
	        gbc_lblSubscriptionId.anchor = GridBagConstraints.EAST;
	        gbc_lblSubscriptionId.gridx = 1;
	        gbc_lblSubscriptionId.gridy = 2;
	        newPanel.add(lblSubscriptionId, gbc_lblSubscriptionId);
	        
	        textField = new JTextField();
	        GridBagConstraints gbc_textField = new GridBagConstraints();
	        gbc_textField.insets = new Insets(0, 0, 5, 5);
	        gbc_textField.gridx = 2;
	        gbc_textField.gridy = 2;
	        newPanel.add(textField, gbc_textField);
	        textField.setColumns(10);
	        textField.setText(String.valueOf(subs_id));
	        
	        JLabel lblDateOfPayment = new JLabel("Date of Payment");
	        GridBagConstraints gbc_lblDateOfPayment = new GridBagConstraints();
	        gbc_lblDateOfPayment.insets = new Insets(0, 0, 5, 5);
	        gbc_lblDateOfPayment.gridx = 1;
	        gbc_lblDateOfPayment.gridy = 3;
	        newPanel.add(lblDateOfPayment, gbc_lblDateOfPayment);
	        
	        JDateChooser dateChooser = new JDateChooser();
	        GridBagConstraints gbc_dateChooser = new GridBagConstraints();
	        gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
	        gbc_dateChooser.gridx = 2;
	        gbc_dateChooser.gridy = 3;
	        newPanel.add(dateChooser, gbc_dateChooser);
	        
	        JLabel lblAmountPaid = new JLabel("Amount Paid");
	        GridBagConstraints gbc_lblAmountPaid = new GridBagConstraints();
	        gbc_lblAmountPaid.insets = new Insets(0, 0, 5, 5);
	        gbc_lblAmountPaid.anchor = GridBagConstraints.EAST;
	        gbc_lblAmountPaid.gridx = 1;
	        gbc_lblAmountPaid.gridy = 4;
	        newPanel.add(lblAmountPaid, gbc_lblAmountPaid);
	        
	        textField_2 = new JTextField();
	        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	        gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_2.gridx = 2;
	        gbc_textField_2.gridy = 4;
	        newPanel.add(textField_2, gbc_textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblStartDate = new JLabel("Start Date");
	        GridBagConstraints gbc_lblStartDate = new GridBagConstraints();
	        gbc_lblStartDate.insets = new Insets(0, 0, 5, 5);
	        gbc_lblStartDate.anchor = GridBagConstraints.EAST;
	        gbc_lblStartDate.gridx = 1;
	        gbc_lblStartDate.gridy = 5;
	        newPanel.add(lblStartDate, gbc_lblStartDate);
	        
	        JDateChooser dateChooser_1 = new JDateChooser();
	        GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
	        gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
	        gbc_dateChooser_1.fill = GridBagConstraints.VERTICAL;
	        gbc_dateChooser_1.gridx = 2;
	        gbc_dateChooser_1.gridy = 5;
	        newPanel.add(dateChooser_1, gbc_dateChooser_1);
	        
	        JLabel lblEndDate = new JLabel("End Date");
	        GridBagConstraints gbc_lblEndDate = new GridBagConstraints();
	        gbc_lblEndDate.insets = new Insets(0, 0, 5, 5);
	        gbc_lblEndDate.anchor = GridBagConstraints.EAST;
	        gbc_lblEndDate.gridx = 1;
	        gbc_lblEndDate.gridy = 6;
	        newPanel.add(lblEndDate, gbc_lblEndDate);
	        
	        JDateChooser dateChooser_2 = new JDateChooser();
	        GridBagConstraints gbc_dateChooser_2 = new GridBagConstraints();
	        gbc_dateChooser_2.insets = new Insets(0, 0, 5, 5);
	        gbc_dateChooser_2.fill = GridBagConstraints.VERTICAL;
	        gbc_dateChooser_2.gridx = 2;
	        gbc_dateChooser_2.gridy = 6;
	        newPanel.add(dateChooser_2, gbc_dateChooser_2);
	        
	        JLabel lblRemarks = new JLabel("Remarks*");
	        GridBagConstraints gbc_lblRemarks = new GridBagConstraints();
	        gbc_lblRemarks.anchor = GridBagConstraints.EAST;
	        gbc_lblRemarks.insets = new Insets(0, 0, 5, 5);
	        gbc_lblRemarks.gridx = 1;
	        gbc_lblRemarks.gridy = 7;
	        newPanel.add(lblRemarks, gbc_lblRemarks);
	        
	        textField_1 = new JTextField();
	        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	        gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	        gbc_textField_1.gridx = 2;
	        gbc_textField_1.gridy = 7;
	        newPanel.add(textField_1, gbc_textField_1);
	        textField_1.setColumns(10);
	        
	        JCheckBox chckbxNewCheckBox = new JCheckBox("Shipped 1st Issue");
	        chckbxNewCheckBox.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	        		if(e.getKeyCode()==KeyEvent.VK_ENTER)
	        		{System.out.println("Enter Key is pressed!");
	        		String msg="";
					if(chckbxNewCheckBox.isSelected())
					{
						msg="Yes";
					}
					else
					{
						msg="No";
					}
					
					DateFormat month = new SimpleDateFormat("MM");
			        DateFormat year = new SimpleDateFormat("YY");
			        DateFormat month_year = new SimpleDateFormat("dd/MM/YYYY");
			        
					NewSubscriptionEntry.saveSubscriptionDetails(cust_id, month_year.format(dateChooser.getDate()),
									textField_2.getText(),month.format(dateChooser_1.getDate()),year.format(dateChooser_1.getDate()),month.format(dateChooser_2.getDate()),year.format(dateChooser_2.getDate()), textField_1.getText(),msg);
	        		}
	        		}
	        });
	        GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
	        gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
	        gbc_chckbxNewCheckBox.gridx = 2;
	        gbc_chckbxNewCheckBox.gridy = 8;
	        newPanel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
	        
	        
	        JButton btnBackToCustomer = new JButton("Back to Customer Entry");
	        GridBagConstraints gbc_btnBackToCustomer = new GridBagConstraints();
	        gbc_btnBackToCustomer.insets = new Insets(0, 0, 0, 5);
	        gbc_btnBackToCustomer.gridx = 0;
	        gbc_btnBackToCustomer.gridy = 9;
	        if(!firstAfterLanding)
	        {
	        newPanel.add(btnBackToCustomer, gbc_btnBackToCustomer);
	        }
	        
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
	        
	        JButton btnAddMoreDetails = new JButton("Save and Exit");
	         GridBagConstraints gbc_btnAddMoreDetails = new GridBagConstraints();
	        gbc_btnAddMoreDetails.gridx = 4;
	        gbc_btnAddMoreDetails.gridy = 9;
	        newPanel.add(btnAddMoreDetails, gbc_btnAddMoreDetails);
	        
	      
	        
	        //Update the table with the data
			btnAddMoreDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("The date is "+dateChooser.getDate());
					String msg="";
					if(chckbxNewCheckBox.isSelected())
					{
						msg="Yes";
					}
					else
					{
						msg="No";
					}
					NewSubscriptionEntry.validateSubId(subs_id);
					DateFormat month = new SimpleDateFormat("MM");
			        DateFormat year = new SimpleDateFormat("YY");
			        
			      // textField_6.getText();
			        	
			       
			        
					NewSubscriptionEntry.saveSubscriptionDetails(textField_6.getText(), dateChooser.getDate().toString(),
									textField_2.getText(),month.format(dateChooser_1.getDate()),year.format(dateChooser_1.getDate()),month.format(dateChooser_2.getDate()),year.format(dateChooser_2.getDate()), textField_1.getText(),msg);

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
	        
				//Back to Customer Button's Action Listener
				btnBackToCustomer.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==btnBackToCustomer)
						{
							System.out.println("Again to the LANDING PAGE!");
							dispose();
							new NewCustomer().setVisible(true);
						}
					
					}
				});
			
	        
			
				
	        pack();
	        setLocationRelativeTo(null);
	    }
}
