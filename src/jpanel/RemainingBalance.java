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
    dateChooser_1.setBounds(309, 221, 146, 26);
    getContentPane().add(dateChooser_1);
	
	//Logout Button:
	JButton btnLogout = new JButton("Logout");
	btnLogout.setBounds(609, 16, 115, 29);
	getContentPane().add(btnLogout);
	setSize(800, 800);
	setLocation(450,150);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//Text Pane for Remaining Balance
	JTextPane txtpnNewCustomerEntry = new JTextPane();
    txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
    txtpnNewCustomerEntry.setBounds(198, 72, 315, 45);
    txtpnNewCustomerEntry.setText("Remaining Balance");
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
    lblEnterDate.setBounds(163, 227, 131, 20);
    getContentPane().add(lblEnterDate);
    
    JLabel lblCopiesArrived = new JLabel("Copies Arrived");
    lblCopiesArrived.setBounds(163, 286, 115, 29);
    getContentPane().add(lblCopiesArrived);
    
    textField = new JTextField();
    textField.setBounds(309, 287, 146, 26);
    getContentPane().add(textField);
    textField.setColumns(10);
	
    
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
  					//Rem_Balance.saveRemDetails(Integer.parseInt(m_y.format(dateChooser_1.getDate())));
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
				if(e.getSource()==button)
				{
					System.out.println("Checking Balance.....!");
					//Rem_Balance.checkBalance(textField.getText(),textField_2.getText());
					Rem_Balance.checkBalance(Integer.parseInt(m_y.format(dateChooser_1.getDate())));
					//JOptionPane.showMessageDialog(null, "Your Current Balance is:" +Rem_Balance.CurrentBalance);
					
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
