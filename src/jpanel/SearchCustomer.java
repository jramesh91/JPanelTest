package jpanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
import java.awt.BorderLayout;
public class SearchCustomer extends JFrame{
	private JTextField txtUnderConstruction;
	public SearchCustomer() {
		
		txtUnderConstruction = new JTextField();
		txtUnderConstruction.setText("Under Construction!");
		getContentPane().add(txtUnderConstruction, BorderLayout.CENTER);
		txtUnderConstruction.setColumns(10);
		
		
		pack();
	}

	
	
}
