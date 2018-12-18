package jpanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
import java.awt.GridLayout;
import java.awt.Toolkit;

public class GenerateReport extends JFrame{
	    private static int subs_id = Math.round(999 + (int)(Math.random() * 9999));
	     //This is the login page
	    
	    
	    
	    public GenerateReport() {
	    	
	        super("JPanel Demo Program");
	        System.out.println("Entered Generate Panel");
	        JFrame frame = new JFrame("main");
	        //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg"));
	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	      // ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
	       //JLabel lable = new JLabel(ii);
	       //JScrollPane jsp = new JScrollPane(lable);
	       //frame.getContentPane().add(jsp);
	       frame. setSize(500, 500);
	       JButton button = new JButton();
	       button.setSize(new Dimension(50, 50));
	       button.setLocation(500, 350);
	      frame.getContentPane().add(button);
	      
	 frame.setVisible(true);

	        /*JFrame frame = new JFrame("main");
	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        JPanel newPanel = new JPanel();
	        setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	        frame. setSize(1000, 700);
	        
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        getContentPane().add(newPanel);
	        newPanel.setLayout(new GridLayout(1, 0, 0, 0));
	        
	        JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
	        txtpnNewCustomerEntry.setText("Generate the report for the Annual Year");
	        
	        
	        JButton btnLogout = new JButton("Logout");
	      
	  
	        JButton btnBack = new JButton("Back");
	        
	        JButton btnCancel = new JButton("Cancel");
	        
	        
	        JButton btnAddMoreDetails = new JButton("Generate");
	      
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
	        */
	        
	        /*pack();
	        setLocationRelativeTo(null);*/
	    }
}
