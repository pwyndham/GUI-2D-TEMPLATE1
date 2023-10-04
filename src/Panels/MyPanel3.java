package Panels;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Drinks.Drink;



public class MyPanel3 extends JPanel implements ActionListener{

	
	JLabel AList = new JLabel("Alcohol Menu");
	
	JLabel cart;
	
	JLabel totalCostText;
	
	boolean LemondropVisible = false;
	boolean OldFashionedVisible = false;
	boolean CosmoVisible = false;
	boolean BlueHawaiianVisible = false;
	boolean MargaritaVisible = false;
	
	ArrayList<String> UserOrder = new ArrayList<String>();
	
	Image LemondropImage;
	Image OldFashionedImage;
	Image CosmoImage;
	Image BlueHawaiianImage;
	Image MargaritaImage;
	
	JButton Lemondrop;
	JButton OldFashioned = new JButton("Old Fashioned");
	JButton Cosmo = new JButton("Cosmopolitan");
	JButton BlueHawaiian = new JButton("Blue Hawaiian");
	JButton Margarita = new JButton("Margarita");
	JButton FinishOrder = new JButton("Finish Order");
	JButton removeButton = new JButton("Remove Last Item");
	
	DecimalFormat decimalFormat = new DecimalFormat("#.00");
	
	
		
	
	public MyPanel3(){
		
		
		 	this.setPreferredSize(new Dimension(1000,800));
		    this.setBackground(Color.white);
		 	this.setLayout(null);
		
		LemondropImage = new ImageIcon("D:\\IMAGES FOR JAVA\\Lemondrop.jpg").getImage();
		Lemondrop = new JButton("Lemondrop");
		
		OldFashionedImage = new ImageIcon("D:\\IMAGES FOR JAVA\\Old Fashioned.jpg").getImage();
		
		CosmoImage = new ImageIcon("D:\\IMAGES FOR JAVA\\Cosmo.jpg").getImage();
		
		BlueHawaiianImage = new ImageIcon("D:\\IMAGES FOR JAVA\\Blue Hawaiian.jpg").getImage();
		
		MargaritaImage = new ImageIcon("D:\\IMAGES FOR JAVA\\Margarita.jpg").getImage();
		
		
		
	
		cart = new JLabel("Your Shopping Cart: ");
		cart.setFont(new Font("Times New Roman", Font.PLAIN,20));
		cart.setBounds(775,50,200,300);
		this.add(cart);
		
		
		Lemondrop.setBounds(50,50,200,100);
		Lemondrop.setFocusable(false);
		Lemondrop.addActionListener(this);
		Lemondrop.setFont(new Font("Times New Roman", Font.PLAIN,20));
		
		OldFashioned.setBounds(50,200,200,100);
		OldFashioned.setFocusable(false);
		OldFashioned.addActionListener(this);
		OldFashioned.setFont(new Font("Times New Roman", Font.PLAIN,20));

		
		Cosmo.setBounds(50,350,200,100);
		Cosmo.setFocusable(false);
		Cosmo.addActionListener(this);
		Cosmo.setFont(new Font("Times New Roman", Font.PLAIN,20));

		
		BlueHawaiian.setBounds(50,500,200,100);
		BlueHawaiian.setFocusable(false);
		BlueHawaiian.addActionListener(this);
		BlueHawaiian.setFont(new Font("Times New Roman", Font.PLAIN,20));

		
		Margarita.setBounds(50,650,200,100);
		Margarita.setFocusable(false);
		Margarita.addActionListener(this);
		Margarita.setFont(new Font("Times New Roman", Font.PLAIN,20));
		
		FinishOrder.setBounds(750,500,200,50);
		FinishOrder.setFocusable(false);
		FinishOrder.addActionListener(this);
		FinishOrder.setFont(new Font("Times New Roman", Font.PLAIN,20));
	
		removeButton.setBounds(750, 550, 200, 50);
		removeButton.setFocusable(false);
		removeButton.addActionListener(this);
		removeButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.add(removeButton);
    	
		AList.setForeground(Color.black);
		AList.setBackground(Color.white);
		AList.setFont(new Font("Times New Roman", Font.PLAIN,30));
		AList.setIconTextGap(100);
		AList.setOpaque(true);
		AList.setVerticalAlignment(JLabel.TOP);
		AList.setHorizontalAlignment(JLabel.CENTER);
		AList.setBounds(250,0,500,300);
		
		totalCostText = new JLabel("Total Cost: $");
		totalCostText.setFont(new Font("Times New Roman", Font.PLAIN,20));
		totalCostText.setBounds(750,550,400,200);
		this.add(totalCostText);
		
		this.add(Lemondrop);
		this.add(OldFashioned);
		this.add(Cosmo);
		this.add(BlueHawaiian);
		this.add(Margarita);
		this.add(FinishOrder);
		this.add(AList);
		
		
		
		
	}
	@Override
public void paint(Graphics g) {
    super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		  
		if (LemondropVisible) {
	        g2D.drawImage(LemondropImage, 410, 335, null);
	        
	    } else if (OldFashionedVisible){
	    	g2D.drawImage(OldFashionedImage, 420, 400, null);
	    	
		} else if (CosmoVisible){
	    	g2D.drawImage(CosmoImage, 410, 335, null);
	    	
		} else if (BlueHawaiianVisible){
	    	g2D.drawImage(BlueHawaiianImage, 385, 300, null);
	    	
		} else if (MargaritaVisible){
	    	g2D.drawImage(MargaritaImage, 420, 400, null);
		}
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		  switch (e.getActionCommand()) {
	        case "Lemondrop":
	            UserOrder.add("Lemondrop");
	            LemondropVisible = !LemondropVisible;
	            break;
	        case "Old Fashioned":
	            UserOrder.add("Old Fashioned");
	            OldFashionedVisible = !OldFashionedVisible;
	            break;
	        case "Cosmopolitan":
	            UserOrder.add("Cosmopolitan");
	            CosmoVisible = !CosmoVisible;
	            break;
	        case "Blue Hawaiian":
	            UserOrder.add("Blue Hawaiian");
	            BlueHawaiianVisible = !BlueHawaiianVisible;
	            break;
	        case "Margarita":
	            UserOrder.add("Margarita");
	            MargaritaVisible = !MargaritaVisible;
	            break;
	            
	        case "Remove Last Item":
	        	 if (!UserOrder.isEmpty()) {
	                 UserOrder.remove(UserOrder.size() - 1); 
	                 UpdateCart(); 
	             }
	        	 	break;
	        case "Finish Order":
	        	double cost = calculateTotalCost();
	            double tax = cost * 0.08; 
	    	    double mandatoryTip = cost * 0.15;
	    	    
	        
	    	    DecimalFormat decimalFormat = new DecimalFormat("#.00");
	    	    
	        	   UserOrder.add("Order Complete");
	        	    UserOrder.add("Tax: $" + decimalFormat.format(tax));
	        	    UserOrder.add("Tip: $" + decimalFormat.format(mandatoryTip));
	        	    UserOrder.add("Total Cost: $" + decimalFormat.format(cost));
	        	    
	        	    
	        	    totalCostText.setText(
	        	            
	        	            " Total Cost: $" + decimalFormat.format(cost)
	        	        );	        	break;

	    }
			
			UpdateCart();
			
			System.out.println(UserOrder);

		}
		
	
	public void UpdateCart() {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		 	double cost = 0.0;
		    double tax = 0.0;
		    double mandatoryTip = 0.0;
		StringBuilder cartText = new StringBuilder("<html><b>Your Shopping Cart:</b><br>");
	

		 for (int i = 0; i < UserOrder.size(); i++) {
		        String itemName = UserOrder.get(i);
		        Drink drink = getDrinkByName(itemName);
		 
		
			if(drink!=null) {
				cartText.append(itemName).append(" - $").append(drink.getPrice()).append("<br>");
	            cost += drink.getPrice();
	            tax += drink.getPrice() * 0.08; 
	            mandatoryTip += drink.getPrice() * 0.15;
		}
		}
		 double totalCost = calculateTotalCost();
		    cartText.append("Tax: $" + decimalFormat.format(tax) + "<br>");
		    cartText.append("Tip: $" + decimalFormat.format(mandatoryTip) + "<br>");
		    cartText.append("Total Cost: $" + decimalFormat.format(totalCost) + "<br></html>");

		    cart.setText(cartText.toString());
	        
	    }
	public double calculateTotalCost() {
		 double cost = 0.0;

	    for (String itemName : UserOrder) {
	        Drink drink = getDrinkByName(itemName);
	        if (drink != null) {
	            cost += drink.getPrice();
	        }
	    }
	    
	    double tax = cost * 0.08; 
	    double mandatoryTip = cost * 0.15; 
	    double totalCost = cost + tax + mandatoryTip;
	    return totalCost;
	}
	public Drink getDrinkByName(String name) {
	    
	    Drink[] drinks = {
	        new Drink("Lemondrop", 12.0),
	        new Drink("Old Fashioned", 10.0),
	        new Drink("Cosmopolitan", 11.0),
	        new Drink("Blue Hawaiian", 13.0),
	        new Drink("Margarita", 12.5)
	    };
	    for (Drink drink : drinks) {
	        if (drink.getName().equals(name)) {
	            return drink;
	        }
	    }
		return null;

	}
}
