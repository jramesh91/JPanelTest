package jpanel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Help_Page extends JFrame {
	public Help_Page() {
		super();

		getContentPane().setLayout(null);
		setSize(900, 900);
		setLocation(450, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextPane txtpnNewCustomerEntry = new JTextPane();
		txtpnNewCustomerEntry.setText("Help Page");
		txtpnNewCustomerEntry.setFont(new Font("Iowan Old Style", Font.BOLD | Font.ITALIC, 32));
		txtpnNewCustomerEntry.setBounds(362, 16, 167, 45);
		txtpnNewCustomerEntry.setEditable(false);
		getContentPane().add(txtpnNewCustomerEntry);
		;

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(764, 19, 115, 29);
		getContentPane().add(btnBack);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 92, 785, 765);
		
		
		String s = "New Customer:\n" + 
				"Enter the details of the new customer details in this page. Please remember, the details you entered here are not going to be"
				+ " \n saved until you give the subscription details too.\n" + 
				"\nDo not move to the next page without entering any details in this page. All fields are mandatory.\n" + 
				" \n" + 
				"Subscription Page:\n" + 
				"Enter the details of the subscription.\n" + 
				"Each shipment is considered as a subscription. Example, if a customer has subscribed for June of 2019 and December of 2019, it"
				+ "\n is considered 2 subscriptions. And the start date here is June 2019. You can select any date within June, it doesn’t matter."
				+ "\n All fields are mandatory in subscription page. Only after you enter all the details in New Customer and New Subscription, it "
				+ "will be saved in the database.a\n" + 
				" \n" + 
				"Generate Report:\n" + 
				"Generate Report is where you get the detailed list of people you need to ship the subscriptions. It will only display those that"
				+ "\n are not shipped and are active.\n" + 
				"To search for a report, just simply enter any date from a subscription, example June 3, 2019, and click Generate Report. Now, you"
				+ "\n can export this report into a .txt document. To do this, simply click on Generate Report. The file will be generated where the"
				+ "\n setup is installed and in the name format MMYYYY.txt.\n" + 
				" \n" + 
				"Modify Subscription:\n" + 
				"To modify a subscription, you need to know the subscription number. It is a simple mathematical calculation. The subscription"
				+ "\n numbers are in incremental order. Example, If a customer has a subscription from June 2019 to December 2019. His subscription"
				+ "\n IDs will be\n" + 
				"For June 2019 -> N, December  2019 ->  N +1, June 2020 -> N+2, December 2019 -> N+3.\n" + 
				"\nSo, if you want to cancel December 2020 for a customer, you can simply find the first subscription ID from Search Customer and"
				+ "\n add 3 to the subscription ID and mark it as Inactive.\n" + 
				" \n" + 
				"Remaining Balance:\n" + 
				" Remaining balance will show 2 things\n" + 
				"1.     How many copies are promised for a subscription at that point in time.\n" + 
				"\n2.     How many copies we have currently (default is 0)\n" + 
				"\n You can simply add a subscription copies by adding the number and click on Save. It will be updated.\n" + 
				" \n" + 
				"Search Customer ID:\n" + 
				" To search for a customer ID, you can simply type their full name or part of their name (First few letters) and get the list "
				+ "\n or the one customer with that name. Example, if you just type “G” in the search field and click on Search, it will list out "
				+ "\n all the customers with the name that starts with “G”. \n" + 
				"\n" ;
		textArea.setText(s);	
		getContentPane().add(textArea);
		/*JLabel lblNewLabel_1 = new JLabel("", new ImageIcon("twice1.jpg"), JLabel.CENTER);
		lblNewLabel_1.setBounds(15, 635, 864, 225);
		getContentPane().add(lblNewLabel_1); */

		ImageIcon img = new ImageIcon("RIESI_Logo.png");
		setIconImage(img.getImage());

		// Back Button's Action Listener(have to remove)
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btnBack) {
					System.out.println("Again to the LANDING PAGE!");
					dispose();
					new LandingPage().setVisible(true);
				}

			}
		});

	}
}
