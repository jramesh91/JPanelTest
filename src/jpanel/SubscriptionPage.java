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
import javax.swing.ImageIcon;
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
	        super();
	        
	     // add the panel to this frame
	        getContentPane().setLayout(null);
	        setSize(800, 800);
	        setLocation(450,150);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        /*JPanel newPanel = new JPanel();
	        GridBagLayout gbl_newPanel = new GridBagLayout();
	        gbl_newPanel.columnWidths = new int[]{111, 139, 123, 0, 211, 0};
	        gbl_newPanel.rowHeights = new int[]{47, 38, 37, 37, 39, 37, 34, 36, 0, 0, 0};
	        gbl_newPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
	        gbl_newPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	        newPanel.setLayout(gbl_newPanel);*/
	         
	     /*   // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        getContentPane().add(newPanel);
	        */
	        JTextPane txtpnNewCustomerEntry = new JTextPane();

	        txtpnNewCustomerEntry.setText("Enter Subscription Details");
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(269, 28, 301, 45);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        //add(txtpnNewCustomerEntry, gbc_txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setFont(new Font("Courier", Font.BOLD, 16));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCustomerId.setBounds(176, 105, 130, 26);
	        getContentPane().add(lblCustomerId);
	        
	        
	        textField_6 = new JTextField();
	        textField_6.setBounds(369, 105, 130, 26);
	        getContentPane().add(textField_6);
	        textField_6.setColumns(10);
	        
	        
	        if(cust_id == null)
	        textField_6.setText("Enter Customer ID");
	        else
	        {
	        textField_6.setText(cust_id);
	        textField_6.setEditable(false);
	        }
	        
	        JLabel lblSubscriptionId = new JLabel("Subscription ID");
	        lblSubscriptionId.setBounds(176, 154, 151, 26);
	        lblSubscriptionId.setFont(new Font("Courier", Font.BOLD, 16));
	        lblSubscriptionId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        getContentPane().add(lblSubscriptionId);
	        
	        textField = new JTextField();
	        textField.setBounds(369, 157, 130, 26);
	        textField.setColumns(10);
	        textField.setText(String.valueOf(subs_id));
	        getContentPane().add(textField);
	        
	        JLabel lblDateOfPayment = new JLabel("Date of Payment");
	        lblDateOfPayment.setFont(new Font("Courier", Font.BOLD, 16));
	        lblDateOfPayment.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblDateOfPayment.setBounds(176, 213, 166, 26);
	        getContentPane().add(lblDateOfPayment);
	        
	        JDateChooser dateChooser = new JDateChooser();
	        dateChooser.setBounds(369, 213, 130, 26);
	        getContentPane().add(dateChooser);
	        
	        JLabel lblAmountPaid = new JLabel("Amount Paid");
	        lblAmountPaid.setFont(new Font("Courier", Font.BOLD, 16));
	        lblAmountPaid.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblAmountPaid.setBounds(176, 255, 130, 26);
	        getContentPane().add(lblAmountPaid);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(369, 255, 130, 26);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblStartDate = new JLabel("Start Date");
	        lblStartDate.setFont(new Font("Courier", Font.BOLD, 16));
	        lblStartDate.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblStartDate.setBounds(176, 297, 130, 26);
	        getContentPane().add(lblStartDate);
	        
	        JDateChooser dateChooser_1 = new JDateChooser();
	        dateChooser_1.setBounds(369, 297, 130, 26);
	        getContentPane().add(dateChooser_1);
	        
	        JLabel lblEndDate = new JLabel("End Date");
	        lblEndDate.setFont(new Font("Courier", Font.BOLD, 16));
	        lblEndDate.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblEndDate.setBounds(176, 345, 130, 26);
	        getContentPane().add(lblEndDate);
	        
	        JDateChooser dateChooser_2 = new JDateChooser();  
	        dateChooser_2.setBounds(369, 345, 130, 26);
	        getContentPane().add(dateChooser_2);      
	        
	        JLabel lblRemarks = new JLabel("Remarks*");
	        lblRemarks.setFont(new Font("Courier", Font.BOLD, 16));
	        lblRemarks.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblRemarks.setBounds(176, 388, 130, 26);
	        getContentPane().add(lblRemarks);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(369, 388, 130, 26);
	        getContentPane().add(textField_1);
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
	        chckbxNewCheckBox.setBounds(369, 435, 187, 26);
	        getContentPane().add(chckbxNewCheckBox);
	       
	        
	        
	        JButton btnBackToCustomer = new JButton("Back to Customer Entry");
	     
	        if(!firstAfterLanding)
	        {
	        	btnBackToCustomer.setBounds(50, 727, 130, 26);
	        getContentPane().add(btnBackToCustomer);
	        }
	        
	        JButton btnBack = new JButton("Back");
	        btnBack.setBounds(465, 727, 130, 26);
	        getContentPane().add(btnBack);
	        
		
	        
	       /* JButton btnCancel = new JButton("Cancel");
	        btnCancel.setBounds(394, 177, 130, 26);
	        getContentPane().add(btnCancel);*/
	        
	        JButton btnAddMoreDetails = new JButton("Save and Exit");
	        btnAddMoreDetails.setBounds(632, 727, 130, 26);
	        getContentPane().add(btnAddMoreDetails);
	        
	        JLabel Home = new JLabel("",new ImageIcon("back.jpg"),JLabel.CENTER);
		    Home.setBounds(0, 0, 800, 800);
		    getContentPane().add(Home);
	        
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
					      //dispose();
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
							//dispose();
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
							//dispose();
							new NewCustomer().setVisible(true);
						}
					
					}
				});
			
	        
/*			
				
	        pack();
	        setLocationRelativeTo(null);*/
	    }
}
