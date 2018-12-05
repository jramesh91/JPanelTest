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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

public class LandingPage extends JFrame{
	
	public LandingPage() {
		//JFrame frame= new JFrame();
		super();
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		

		
		
		
		JButton btnNewButton = new JButton("FirstForm");
		btnNewButton.setBounds(15, 91, 117, 29);
		btnNewButton.setPreferredSize(new Dimension(80, 40));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search Customer");
		btnNewButton_1.setBounds(285, 91, 117, 29);
		btnNewButton_1.setPreferredSize(new Dimension(80, 40));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generate Report");
		btnNewButton_2.setBounds(15, 166, 117, 29);
		panel.add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("TBD!");
		btnNewButton_3.setBounds(285, 166, 117, 29);
		panel.add(btnNewButton_3);
		
		JLabel label = new JLabel("");
		label.setBounds(178, 16, 69, 20);
		panel.add(label);
		
		JLabel lblLibministrator = new JLabel("LibMinistrator");
		lblLibministrator.setBounds(73, 16, 200, 100);
		lblLibministrator.setFont(new Font("Serif", Font.PLAIN, 32));
		panel.add(lblLibministrator);
		
		//pack();
		setLocationRelativeTo(null);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==btnNewButton_1)
				{System.out.println("This is redirected to Search Customer");
				dispose();
				new SearchCustomer().setVisible(true);
				}
				
				
				
				if(e.getSource()==btnNewButton)
				{
					System.out.println("This is redirected to the First Form");
					dispose();
					new FirstForm().setVisible(true);
				}
			
			
			}
		});
		
		
		//This is for the first form
  btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==btnNewButton)
				{
					System.out.println("This is redirected to the First Form");
					dispose();
					new FirstForm().setVisible(true);
				}
			
			
			}
		});
		
		
		
	}
	}

