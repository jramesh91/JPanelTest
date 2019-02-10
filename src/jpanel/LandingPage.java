package jpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




import javax.swing.JTextPane;
import java.awt.Font;


import javax.swing.JDialog;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Color;

import java.awt.event.MouseMotionAdapter;

public class LandingPage extends JFrame{
	
	public LandingPage() {
		
		super();
		getContentPane().setLayout(null);
		setSize(900, 900);
		setLocation(450,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		ImageIcon img = new ImageIcon("RIESI_Logo.png");
	    setIconImage(img.getImage());
	    
		JButton btnLogout = new JButton("Logout");
	    btnLogout.setBounds(746, 16, 117, 29);
	    getContentPane().add(btnLogout);
	    
	    JButton btnNewCustomer = new JButton();
	    btnNewCustomer.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="New Customer";
	    		btnNewCustomer.setToolTipText(message);
	    		
	    	}
	    });
	    Icon iconNewCustomer=new ImageIcon("New_Customer.png");
	    btnNewCustomer.setIcon(iconNewCustomer);
	    
	    btnNewCustomer.setBackground(new Color(204, 255, 255));
	    btnNewCustomer.setBounds(158, 203, 129, 149);
	    getContentPane().add(btnNewCustomer);
	    
	    JButton btnSearchCustomer = new JButton();
	    btnSearchCustomer.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="Search Customer";
	    		btnSearchCustomer.setToolTipText(message);
	    	}
	    });
	    Icon iconSearchCustomer=new ImageIcon("Search_Customer.png"); 
	    btnSearchCustomer.setIcon(iconSearchCustomer);
	    btnSearchCustomer.setBackground(new Color(204, 255, 255));
	    btnSearchCustomer.setBounds(630, 203, 123, 149);
	    getContentPane().add(btnSearchCustomer);
	    
	    JButton btnNewSubscription = new JButton();
	    btnNewSubscription.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="Modify Subscription";
	    		btnNewSubscription.setToolTipText(message);
	    	}
	    });
	    Icon iconModifySubscription=new ImageIcon("Modify_Subs2.png"); 
	    btnNewSubscription.setIcon(iconModifySubscription);
	    btnNewSubscription.setBackground(new Color(204, 255, 255));
	    btnNewSubscription.setBounds(158, 584, 129, 149);
	    getContentPane().add(btnNewSubscription);
	    
	    JButton btnSearchCustomerID = new JButton();
	    btnSearchCustomerID.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="Search for Customer ID";
	    		btnSearchCustomerID.setToolTipText(message);
	    	}
	    });
	    Icon iconSearchCustomerID=new ImageIcon("Search_Customer_ID.png"); 
	    btnSearchCustomerID.setIcon(iconSearchCustomerID);
	    btnSearchCustomerID.setBackground(new Color(204, 255, 255));
	    btnSearchCustomerID.setBounds(158, 393, 129, 149);
	    getContentPane().add(btnSearchCustomerID);
	    
	    JButton btnRemainingBalance = new JButton();
	    Icon iconRemainingBalance=new ImageIcon("Remaining_Balance2.png"); 
	    btnRemainingBalance.setIcon(iconRemainingBalance);
	    btnRemainingBalance.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="Remaining Balance";
	    		btnRemainingBalance.setToolTipText(message);
	    	}
	    });
	    btnRemainingBalance.setBackground(new Color(204, 255, 255));
	    btnRemainingBalance.setBounds(630, 584, 123, 149);
	    getContentPane().add(btnRemainingBalance);
	    
	    JButton btnGenerateReport = new JButton();
	    btnGenerateReport.addMouseMotionListener(new MouseMotionAdapter() {
	    	@Override
	    	public void mouseMoved(java.awt.event.MouseEvent e) {
	    		String message="Generate Annual Report";
	    		btnGenerateReport.setToolTipText(message);
	    	}
	    });
	    Icon iconGenerateReport=new ImageIcon("Report.png"); 
	    btnGenerateReport.setIcon(iconGenerateReport);
	    btnGenerateReport.setBackground(new Color(204, 255, 255));
	    btnGenerateReport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnGenerateReport.setBounds(630, 393, 123, 149);
	    getContentPane().add(btnGenerateReport);
	    
	  
	    
	    
	    JTextPane txtpnWelcomeToJournal = new JTextPane();
	    txtpnWelcomeToJournal.setForeground(new Color(255, 255, 255));
	    txtpnWelcomeToJournal.setBackground(new Color(0, 0, 0));
	    //txtpnWelcomeToJournal.setBackground(0,0,0,0);
	    txtpnWelcomeToJournal.setText("Welcome to Journal Management System");
	    txtpnWelcomeToJournal.setFont(new Font("Lucida Grande", Font.BOLD, 26));
	    txtpnWelcomeToJournal.setBounds(151, 99, 600, 57);
	    getContentPane().add(txtpnWelcomeToJournal);
	   
	   
	   JLabel lblReisilogo = new JLabel(("REISI_Logo"),new ImageIcon("RIESI_Logo.png"),JLabel.LEFT);
	   lblReisilogo.setBounds(15, 16, 64, 122);
	   getContentPane().add(lblReisilogo);
	   
	   JButton btnHelp = new JButton("Help");
	   btnHelp.addMouseMotionListener(new MouseMotionAdapter() {
	   	@Override
	   	public void mouseMoved(java.awt.event.MouseEvent e) {
	   		String message="Help";
	   		btnHelp.setToolTipText(message);
	   	}
	   });
	   btnHelp.setBounds(613, 16, 115, 29);
	   getContentPane().add(btnHelp);
	   
	      	    
	  
	   JLabel lable = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
	   lable.setBounds(0, 0, 1000,1000);
	   getContentPane().add(lable);
	   setVisible(true);
	    
	  //Button to go into New Customer entry page
	    btnNewCustomer.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnNewCustomer)
	  				{
	  					System.out.println("This is redirected to Subscription Page");
	  					dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  				
	  					new NewCustomer().setVisible(true);
	  				}
	  			
	  			}
	  		});
	    
	  //Button to go into New Sub entry page
	    btnNewSubscription.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnNewSubscription)
	  				{
	  					System.out.println("This is redirected to Subscription Page");
	  					dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					String a = null;
	  					new ModifySubscription(a).setVisible(true);
	  				}
	  			
	  			}
	  		});
	    
	  //Button to go into Generate Report entry page
	    btnGenerateReport.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnGenerateReport)
	  				{
	  					System.out.println("This is redirected to Subscription Page");
	  					dispose();
	  					
	  					new GenerateReport().setVisible(true);
	  				}
	  			
	  			}
	  		});
	    
	  //Button to go into Search Customer entry page
	    btnSearchCustomer.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnSearchCustomer)
	  				{
	  					System.out.println("This is redirected to Subscription Page");
	  					dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					
	  					new SearchCustomer().setVisible(true);
	  				}
	  			
	  			}
	  		});
		
	    //Button to go into Search Customer entry page
	    btnRemainingBalance.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnRemainingBalance)
	  				{
	  					System.out.println("You are in the Remaining_Balance Planet right now!");
	  					dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					
	  					new RemainingBalance().setVisible(true);
	  				}
	  			
	  			}
	  		});
	    
	    //Button to go into Search Customer entry page
	    btnSearchCustomerID.addActionListener(new ActionListener() {
	  			
	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				// TODO Auto-generated method stub
	  				if(e.getSource()==btnSearchCustomerID)
	  				{
	  					System.out.println("You are in the Remaining_Balance Planet right now!");
	  					dispose();
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					
	  					new SearchCustomerIDPage().setVisible(true);
	  				}
	  			
	  			}
	  		});
	    
	    
	    
	  //Action Listener for the Logout :)  
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
		
		
		//Action Listener for Help
		btnHelp.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				// TODO Auto-generated method stub
  				if(e.getSource()==btnHelp)
  				{							
  					dispose();
  					new Help_Page().setVisible(true);
  				}
  			
  			}
  		});
		
	    



		
	    
	}
	}   

