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
	private JTextField textField_1;
	private JTextField textField_2;
 
	public RemainingBalance()
	{
	super();
	getContentPane().setLayout(null);
	
	
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
    
    JLabel lblEnterMonth = new JLabel("Enter Month");
    lblEnterMonth.setBounds(163, 183, 115, 20);
    getContentPane().add(lblEnterMonth);
    
    JLabel lblRemainingBalance = new JLabel("Remaining Balance");
    lblRemainingBalance.setBounds(163, 294, 146, 20);
    getContentPane().add(lblRemainingBalance);
    //Date Text Field
    textField = new JTextField();
    textField.setBounds(309, 180, 146, 26);
    getContentPane().add(textField);
    textField.setColumns(10);
    //Text Field For Remaining Balance
    textField_1 = new JTextField();
    textField_1.setBounds(309, 291, 146, 26);
    getContentPane().add(textField_1);
    textField_1.setColumns(10);
    //Save Button
    JButton btnSave = new JButton("Save");
    btnSave.setBounds(451, 375, 115, 29);
    getContentPane().add(btnSave);
    
    textField_2 = new JTextField();
    textField_2.setBounds(309, 235, 146, 26);
    getContentPane().add(textField_2);
    textField_2.setColumns(10);
    
    JLabel lblEnterYear = new JLabel("Enter Year");
    lblEnterYear.setBounds(163, 238, 81, 20);
    getContentPane().add(lblEnterYear);
	
    
    btnSave.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				// TODO Auto-generated method stub
  				if(e.getSource()==btnSave)
  				{
  					System.out.println("Details are saved in the Remaining Balance Table");
  					Rem_Balance.saveRemDetails(textField.getText(),textField_2.getText(),textField_1.getText());
  					
  				}
  			
  			}
  		});
	
	
	
	}
}