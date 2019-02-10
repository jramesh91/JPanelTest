package jpanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
import com.toedter.calendar.JDateChooser;

import businessProcess.Rem_Balance;
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

public class RemainingBalance extends JFrame{
	private JTextField textField;
 
	public RemainingBalance()
	{
	super();
	getContentPane().setLayout(null);
	
	JDateChooser dateChooser_1 = new JDateChooser();
    dateChooser_1.setBounds(367, 218, 146, 26);
    getContentPane().add(dateChooser_1);
	
	//Logout Button:
	JButton btnLogout = new JButton("Logout");
	btnLogout.setBounds(609, 16, 115, 29);
	getContentPane().add(btnLogout);
	setSize(900, 900);
	setLocation(450,150);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	ImageIcon img = new ImageIcon("RIESI_Logo.png");
    setIconImage(img.getImage());
	
	//Text Pane for Remaining Balance
	JTextPane txtpnNewCustomerEntry = new JTextPane();
    txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
    txtpnNewCustomerEntry.setBounds(279, 71, 315, 45);
    txtpnNewCustomerEntry.setText("Remaining Balance");
    txtpnNewCustomerEntry.setEditable(false);
    getContentPane().add(txtpnNewCustomerEntry);
    //Save Button
    JButton btnSave = new JButton("Save");
    btnSave.setBounds(451, 432, 115, 29);
    getContentPane().add(btnSave);
    
    JButton btnBack = new JButton("Back");
    btnBack.setBounds(232, 432, 115, 29);
    getContentPane().add(btnBack);
    
    JButton button = new JButton("Check Balance");
    button.setBounds(518, 218, 155, 29);
    getContentPane().add(button);
    
    JLabel lblEnterDate = new JLabel("Enter Date");
    lblEnterDate.setForeground(new Color(0, 255,30));
    lblEnterDate.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
    lblEnterDate.setBounds(216, 208, 169, 43);
    getContentPane().add(lblEnterDate);
    
    JLabel lblCopiesArrived = new JLabel("Copies Arrived");
    lblCopiesArrived.setForeground(new Color(0, 255, 30));
    lblCopiesArrived.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 22));
    lblCopiesArrived.setBounds(177, 274, 170, 52);
    getContentPane().add(lblCopiesArrived);
    
    textField = new JTextField();
    textField.setBounds(367, 290, 146, 26);
    getContentPane().add(textField);
    textField.setColumns(10);
    
	//ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
    JLabel lable = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
    lable.setBounds(0, 0, 905, 1000);
    getContentPane().add(lable);
	
    
    btnSave.addActionListener(new ActionListener() {
    	DateFormat m_y = new SimpleDateFormat("MMYYYY");
    		
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				// TODO Auto-generated method stub
  				if(e.getSource()==btnSave)
  				{
  					
  					if((m_y.format(dateChooser_1.getDate())).equals("")) {
  						JOptionPane.showMessageDialog(null, "Hmm!Seems You didn't enter MM,YY");
  					}
  					else {
  						System.out.println("Details are saved in the Remaining Balance Table");
  					Rem_Balance.saveRemDetails(Integer.parseInt(m_y.format(dateChooser_1.getDate())),textField.getText());
  					}
  					
  				}
  			
  			}
  		});
    
    //Checking Balance Button
    button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DateFormat m_y = new SimpleDateFormat("MMYYYY");
				
				// TODO Auto-generated method stub
				try {
				if(e.getSource()==button)
				{
					System.out.println("Checking Balance.....!");
					Rem_Balance.checkBalance(Integer.parseInt(m_y.format(dateChooser_1.getDate())));
					JOptionPane.showMessageDialog(null, "The Promised is: "+Rem_Balance.isAvailable+" and the current balance is "+Rem_Balance.CurrentPromised+"", "Balance Details", JOptionPane.INFORMATION_MESSAGE);
					
					
				}
			
			}
			catch (NullPointerException ex)
			{
				JOptionPane.showMessageDialog(null, "Please enter the right values", "Check Details", JOptionPane.WARNING_MESSAGE);
				
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
    
    
    
	
	
	
	}
}
