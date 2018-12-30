package jpanel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
//Updated on 23/12
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import businessProcess.LoginValidation;  
public class LoginPage extends JFrame{  
	 private JLabel labelUsername = new JLabel("Enter username: ");
	    private JLabel labelPassword = new JLabel("Enter password: ");
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JButton buttonLogin = new JButton("Login");
	    String textFieldUser;
	    String textFieldPass;
	    public static boolean entry = false;
	     //THIS IS A CONSTRUCTOR AND NOT A METHOD
	    
	    
	    
	    
	    
	    public LoginPage() {
	        super("Library Journal Management");
	         
	        // create a new panel with GridBagLayout manager
	        JPanel newPanel = new JPanel(new GridBagLayout());
	         
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.anchor = GridBagConstraints.WEST;
	        constraints.insets = new Insets(10, 10, 10, 10);
	         
	        // add components to the panel
	        constraints.gridx = 0;
	        constraints.gridy = 0;     
	        newPanel.add(labelUsername, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textUsername, constraints);
	        
	         
	        constraints.gridx = 0;
	        constraints.gridy = 1;     
	        newPanel.add(labelPassword, constraints);
	         
	        constraints.gridx = 1;
	        newPanel.add(fieldPassword, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.CENTER;
	        newPanel.add(buttonLogin, constraints);
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        add(newPanel);
	         
	        pack();
	        setLocationRelativeTo(null);
	        
	        
	        
	        buttonLogin.addActionListener(new ActionListener() {
				
				
	        
	            public void actionPerformed(ActionEvent e) {
	            	textFieldUser = textUsername.getText();
	         	    textFieldPass = String.valueOf(fieldPassword.getPassword());
	         	    textFieldPass.toString();
	            	
	            	LoginValidation.connectDatabase(textFieldUser, textFieldPass.toString());
	            	if(entry)
	            	{
	            	
	            	//This is where the main class' LoginPage() is redirected to
	                System.out.println("Success");
	                dispose();
	               // new FirstForm().setVisible(true); // Main Form to show after the Login Form..
	               new LandingPage().setVisible(true); 
	                System.out.println("Success");
	                System.out.println();
	            	}
	            	else
	            	{
	            		String message = "You may want to check the Password...OOPS, may be user id?";
	            		    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
	            		        JOptionPane.ERROR_MESSAGE);
	            	}
	            }
	        });
	    
	    
	    }
	     
	    public static void main(String[] args) {
	        // set look and feel to the system look and feel
	        try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	         
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new LoginPage().setVisible(true);
	            }
	        });
	        
	    }
}