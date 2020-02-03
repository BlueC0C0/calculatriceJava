package calculatrice;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	private JPanel pan = new JPanel();
	private JButton b0 = new JButton("0");  
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton b01 = new JButton("+");
	private JButton b02 = new JButton("-");
	private JButton b03 = new JButton("/");
	private JButton b04 = new JButton("*");
	private JButton b05 = new JButton("C");
	private JButton b07 = new JButton("=");
	private JButton b08 = new JButton(",");
	private JButton b06 = new JButton("resultat");
	
	
	
	
	
	public Fenetre(){
		
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    
	    this.setLayout(null);
	    b1.setBorderPainted(true);
	    b1.setBounds(20, 20, 100, 50);
	    pan.add(b1);
	    
	    
	    this.setVisible(true);
	    
	 }
	
	public Fenetre(String name, int xRes, int yRes){
		
	    this.setTitle(name);
	    this.setSize(xRes, yRes);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	    this.setLayout(null);
	    this.setVisible(true);
	    this.add(b0);
	    this.add(b1);
	    this.add(b2);
	    this.add(b3);
	    this.add(b4);
	    this.add(b5);
	    this.add(b6);
	    this.add(b7);
	    this.add(b8);
	    this.add(b9);
	    this.add(b01);
	    this.add(b02);
	    this.add(b03);
	    this.add(b04);
	    this.add(b05);
	    this.add(b06);
	    this.add(b07);
	    this.add(b08);
	    this.run();
	  }
	private void run()
	{
		for(;;)
		{
			int xRes, yRes;
			xRes = this.getWidth()-5*5;
			xRes/=3.5;
			yRes = this.getHeight()-5*6-20;
			yRes/=4.5;
			this.setBouton(b0, 10+xRes, 25+7*(yRes/2), xRes, yRes);//
			
		    this.setBouton(b1, 5, 10+yRes/2, xRes, yRes);//
		    this.setBouton(b2, 10+xRes, 10+yRes/2, xRes, yRes);//
		    this.setBouton(b3, 15+2*xRes, 10+yRes/2, xRes, yRes);//
		    
		    this.setBouton(b4, 5, 15+3*(yRes/2), xRes, yRes);//
		    this.setBouton(b5, 10+xRes, 15+3*(yRes/2), xRes, yRes);//
		    this.setBouton(b6, 15+2*xRes, 15+3*(yRes/2), xRes, yRes);//
		    
		    this.setBouton(b7, 5, 20+5*(yRes/2), xRes, yRes);//
		    this.setBouton(b8, 10+xRes, 20+5*(yRes/2), xRes, yRes);//
		    this.setBouton(b9, 15+2*xRes, 20+5*(yRes/2), xRes, yRes);//
		    
		    this.setBouton(b01, 20+3*xRes, 10+yRes/2, xRes/2, yRes/2);//
		    this.setBouton(b02, 20+3*xRes, 15+2*(yRes/2), xRes/2, yRes/2);//
		    this.setBouton(b03, 20+3*xRes, 20+3*(yRes/2), xRes/2, yRes/2);//
		    this.setBouton(b04, 20+3*xRes, 25+4*(yRes/2), xRes/2, yRes/2);//
		    this.setBouton(b05, 20+3*xRes, 30+5*(yRes/2), xRes/2, yRes/2);//
		    this.setBouton(b07, 20+3*xRes, 35+6*(yRes/2), xRes/2, yRes/2);//
		    this.setBouton(b08, 5, 25+7*(yRes/2), xRes, yRes);//
		    this.setBouton(b06, 5, 5, this.getWidth()-10, yRes/2);//
		}
	}
	
	private void setBouton(JButton bouton, int x, int y, int w, int h)
	{
		bouton.setBounds(x, y, w, h);
	}
	

}