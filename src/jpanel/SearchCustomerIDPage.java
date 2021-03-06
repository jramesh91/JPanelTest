package jpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.CellConstraints.Alignment;
import com.toedter.calendar.JDateChooser;

import businessProcess.Reporting_BP;
import businessProcess.SearchforID;

import javax.swing.JTextField;

public class SearchCustomerIDPage extends JFrame{
	
	 private static DefaultTableModel tableModel;
	    private JTable table;
	    private JScrollPane jScroll;
	    public static String [] column_header= {"Customer ID", "Full Name","Door Number","Street Name","City","State","Pin Code"};
	    public static Object [][] column_value;
	    private JTextField textField;

	public SearchCustomerIDPage()
	{
		super();
        
        
        getContentPane().setLayout(null);
		setSize(900, 900);
		setLocation(450,150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("RIESI_Logo.png");
	    setIconImage(img.getImage());
		
		 JTextPane txtpnNewCustomerEntry = new JTextPane();
	        txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
	        txtpnNewCustomerEntry.setBounds(98, 30, 384, 45);
	        txtpnNewCustomerEntry.setText("Search for Customer ID");
	        txtpnNewCustomerEntry.setEditable(false);
	        getContentPane().add(txtpnNewCustomerEntry);
	        
		
		 JLabel lblMonth = new JLabel("Enter Customer Name");
		 lblMonth.setForeground(new Color(2,255,234));
		 lblMonth.setFont(new Font("Courier", Font.BOLD, 16));
		 lblMonth.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 24));
		 lblMonth.setBounds(98, 125, 312, 39);
	        getContentPane().add(lblMonth);
		        
		        JButton btnGatherReport = new JButton("Search");
		        btnGatherReport.setBackground(new Color(204, 255, 255));
		        btnGatherReport.setBounds(443, 245, 139, 45);
			    getContentPane().add(btnGatherReport);
			    
			    
			    
			    
			    JPanel panel = new JPanel();
			    panel.setBounds(47, 355, 788, 374);
			    
			    getContentPane().add(panel);
			    tableModel = new DefaultTableModel(column_header,100);
			    table = new JTable(tableModel);
					table.setBounds(6, 357, 788, 374);
			    jScroll = new JScrollPane(table);
			    panel.add(jScroll);
			    
			    JButton btnBack = new JButton("Back");
			    btnBack.setBounds(234, 245, 148, 45);
			    getContentPane().add(btnBack);
			    
			    JButton btnLogout = new JButton("Logout");
			    btnLogout.setBounds(648, 16, 115, 29);
			    getContentPane().add(btnLogout);
			    
			    textField = new JTextField();
			    textField.setBounds(377, 125, 211, 45);
			    getContentPane().add(textField);
			    textField.setColumns(10);
			    
			    
				//ImageIcon ii = new ImageIcon("/Users/jramesh/Documents/Scooby Related/JPanelTest/bin/abstract-art-artistic-1020315.jpg");
			    JLabel lable = new JLabel("",new ImageIcon("Landing_Page3.jpg"),JLabel.CENTER);
			    lable.setBounds(0, 0, 1000, 1000);
			    getContentPane().add(lable);
			    
			  //Button to go into New Sub entry page
			    btnGatherReport.addActionListener(new ActionListener() {
			    	
			  			
			  			@Override
			  			public void actionPerformed(ActionEvent e) {
			  				// TODO Auto-generated method stub
			  				if(e.getSource()==btnGatherReport)
			  				{
			  					if(textField.getText().equals(false))
			  					{
			  						
			  					}
			  					
			  					System.out.println("Searching for report");
			  					
			  					SearchforID.searchCustomer(textField.getText());
			  					tableModel.getDataVector().removeAllElements();
			  					tableModel.fireTableDataChanged();
			  					for(int i = 0; i<column_value.length; i++)
			  					{
			  					tableModel.insertRow(i, column_value[i]);
			  					
			  					}
			  						
			  				}
			  				
			  				column_value = null;
			  				
			       
			  			}
			  		});
			    
			    
			    
			    
			    
			  //Action Listener for the Logout
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
