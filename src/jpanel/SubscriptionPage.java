package jpanel;

import java.awt.Color;
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
import businessProcess.Rem_Balance;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSpinner;

public class SubscriptionPage extends JFrame{
	DateFormat month = new SimpleDateFormat("MM");
    DateFormat year = new SimpleDateFormat("YY");
	    private JTextField textField_2;
	    private JTextField textField_6;
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	    private JTextField textField_1;
	    public static boolean firstAfterLanding= true;
	    private static  int[] subDateArray ;
	    String msg="";
	    String msg_status="";
	 
	    
	    
	    
	    public SubscriptionPage(String cust_id) {
	        super();
	        
	     // add the panel to this frame
	        getContentPane().setLayout(null);
	        setSize(900, 900);
	        setLocation(450,150);
	        setResizable(false);
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
	        txtpnNewCustomerEntry.setBounds(141, 28, 476, 45);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        //add(txtpnNewCustomerEntry, gbc_txtpnNewCustomerEntry);
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Customer ID");
	        lblCustomerId.setForeground(new Color(255, 204, 0));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCustomerId.setBounds(160, 168, 194, 26);
	        getContentPane().add(lblCustomerId);
	        
	        
	        textField_6 = new JTextField();
	        textField_6.setBounds(369, 171, 130, 26);
	        getContentPane().add(textField_6);
	        textField_6.setColumns(10);
	        
	        
	        if(cust_id == null)
	        textField_6.setText("Enter Customer ID");
	        else
	        {
	        textField_6.setText(cust_id);
	        textField_6.setEditable(false);
	        }
	        
	        JLabel lblDateOfPayment = new JLabel("Date of Payment");
	        lblDateOfPayment.setForeground(new Color(255, 204, 0));
	        lblDateOfPayment.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblDateOfPayment.setBounds(160, 213, 194, 26);
	        getContentPane().add(lblDateOfPayment);
	        
	        JDateChooser dateChooser = new JDateChooser();
	        dateChooser.setBounds(369, 213, 130, 26);
	        getContentPane().add(dateChooser);
	        
	        JLabel lblAmountPaid = new JLabel("Amount Paid");
	        lblAmountPaid.setForeground(new Color(255, 204, 0));
	        lblAmountPaid.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblAmountPaid.setBounds(160, 255, 161, 26);
	        getContentPane().add(lblAmountPaid);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(369, 255, 130, 26);
	        getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	        
	        JLabel lblStartDate = new JLabel("Start Date");
	        lblStartDate.setForeground(new Color(255, 204, 0));
	        lblStartDate.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblStartDate.setBounds(160, 297, 130, 26);
	        getContentPane().add(lblStartDate);
	        
	        JDateChooser dateChooser_1 = new JDateChooser();
	        dateChooser_1.setBounds(369, 297, 130, 26);
	        getContentPane().add(dateChooser_1);
	        
	        JLabel lblEndDate = new JLabel("Number of Subscription");
	        lblEndDate.setForeground(new Color(255, 204, 0));
	        lblEndDate.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblEndDate.setBounds(160, 345, 207, 26);
	        getContentPane().add(lblEndDate);
	        
	        JSpinner spinner = new JSpinner();
	        spinner.setBounds(423, 348, 76, 26);
	        getContentPane().add(spinner);
	        
	        
	        JLabel lblRemarks = new JLabel("Remarks*");
	        lblRemarks.setForeground(new Color(255, 204, 0));
	        lblRemarks.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblRemarks.setBounds(160, 440, 130, 26);
	        getContentPane().add(lblRemarks);
	        
	        
	        JLabel lblCopies = new JLabel("No. of Copies");
	        lblCopies.setForeground(new Color(255, 204, 0));
	        lblCopies.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        lblCopies.setBounds(155, 387, 146, 26);
	        getContentPane().add(lblCopies);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(369, 443, 146, 26);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JTextField textField_3 = new JTextField();
	        textField_3.setBounds(369,387, 146, 26);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	       
	        
	        JCheckBox chckbxNewCheckBox = new JCheckBox("Shipped 1st Issue");
	        chckbxNewCheckBox.addKeyListener(new KeyAdapter() {
	        	
	        	
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	  
	        		if(e.getKeyCode()==KeyEvent.VK_ENTER)
	        		{System.out.println("Enter Key is pressed!");
	        		
	        		NewCustomerEntry.saveCustomerDetails(NewCustomer.getTextField_6(), NewCustomer.getTextField(), NewCustomer.getTextField_1(),
							NewCustomer.getTextField_2(), NewCustomer.getTextField_3(), NewCustomer.getTextField_4(), NewCustomer.getTextField_5());
					
	        		
					if(chckbxNewCheckBox.isSelected())
					{
						msg="Yes";
						msg_status="InActive";
					}
					else
					{
						msg="No";
						msg_status="Active";
					}
					
					DateFormat month = new SimpleDateFormat("MM");
			        DateFormat month_year = new SimpleDateFormat("dd/MM/YYYY");
			        DateFormat m_y = new SimpleDateFormat("MMYYYY");
			        
			        int date_of_sub = Integer.parseInt(m_y.format(dateChooser_1.getDate()));
			        int month_of_sub = Integer.parseInt(month.format(dateChooser_1.getDate()));
			        
			        int spinnervalue = (Integer) spinner.getValue();
			        
			        CalculateDateArray(spinnervalue,date_of_sub, month_of_sub);
			        
			        for(int i=0; i<spinnervalue;i++)
					{
			      NewSubscriptionEntry.saveSubscriptionDetails(cust_id, month_year.format(dateChooser.getDate()),
							textField_2.getText(),subDateArray[i], spinner.getValue().toString(),textField_1.getText(),msg,textField_3.getText(),msg_status);
			      
			      
			      //Update the remaining Balance
			      Rem_Balance.updateRemaining(textField_3.getText(), subDateArray[i]);
			      //Only the first item can be marked as Shipped
			      msg="No";
			      msg_status="Active";
					}
			        
					//NewSubscriptionEntry.saveSubscriptionDetails(cust_id, month_year.format(dateChooser.getDate()),
							//		textField_2.getText(),month.format(dateChooser_1.getDate()), spinner.getValue().toString(),textField_1.getText(),msg,textField_3.getText());
	        		}
	        		}
	        });
	        chckbxNewCheckBox.setForeground(new Color(255, 204, 0));
	        chckbxNewCheckBox.setBounds(369, 502, 187, 26);
	        getContentPane().add(chckbxNewCheckBox);
	       
	        
	        
	        JButton btnBackToCustomer = new JButton("Back to Customer Entry");
	     
	        if(!firstAfterLanding)
	        {
	        	btnBackToCustomer.setBounds(50, 727, 130, 26);
	        getContentPane().add(btnBackToCustomer);
	        }
	        
	        JButton btnBack = new JButton("Cancel & Exit");
	        btnBack.setBounds(465, 727, 130, 26);
	        getContentPane().add(btnBack);
	        
		
	        
	       /* JButton btnCancel = new JButton("Cancel");
	        btnCancel.setBounds(394, 177, 130, 26);
	        getContentPane().add(btnCancel);*/
	        
	        JButton btnAddMoreDetails = new JButton("Save & Exit");
	        btnAddMoreDetails.setBounds(632, 727, 130, 26);
	        getContentPane().add(btnAddMoreDetails);
	        
	        JLabel Home = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
	        Home.setBounds(0, 0, 800, 800);
	        getContentPane().add(Home);
	        
	       
	        
	        //Update the table with the data
			btnAddMoreDetails.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				//System.out.println("The date is "+dateChooser.getDate());
					
					NewCustomerEntry.saveCustomerDetails(NewCustomer.getTextField_6(), NewCustomer.getTextField(), NewCustomer.getTextField_1(),
							NewCustomer.getTextField_2(), NewCustomer.getTextField_3(), NewCustomer.getTextField_4(), NewCustomer.getTextField_5());
					
					if(chckbxNewCheckBox.isSelected())
					{
						msg="Yes";
						msg_status="InActive";
						
					}
					else
					{
						msg="No";
						msg_status="Active";
					}
					//NewSubscriptionEntry.validateSubId(subs_id);
					
					DateFormat d_month_year = new SimpleDateFormat("dd/MM/YYYY");
					DateFormat month_year = new SimpleDateFormat("MMYYYY");
					DateFormat month = new SimpleDateFormat("MM");

					
					int date_of_sub = Integer.parseInt(month_year.format(dateChooser_1.getDate()));
			        int month_of_sub = Integer.parseInt(month.format(dateChooser_1.getDate()));
			        
			        int spinnervalue = (Integer) spinner.getValue();
			        
			        CalculateDateArray(spinnervalue,date_of_sub, month_of_sub);
					
					for(int i=0; i<spinnervalue;i++)
					{
			      NewSubscriptionEntry.saveSubscriptionDetails(cust_id, d_month_year.format(dateChooser.getDate()),
							textField_2.getText(),subDateArray[i], spinner.getValue().toString(),textField_1.getText(),msg,textField_3.getText(),msg_status);
			      System.out.println(subDateArray[i]);
			      
			      Rem_Balance.updateRemaining(textField_3.getText(), subDateArray[i]);
			      //Only the first item can be marked as Shipped
			      msg="No";
			      msg_status="Active";
					}
			      //Rem_Balance.updateRemaining(textField_3.getText(),month.format(dateChooser_1.getDate()),year.format(dateChooser_1.getDate()),month.format(dateChooser_2.getDate()),year.format(dateChooser_2.getDate()));
					dispose();
					new LandingPage().setVisible(true);
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
							System.out.println("Again to the New Customer PAGE!");
							NewCustomer.setTextField(NewCustomer.getTextField());
							NewCustomer.setTextField_1(NewCustomer.getTextField_1());
							NewCustomer.setTextField_2(NewCustomer.getTextField_2());
							NewCustomer.setTextField_3(NewCustomer.getTextField_3());
							NewCustomer.setTextField_4(NewCustomer.getTextField_4());
							NewCustomer.setTextField_5(NewCustomer.getTextField_5());
							NewCustomer.setTextField_6(NewCustomer.getTextField_6());
							dispose();
							new NewCustomer().setVisible(true);
						}
					
					}
				});
				
					
	     
	    } 
	    
	    
	    protected static void CalculateDateArray(int spinnervalue, int datevalue, int month)
	    {
	    	int evenodd = 0;
	    	subDateArray = new int[spinnervalue];
	    	subDateArray[0] = datevalue;
	    	if(month>7)
	    	{
	    		evenodd = 1;
	    	}
	    	
	    	for(int i=1; i<spinnervalue; i++)
	    	{
	    		if(evenodd == 0)
	    		{
	    			datevalue = datevalue + 60000;
	    			subDateArray[i] = datevalue;
	    			evenodd = 1;
	    		}
	    		else
	    		{
	    			datevalue = datevalue - 59999;
	    			subDateArray[i] = datevalue;
	    			evenodd = 0;
	    		}
	    	}
	    	
	    	for(int i=0; i<spinnervalue; i++)
	    	System.out.println("The Sub Date Values are"+subDateArray[i]+" And the length is "+subDateArray.length);
	    }
	    //Braces for the Constructor
} //Class
