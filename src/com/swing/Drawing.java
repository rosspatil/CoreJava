package com.swing;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Drawing extends JFrame{
	
	Drawing(){
		
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(new Mydraw());
	}
		
	public static void main(String[] args) {
		new Drawing();
	}
	
	private class Mydraw extends JPanel {
		
		int x=0,y=0;

		Mydraw(){
			addMouseMotionListener(new MouseMotionAdapter() {
							
				
				
				@Override
				public void mouseDragged(MouseEvent e) {
					x=e.getX();
					y=e.getY();
					repaint();
					
				}
			});
		}
	
		@Override
		public void paint(Graphics g) {
			g.fillOval(x, y, 10, 10);
		}
	}

}
