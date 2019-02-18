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

public class ModifySubscription extends JFrame{
	DateFormat month = new SimpleDateFormat("MM");
    DateFormat year = new SimpleDateFormat("YY");
	    private JTextField textField_6;
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	    private JTextField textField_1;
	    public static boolean firstAfterLanding= true;
	    private static  int[] subDateArray ;
	    public static String msg_status="";
	    public   static String msg="";
	    
	    
	    
	    public ModifySubscription(String cust_id) {
	        super();
	        
	     // add the panel to this frame
	        getContentPane().setLayout(null);
	        setSize(900, 900);
	        setLocation(450,150);
	        setResizable(false);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	      
	        JTextPane txtpnNewCustomerEntry = new JTextPane();

	        txtpnNewCustomerEntry.setText("Modify Subscription Details");
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(141, 28, 476, 45);
	        txtpnNewCustomerEntry.setEditable(false);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
	        
	        
	        ImageIcon img = new ImageIcon("RIESI_Logo.png");
	        setIconImage(img.getImage());
	       
	        
	     
	        
	        JButton btnLogout = new JButton("Logout");
	        btnLogout.setBounds(632, 20, 130, 26);
	        getContentPane().add(btnLogout);
	        
	        JLabel lblCustomerId = new JLabel("Subscription ID");
	        lblCustomerId.setForeground(new Color(2,255,234));
	        lblCustomerId.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblCustomerId.setBounds(160, 183, 194, 26);
	        getContentPane().add(lblCustomerId);
	        
	        
	        textField_6 = new JTextField();
	        textField_6.setBounds(369, 171, 171, 38);
	        getContentPane().add(textField_6);
	        textField_6.setColumns(10);
	        
	        
	        if(cust_id == null)
	        textField_6.setText("");
	        else
	        {
	        textField_6.setText(cust_id);
	        textField_6.setEditable(false);
	        }
	        
	        
	        JLabel lblRemarks = new JLabel("Remarks*");
	        lblRemarks.setForeground(new Color(2,255,234));
	        lblRemarks.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblRemarks.setBounds(160, 317, 146, 38);
	        getContentPane().add(lblRemarks);
	        
	        
	        JLabel lblCopies = new JLabel("No. of Copies");
	        lblCopies.setForeground(new Color(2,255,234));
	        lblCopies.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
	        lblCopies.setBounds(160, 259, 171, 26);
	        getContentPane().add(lblCopies);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(369, 317, 171, 38);
	        getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        JTextField textField_3 = new JTextField();
	        textField_3.setBounds(369,249, 171, 38);
	        getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	        
	       
	        
	       JCheckBox chckbxNewCheckBox = new JCheckBox("Shipped 1st Issue");
	        
	      
	       
	        
	        
	        JButton btnBackToCustomer = new JButton("Back to Customer Entry");
	     
	        if(!firstAfterLanding)
	        {
	        	btnBackToCustomer.setBounds(50, 727, 130, 26);
	        getContentPane().add(btnBackToCustomer);
	        }
	        
	        JButton btnBack = new JButton("Back");
	        btnBack.setBounds(465, 727, 130, 26);
	        getContentPane().add(btnBack);
	        
		
	        
	     
	        
	        JButton btnAddMoreDetails = new JButton("Save and Exit");
	        btnAddMoreDetails.setBounds(632, 727, 130, 26);
	        getContentPane().add(btnAddMoreDetails);
	        
	        JCheckBox chckbxInactive = new JCheckBox("Inactive");
	        chckbxInactive.setBounds(369, 450, 139, 29);
	        getContentPane().add(chckbxInactive);
	        
	        JCheckBox chckbxShippedTheIssuw = new JCheckBox("Shipped the issue");
	        chckbxShippedTheIssuw.setBounds(369, 397, 186, 29);
	        getContentPane().add(chckbxShippedTheIssuw);
	        
	        JLabel Home = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
	        Home.setBounds(0, -17, 1000, 1000);
	        getContentPane().add(Home);
	        
	       
	        
	        
				
				
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
	        
				chckbxShippedTheIssuw.addActionListener(new ActionListener() {
		        	@Override
		        	public void actionPerformed(ActionEvent e) {
		        		System.out.println("Shipped Status");
		        		
						
						
				        
						
		        		}
		        		
		        });
				
				
				chckbxInactive.addActionListener(new ActionListener() {
		        	@Override
		        	public void actionPerformed(ActionEvent e) {
		        		
		        		System.out.println("Enter Key is pressed!");
		        		
						
						
					
		        		}
		        });
				
				
				
				
				
				
				
				
			//Save and Exit
					btnAddMoreDetails.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
						// TODO Auto-generated method stub
						if((chckbxInactive.isSelected())&&(chckbxShippedTheIssuw.isSelected())) //Shipped-->yes Activity-->Inactive
						{	msg="Yes";
							msg_status="InActive";
						}
						
						else if(chckbxShippedTheIssuw.isSelected())
						{	
							msg="Yes";
							msg_status="InActive";
						}
						else if(chckbxInactive.isSelected())
						{	msg="No";
							msg_status="InActive";
							JOptionPane.showMessageDialog(null,"Subscription Deactivated!");
						}
						else
						{
							msg ="No";
							msg_status ="Active";
							//Update the remaining Balance accordingly
						      Rem_Balance.modifyRemaining(textField_6.getText(), textField_3.getText());
						}
						if(e.getSource()==btnAddMoreDetails)
						{
							System.out.println("Updating...!");
							
							NewSubscriptionEntry.modifySubscription(textField_6.getText(),msg,msg_status,textField_3.getText(),textField_1.getText());
							dispose();
							new LandingPage().setVisible(true);
							
							
						
						}
					
					}
					catch (NullPointerException ex)
					{
						JOptionPane.showMessageDialog(null, "Please provide all the values correctly", "Check Details", JOptionPane.WARNING_MESSAGE);
						
					}
					}
				});
	        
		
				
	     
	    } 
	    
	    
	   
} //Class
