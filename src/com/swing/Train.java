package com.swing;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Train extends Applet {

	int x=100;
	int x1=340;
	int x3=150;
	@Override
	public void init() {
		setSize(1000, 600);
		setVisible(true);


		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Thread t=new Thread(new Running());
				t.start();
			};		
		});		
	}


	@Override
	public void paint(Graphics g) {
		g.drawRect(x,100, 300, 200);
		g.drawRect(x3, 150, 100, 50);		
		g.drawRect(x1,70, 20, 30);

	}


	class Running implements Runnable{
		@Override
		public void run() {
			for(;;){
				x+=10;
				x1+=10;
				x3+=10;
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}
}
