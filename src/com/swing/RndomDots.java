package com.swing;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;



public class RndomDots extends JFrame implements Runnable{
	int x=0;
	int y=0;
	int w=0;
	int h=0;
	Random random=new Random();
	RndomDots(){
		
		setSize(1300, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		
		repaint();
		new Thread(this).start();
		
	}
		
	public static void main(String[] args) {
		new RndomDots();
	}

	@Override
	public void run() {
		for(;;){
			x=random.nextInt(1300);;
			y=random.nextInt(1000);
			w=h=5;
			repaint();
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	@Override
	public void paint(Graphics g) {
		
		g.fillOval(x+10, y+10, w+10, h+10);
	}
	
	
}	
		
