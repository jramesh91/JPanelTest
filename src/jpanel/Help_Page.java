package jpanel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help_Page extends JFrame {
	public Help_Page() {
		super();
        
        
        getContentPane().setLayout(null);
		setSize(900, 900);
		setLocation(450,150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		ImageIcon img = new ImageIcon("RIESI_Logo.png");
	    setIconImage(img.getImage());
		
		
	}
		
		

}
