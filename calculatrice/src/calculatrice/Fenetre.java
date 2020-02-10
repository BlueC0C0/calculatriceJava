package calculatrice;


import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
	
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
	
	private double op1 = 0;
	private double op2 = 0;
	private double resultat;
	private String operateur = "@";
	private boolean virg = false;
	private boolean res = false;
	
	
	
	
	
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
	    b0.addActionListener(this);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b5.addActionListener(this);
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    b8.addActionListener(this);
	    b9.addActionListener(this);
	    b01.addActionListener(this);
	    b02.addActionListener(this);
	    b03.addActionListener(this);
	    b04.addActionListener(this);
	    b05.addActionListener(this);
	    b06.addActionListener(this);
	    b07.addActionListener(this);
	    b08.addActionListener(this);
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
			xRes = this.getWidth()-5*6-10;
			xRes/=3.5;
			yRes = this.getHeight()-5*7-30;
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
		    this.setBouton(b06, 5, 5, this.getWidth()-25, yRes/2);//
		    this.setContent();
		}
	}
	
	private void setBouton(JButton bouton, int x, int y, int w, int h)
	{
		bouton.setBounds(x, y, w, h);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		int val = -1;
		this.res= false;
		if(arg.getSource()== b0)
			val = 0;
		if(arg.getSource()== b1)
			val = 1;
		if(arg.getSource()== b2)
			val = 2;
		if(arg.getSource()== b3)
			val = 3;
		if(arg.getSource()== b4)
			val = 4;
		if(arg.getSource()== b5)
			val = 5;
		if(arg.getSource()== b6)
			val = 6;
		if(arg.getSource()== b7)
			val = 7;
		if(arg.getSource()== b8)
			val = 8;
		if(arg.getSource()== b9)
			val = 9;
		
		if(val != -1)
		{
			if(this.operateur != "@")
			{
				this.op2 = this.op2*10 + val;
				System.out.println(this.op2);
			}
			else
			{
				this.op1 = this.op1*10 + val;
			}
		}
		else
		{
			if(arg.getSource() == b01)
				this.operateur = "+";
			if(arg.getSource() == b02)
				this.operateur = "-";
			if(arg.getSource() == b03)
				this.operateur = "/";
			if(arg.getSource() == b04)
				this.operateur = "*";
		}
		
		if(arg.getSource() == b07)
		{
			if(this.operateur == "+")
				this.resultat = this.op1 + this.op2;
			if(this.operateur == "-")
				this.resultat = this.op1 - this.op2;
			if(this.operateur == "/")
				this.resultat = this.op1 / this.op2;
			if(this.operateur == "*")
				this.resultat = this.op1 * this.op2;
			this.res = true;
			
			this.operateur = "@";
			this.op1 = 0;
			this.op2 = 0;
		}
		
		if(arg.getSource() == b05)
		{
			this.op1 = 0;
			this.op2 = 0;
			this.operateur = "@";
			this.resultat = 0;
			b06.setText("");
		}
		
		
		
	}
	
	private void setContent()
	{
		
		if(this.operateur == "@" && !this.res)
		{
			if(this.op1 == 0)
				b06.setText("");
			else
				b06.setText("" + this.op1);
		}
		else if(!this.res)
		{
			if(this.op2 == 0)
				b06.setText("" + this.op1 +" "+ this.operateur);
			else
				b06.setText("" + this.op1 +" "+ this.operateur +" "+ this.op2);
		}
		
		if(this.res)
		{
			b06.setText("" + this.resultat);
		}
	}
}