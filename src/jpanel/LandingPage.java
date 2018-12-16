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

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;
import javax.imageio.ImageIO;

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
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.SystemColor;

public class LandingPage extends JFrame{
	
	public LandingPage() {
		
		super();
		JFrame frame= new JFrame();
		frame.setState(Frame.NORMAL);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		//setContentPane(new JLabel(new ImageIcon("bg.jpg")));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{162, 117, 46, 95, 117, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{20, 0, 55, 29, 46, 46, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblLibministrator = new JLabel("LibMinistrator");
		lblLibministrator.setFont(new Font("Serif", Font.PLAIN, 32));
		GridBagConstraints gbc_lblLibministrator = new GridBagConstraints();
		gbc_lblLibministrator.anchor = GridBagConstraints.EAST;
		gbc_lblLibministrator.fill = GridBagConstraints.VERTICAL;
		gbc_lblLibministrator.insets = new Insets(0, 0, 5, 5);
		gbc_lblLibministrator.gridheight = 4;
		gbc_lblLibministrator.gridwidth = 2;
		gbc_lblLibministrator.gridx = 2;
		gbc_lblLibministrator.gridy = 0;
		panel.add(lblLibministrator, gbc_lblLibministrator);
		
		
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JButton btnLogout = new JButton("Logout");
		GridBagConstraints gbc_btnLogout = new GridBagConstraints();
		gbc_btnLogout.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogout.gridx = 5;
		gbc_btnLogout.gridy = 1;
		panel.add(btnLogout, gbc_btnLogout);
		
		

		
		
		
		JButton btnNewButton = new JButton("FirstForm");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setPreferredSize(new Dimension(80, 40));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		
		//This is for the first form
 
		
		JButton btnNewButton_1 = new JButton("Search Customer");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setPreferredSize(new Dimension(80, 40));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 3;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		
		
		
		JButton btnNewButton_2 = new JButton("Generate Report");
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setForeground(SystemColor.activeCaptionText);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 5;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("Add new subscription");
		btnNewButton_3.setBackground(Color.GREEN);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 5;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		
		
		
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
		
		
		//Button to go into New Sub entry page
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==btnNewButton_3)
				{
					System.out.println("This is redirected to Subscription Page");
					dispose();
					//This is created to show no customer ID when the navigation is jumped from Landing to Subscription
					String a = null;
					new SubscriptionPage(a).setVisible(true);
				}
			
			}
		});
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(frame, 
		            "Are you sure you want to close this window?", "Close Window?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }
		    }
		});
		
		pack();
		setLocationRelativeTo(null);
		
		
		
	}
	}

