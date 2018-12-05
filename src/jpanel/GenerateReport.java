package jpanel;

import javax.swing.JFrame;
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

public class GenerateReport extends JFrame {
	private JTextField txtWhatYouLooking;
	public GenerateReport() {
		
		txtWhatYouLooking = new JTextField();
		txtWhatYouLooking.setText("What you looking at?");
		getContentPane().add(txtWhatYouLooking, BorderLayout.CENTER);
		txtWhatYouLooking.setColumns(10);
		pack();
	}

}
