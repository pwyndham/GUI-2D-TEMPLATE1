package Frame;
import javax.swing.JFrame;

import Panels.MyPanel2;


public class MyFrame2 extends JFrame{
	MyPanel2 panel;
	
		public MyFrame2() {
			
		panel = new MyPanel2();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		}


		
}
