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

		JLabel lblNewLabel = new JLabel("", new ImageIcon("final_help_page.jpg"), JLabel.CENTER);
		;
		lblNewLabel.setBounds(15, 98, 864, 772);
		getContentPane().add(lblNewLabel);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(716, 64, 115, 29);
		getContentPane().add(btnBack);
		
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
