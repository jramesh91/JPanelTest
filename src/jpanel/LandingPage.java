package jpanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;
import javax.imageio.ImageIO;

import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class LandingPage extends JFrame{
	
	public LandingPage() {
		
		super();
		getContentPane().setLayout(null);
		setSize(800, 800);
		setLocation(450,150);
		
	   
	    
		JButton btnLogout = new JButton("Logout");
	    btnLogout.setBounds(662, 20, 117, 29);
	    getContentPane().add(btnLogout);
	    
	    JButton btnNewCustomer = new JButton("New Customer");
	    btnNewCustomer.setBackground(new Color(204, 255, 255));
	    btnNewCustomer.setBounds(115, 151, 146, 53);
	    getContentPane().add(btnNewCustomer);
	    
	    JButton btnSearchCustomer = new JButton("Search Customer");
	    btnSearchCustomer.setBackground(new Color(204, 255, 255));
	    btnSearchCustomer.setBounds(565, 151, 146, 53);
	    getContentPane().add(btnSearchCustomer);
	    
	    JButton btnNewSubscription = new JButton("New Subscription");
	    btnNewSubscription.setBackground(new Color(204, 255, 255));
	    btnNewSubscription.setBounds(115, 336, 146, 53);
	    getContentPane().add(btnNewSubscription);
	    
	    JButton btnGenerateReport = new JButton("Generate Report");
	    btnGenerateReport.setBackground(new Color(204, 255, 255));
	    btnGenerateReport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnGenerateReport.setBounds(576, 336, 146, 53);
	    getContentPane().add(btnGenerateReport);
	    
	    JTextPane txtpnWelcomeToJournal = new JTextPane();
	    txtpnWelcomeToJournal.setForeground(new Color(255, 0, 51));
	    txtpnWelcomeToJournal.setBackground(new Color(0, 0, 102));
	    //txtpnWelcomeToJournal.setBackground(0,0,0,0);
	    txtpnWelcomeToJournal.setText("Welcome to Journal Management System");
	    txtpnWelcomeToJournal.setFont(new Font("Lucida Grande", Font.BOLD, 20));
	    txtpnWelcomeToJournal.setBounds(197, 72, 421, 29);
	    getContentPane().add(txtpnWelcomeToJournal);

		//ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
	    JLabel lable = new JLabel("",new ImageIcon("back.jpg"),JLabel.CENTER);
	    lable.setBounds(0, 0, 800, 800);
	    getContentPane().add(lable);
	    
	    
	    
	
		/*panel.add(lable);*/
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
	  					String a = null;
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
	  					new SubscriptionPage(a).setVisible(true);
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
	  					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
	  					String a = null;
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
		
		
		/*JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2);*/
		
		/*JLabel lblLibministrator = new JLabel("LibMinistrator");
		lblLibministrator.setFont(new Font("Serif", Font.PLAIN, 32));
		panel.add(lblLibministrator);
		
		
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JButton btnLogout = new JButton("Logout");
		panel.add(btnLogout);
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
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("");
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("");
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("");
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("");
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("");
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("");
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("");
		panel.add(label_15);
		
		

		
		
		
		JButton btnNewButton = new JButton("FirstForm");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setPreferredSize(new Dimension(80, 40));
		panel.add(btnNewButton);
		
		
		
		
		//BUtto to get into New Customer page
		 btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==btnNewButton)
					{
						System.out.println("This is redirected to the First Form");
						dispose();
						new NewCustomer().setVisible(true);
					}
				
				
				}
			});
		
		JLabel label_16 = new JLabel("");
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("");
		panel.add(label_17);
		
		
		//This is for the first form
 
		
		JButton btnNewButton_1 = new JButton("Search Customer");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setPreferredSize(new Dimension(80, 40));
		panel.add(btnNewButton_1);
		
		//Button to go to Search customer Page
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==btnNewButton_1)
				{System.out.println("This is redirected to Search Customer");
				dispose();
				new SearchCustomer().setVisible(true);
				}
			
			}
		});
		*/
	/*	JLabel label_18 = new JLabel("");
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("");
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("");
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("");
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("");
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("");
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("");
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("");
		panel.add(label_25);
		
		
		*/
	/*	
		JButton btnNewButton_2 = new JButton("Generate Report");
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setForeground(SystemColor.activeCaptionText);
		panel.add(btnNewButton_2);
		
		//Button to go into New Sub entry page
				btnNewButton_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==btnNewButton_2)
						{
							System.out.println("This is redirected to Subscription Page");
							dispose();
							//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
							new GenerateReport().setVisible(true);
						}
					
					}
				});
		
		JLabel label_26 = new JLabel("");
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("");
		panel.add(label_27);*/
		
		
		/*JButton btnNewButton_3 = new JButton("Add new subscription");
		btnNewButton_3.setBackground(Color.GREEN);
		panel.add(btnNewButton_3);
		
		
		
		
		JLabel label_28 = new JLabel("");
		panel.add(label_28);
		
		JLabel label_29 = new JLabel("");
		panel.add(label_29);
		
		*/
	/*	pack();
		setLocationRelativeTo(null);*/
		
	    
	}
	}   

