package Frame;
import javax.swing.JFrame;

import Panels.MyPanel3;

public class MyFrame3 extends JFrame{
	MyPanel3 panel;
	
		public MyFrame3() {
			
			
		panel = new MyPanel3();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		}


		
}
