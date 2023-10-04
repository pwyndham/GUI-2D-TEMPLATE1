package Frame;
import javax.swing.JFrame;

import Panels.MyPanel;

public class MyFrame extends JFrame{
	MyPanel panel;
	
		public MyFrame() {
			
		
		panel = new MyPanel();
		this.setTitle("Bar App");
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		}


		
}
