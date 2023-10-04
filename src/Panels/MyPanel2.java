package Panels;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;





	public class MyPanel2 extends JPanel implements ActionListener{

	
private final ArrayList<IceCube> iceCubes = new ArrayList<>();
  
private Map<JButton, Color> buttonColorMap = new HashMap<>();
	   
		JButton Vodka;
		JButton Tequila;
		JButton Rum;
		JButton LimeJuice;
		JButton Soda;
		JButton Coke;
		JButton Water;
		JButton crushedIce;
		JButton shakerTopButton;
		JButton shakerBottomButton;
		JButton tallGlassButton;
		JButton shortGlassButton;
		JButton martiniButton;

Image shakerTop;
Image shakerBottom;
Image shortGlass;
Image tallGlass;
Image martini;
Image IceCube;

private boolean isWaterVisible = false;
boolean shakerTopVisible = false;
boolean shakerBottomVisible = false;
boolean tallGlassVisible = false;
boolean shortGlassVisible = false;
boolean martiniVisible = false;

private Timer timer;
private int animationSpeed = 10;
private int startX = 475; 
private int endX = 500;   
private int liquidLevel = 0;
private int fillLevel = 0;
private int animationDuration = 5000;
private long startTime;
private Color liquidColor = Color.lightGray;  
  
double rotationAngle = 0;
int xVelocity = 5;
int yVelocity = 5;
int x = 0;
int y = 0;

	public MyPanel2(){
 
	    this.setPreferredSize(new Dimension(1000,750));
	    this.setBackground(Color.white);
	 	this.setLayout(null);
	 	
	 	timer = new Timer(100, this);

	    shakerTop = new ImageIcon("D:\\IMAGES FOR JAVA\\Shaker top.jpg").getImage();
	    shakerBottom = new ImageIcon("D:\\IMAGES FOR JAVA\\Shaker bottom.jpg").getImage();
	    shortGlass = new ImageIcon("D:\\IMAGES FOR JAVA\\Short glass.jpg").getImage();
	    tallGlass = new ImageIcon("D:\\IMAGES FOR JAVA\\Tall Glass.jpg").getImage();
	    martini = new ImageIcon("D:\\IMAGES FOR JAVA\\Martini.jpg").getImage();
	   
	    
	    shakerTopButton = new JButton(new ImageIcon(shakerTop));
	    shakerTopButton.addActionListener(this);
	    
	    
	    shakerBottomButton = new JButton(new ImageIcon(shakerBottom));
	    shakerBottomButton.addActionListener(this);
	    
	    JLabel shortGlassLabel = new JLabel("Short Glass");
	    this.add(shortGlassLabel);
	    shortGlassLabel.setBounds(840,40,200,200);
	    shortGlassLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    
	    shortGlassButton = new JButton(new ImageIcon(shortGlass));
	    shortGlassButton.setBackground(Color.white);
	    shortGlassButton.addActionListener(this);
	    shortGlassButton.setBounds(800, 150, 175,200);
	    
	    JLabel tallGlassLabel = new JLabel("Tall Glass");
	    this.add(tallGlassLabel);
	    tallGlassLabel.setBounds(845, 290, 200, 200);
	    tallGlassLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    
	    tallGlassButton = new JButton(new ImageIcon(tallGlass)); 
	    tallGlassButton.setBackground(Color.white);
	    tallGlassButton.addActionListener(this);
	    tallGlassButton.setBounds(800, 400, 175,200);
	
	    JLabel IntroLabel = new JLabel("Customize Your Drink Here");
	    IntroLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
	    IntroLabel.setBounds(300, 0, 500, 100);
	    this.add(IntroLabel);
        
	    JLabel Alcohol = new JLabel("Alcohol");
	    JLabel Mixers = new JLabel("Mixers");

	    crushedIce = new JButton("Add Ice");
	    crushedIce.setFont(new Font(null, Font.BOLD, 20));
	    crushedIce.addActionListener(this);
	    crushedIce.setBounds(0, 500, 200,100);	    
	    crushedIce.addActionListener(this);
	    this.add(crushedIce);
	   	
	    Vodka = new JButton("Vodka");
	    Vodka.setFont(new Font(null, Font.BOLD, 12));
	    Vodka.addActionListener(this);
	    
	    Tequila = new JButton("Tequila");
	    Tequila.setFont(new Font(null, Font.BOLD, 12));
	    Tequila.addActionListener(this);
	    
	    Rum = new JButton("Rum");
	    Rum.setFont(new Font(null, Font.BOLD, 12));
	    Rum.addActionListener(this);
	    
	    LimeJuice = new JButton("Lime Juice");
	    LimeJuice.setFont(new Font(null, Font.BOLD, 12));
	    LimeJuice.addActionListener(this);
	    
	    Soda = new JButton("Soda");
	    Soda.setFont(new Font(null, Font.BOLD, 12));
	    Soda.addActionListener(this);
	    
	    Coke = new JButton("Coke");
	    Coke.setFont(new Font(null, Font.BOLD, 12));
	    Coke.addActionListener(this);

	    this.add(Vodka);
	    Vodka.setBounds(0,200, 100,100);
	    
	    this.add(Tequila);
	    Tequila.setBounds(0,300, 100,100);
	    
	    this.add(Rum);
	    Rum.setBounds(0,400, 100,100);
	    
	    this.add(LimeJuice);
	    LimeJuice.setBounds(100,200, 100,100);
	    
	    this.add(Soda);
	    Soda.setBounds(100,300, 100,100);
	    
	    this.add(Coke);
	    Coke.setBounds(100,400, 100,100);
	    
	    this.add(Alcohol);
	    Alcohol.setBounds(5,100, 100,100);
	    Alcohol.setFont(new Font(null, Font.PLAIN, 25));
	    
	    this.add(Mixers);
	    Mixers.setBounds(110,100, 100,100);
	    Mixers.setFont(new Font(null, Font.PLAIN, 25));
	    

	    startTime = System.currentTimeMillis();
	    timer.start();
	    
	    buttonColorMap.put(Vodka, Color.yellow);
	    buttonColorMap.put(Tequila, Color.red);
	    buttonColorMap.put(Rum, Color.orange);
	    buttonColorMap.put(LimeJuice, Color.green);
	    buttonColorMap.put(Soda, Color.blue);
	    buttonColorMap.put(Coke, Color.black);
	   
	  
	    this.add(shakerTopButton);
	    this.add(shakerBottomButton);
	    this.add(shortGlassButton);
	    this.add(tallGlassButton);
	
}

@Override
public void paint(Graphics g) {
    super.paint(g);
	
	Graphics2D g2D = (Graphics2D) g;
	   for (IceCube iceCube : iceCubes) {
	        iceCube.draw(g2D);
	    }

	if (tallGlassVisible) {
        g2D.drawImage(tallGlass, 440, 416, null);
        
    }
   
	if (shortGlassVisible) {
        g2D.drawImage(shortGlass, 440, 485, null);
        
    }

	repaint();

g2D.setStroke(new BasicStroke((int)1));
g2D.setColor(Color.black);
g2D.drawLine(0, 100, 199, 100);
g2D.drawLine(99, 200, 99, 100);
g2D.drawLine(199, 200, 199, 100);
g2D.drawLine(0, 200, 0, 100);
g2D.drawLine(199, 200, 0, 200);
g2D.setStroke(new BasicStroke((int)1));
	
g2D.setColor(Color.black);
g2D.fillRect(0, 600, 1000, 300);

        int panelHeight = 750;
        int rectWidth = 91; 
        int rectHeight = (liquidLevel * panelHeight) / 100;
        
        int yCoordForFill = panelHeight - rectHeight - 155;
      
        g.setColor(liquidColor);
        g.fillRect(441, yCoordForFill, rectWidth, rectHeight);
        
        Path2D.Double water1 = new Path2D.Double();

        water1.moveTo(500, 400);
        water1.curveTo(500, 300, 450, 250, 400, 200);
        water1.moveTo(505, 405);
        water1.curveTo(505, 305, 455, 255, 405, 205);
        water1.moveTo(510, 410);
        water1.curveTo(510, 310, 460, 260, 410, 210);
        water1.moveTo(515, 415);
        water1.curveTo(515, 315, 465, 265, 415, 215);

        if (isWaterVisible) {
            g2D.draw(water1);
        }
     
} 
	

@Override
public void actionPerformed(ActionEvent e) {
	moveIceCubes();

	
	  if (e.getSource() == shakerTopButton) {
	        shakerTopVisible = !shakerTopVisible;

	        System.out.println("yo");
	    } else if (e.getSource() == shakerBottomButton) {
	        shakerBottomVisible = !shakerBottomVisible;
	       
	    } else if (e.getSource() == tallGlassButton) {
	        tallGlassVisible = !tallGlassVisible;
	       
	    } else if (e.getSource() == shortGlassButton) {
	        shortGlassVisible = !shortGlassVisible;
	        
	    } else if (e.getSource() == martiniButton) {
	        martiniVisible = !martiniVisible;
	        
	    } else if (e.getSource() == crushedIce) {
	    	
	    	startAnimation();
	    	moveIceCubes();
	    	repaint();
	    	
	    }else if (e.getSource() == Vodka) {
	        pour(2); 
	        isWaterVisible = true;
	        liquidColor = Color.lightGray;
	        repaint();
	    } else if (e.getSource() == Tequila) {
	        pour(2); 
	        isWaterVisible = true;
	        liquidColor = Color.yellow;
	        repaint();
	    } else if (e.getSource() == Rum) {
	        pour(2); 
	        isWaterVisible = true;
	        liquidColor = Color.orange;
	        repaint();
	    } else if (e.getSource() == Coke) {
	        pour(4); 
	        isWaterVisible = true;
	        liquidColor = Color.black;
	        repaint();
	    } else if (e.getSource() == Soda) {
	        pour(4); 
	        isWaterVisible = true;
	        liquidColor = Color.blue;
	        repaint();
	    } else if (e.getSource() == LimeJuice) {
	        pour(4); 
	        isWaterVisible = true;
	        liquidColor = Color.green;
	        repaint();
	    } 
	    else if (buttonColorMap.containsKey(e.getSource())) {
	        fillLevel = 50; 
	        liquidColor = buttonColorMap.get(e.getSource());
	        repaint();
	    } 
	    
	    	
	    	
	    
	  repaint();
	  

	
}  

private void pour(int amount) {
    if (liquidLevel + amount <= 100) {
        liquidLevel += amount;
        repaint();
    }
}


private void startAnimation() {
    Random rand = new Random();
//ice cube numbers
    for (int i = 0; i < 10; i++) { 
        int x = rand.nextInt(endX - startX) + startX; 
        int y = 275;
        iceCubes.add(new IceCube(x, y));
    }

    timer.start();
}

private void moveIceCubes() {

    for (IceCube iceCube : iceCubes) {
        iceCube.move();
    }
}

	
	
	
	
    private class IceCube {
        private int x, y;

        public IceCube(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            y += 50; 
        }

        public void draw(Graphics2D g2D) {
            g2D.setColor(Color.black);
            g2D.drawRect(x, y, 10, 10);
        }
    }
   
	}

	/*
	 
// this.add(martiniButton);

private void mix() {
		
double amplitude = 10; 
double frequency = 10; 

x = (int) (amplitude * Math.sin(frequency * rotationAngle));
y = (int) (amplitude * Math.cos(frequency * rotationAngle));

rotationAngle += 0.1; 
	    
	    		if (e.getSource() == timer) {
			
			  mix(); 
	        
			  long currentTime = System.currentTimeMillis();
	          long elapsedTime = currentTime - startTime;

	          if (elapsedTime < animationDuration) {
	              fillLevel = (int) ((double) elapsedTime / animationDuration * 100);
	              repaint();
	          } else {
	              fillLevel = 100; 
	              timer.stop(); 
	          }
	          
	          
		}

	}	
	
	   /*
	if (martiniVisible) {
        g2D.drawImage(martini, 425, 385, null);
       
    }
    
    	
/*
	if (shakerTopVisible) {
        g2D.drawImage(shakerTop, 500, 600, null);
        
    }
    
    
	if (shakerBottomVisible) {
        g2D.drawImage(shakerBottom, 500, 500, null);
       
    }
    
    
	    JLabel martiniLabel = new JLabel("Martini Glass");
	    this.add(martiniLabel);
	    martiniLabel.setBounds(830, 540, 200, 200);
	    martiniLabel.setFont(new Font(null, Font.BOLD, 20));
	   
	    martiniButton = new JButton(new ImageIcon(martini)); 
	    martiniButton.setBackground(Color.white);
	    martiniButton.addActionListener(this);
	    martiniButton.setBounds(800, 650, 175,200);
	   
  */ 





