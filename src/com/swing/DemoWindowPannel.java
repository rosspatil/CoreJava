package com.swing;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JWindow;

public class DemoWindowPannel extends JFrame {

	
	JWindow win=new JWindow();
	Canvas c=new Canvas();
	
	DemoWindowPannel(){
		setSize(100, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setBackground(Color.red);
		add(c);
		
	}
}
