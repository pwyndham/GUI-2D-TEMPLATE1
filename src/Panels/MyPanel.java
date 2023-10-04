package Panels;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Frame.MyFrame2;
import Frame.MyFrame3;

public class MyPanel extends JPanel implements ActionListener{
	
	JButton CustomDrinkOrder = new JButton("Open Custom Drink Menu");
	JButton DrinkMenu = new JButton("Open Drink Menu");
	Image FrameOpener;
	JButton CustomDrinks;
	
	JLabel RestaurantName;
	
	JPanel panel;
	
	JFrame frame;

	public MyPanel(){

		this.setPreferredSize(new Dimension(750,750));
		
		
		this.setBackground(Color.white);
		
		this.setLayout(new BorderLayout());
		FrameOpener = new ImageIcon("D:\\IMAGES FOR JAVA\\Bar Picture.jpg").getImage();
		
		
		
		
		CustomDrinkOrder.setBounds(400,100,300,100);
		CustomDrinkOrder.setFont(new Font("Times New Roman", Font.PLAIN,20));
		CustomDrinkOrder.setFocusable(false);
		CustomDrinkOrder.addActionListener(this);
		
		DrinkMenu.setBounds(50,100,300,100);
		DrinkMenu.setFont(new Font("Times New Roman", Font.PLAIN,20));
		DrinkMenu.setFocusable(false);
		DrinkMenu.addActionListener(this);
		
	
		
		this.add(CustomDrinkOrder);
		this.add(DrinkMenu);

		
		RestaurantName = new JLabel("Welcome to the Animation Bar!");
		
		RestaurantName.setSize(300, 200);
		RestaurantName.setFont(getFont());
		RestaurantName.setLocation(200, 500);
		RestaurantName.setHorizontalTextPosition(JLabel.CENTER);
		RestaurantName.setVerticalTextPosition(JLabel.TOP);
		RestaurantName.setForeground(new Color(0x000000));
		RestaurantName.setBackground(Color.white);
		RestaurantName.setFont(new Font("Times New Roman", Font.PLAIN,30));
		
		
		RestaurantName.setOpaque(true);
		
		RestaurantName.setVerticalAlignment(JLabel.TOP);
		RestaurantName.setHorizontalAlignment(JLabel.CENTER);
		RestaurantName.setBounds(0,0,250,250);
		
		this.add(RestaurantName);

		
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.drawImage(FrameOpener, 175, 350, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		 if(e.getSource()==CustomDrinkOrder) {
			
			new MyFrame2();
		} else if(e.getSource()==DrinkMenu){
			
			new MyFrame3();
			
		}
		
	}


}


	

