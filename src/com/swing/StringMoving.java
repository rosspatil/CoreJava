package com.swing;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class StringMoving extends Applet {

	int x1=100;
	int x2=100;
	int x4=200;
	int x6=300;
	int x8=400;
	int flag=0;
	@Override
	public void init() {
		setSize(1000, 600);
		setVisible(true);


		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Thread t=new Thread(new Running1());

				t.start();
			};		
		});		
	}



	@Override
	public void paint(Graphics g) {
		//		g.drawRect(x,100, 300, 200);
		//		g.drawRect(x3, 150, 100, 50);		
		//		g.drawRect(x1,70, 20, 30);
		if(flag==0){

			g.setColor(Color.RED);
			g.fillOval(x1, x2, 60,60);
			g.setColor(Color.green);
			g.fillOval(x1, x4, 60,60);

			g.setColor(Color.RED);
			g.fillOval(x1, x6, 60,60);
			g.setColor(Color.green);
			g.fillOval(x1, x8, 60,60);
		}else{
			g.setColor(Color.blue);
			g.fillOval(x1, x2, 60,60);
			g.setColor(Color.yellow);
			g.fillOval(x1, x4, 60,60);

			g.setColor(Color.blue);
			g.fillOval(x1, x6, 60,60);
			g.setColor(Color.yellow);
			g.fillOval(x1, x8, 60,60);
			
		}

	}


	class Running1 implements Runnable{
		@Override
		public void run() {
			for(;;){

				if(x1==800){
					flag=1;
				}else if(x1==100){
					flag=0;
				}
				if(flag==0){
					x1+=5;
				}else{
					x1-=5;
				}
				repaint();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}


}
