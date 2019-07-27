package com.swing;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.JPanel;

public class MyGraphics extends JFrame{

	public MyGraphics() {
		
	  add(new grahics());
	 
	  
	
	}
	
	
	public static void main(String[] args) {
		MyGraphics frame=new MyGraphics();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(true);
	}
	
	
	 class grahics extends JPanel{
		
		@Override
		public void paint(Graphics g) {
          		
		g.drawString("hii", 100, 100);
		
			
		}
		
	}
}
