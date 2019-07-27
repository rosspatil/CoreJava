package com.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
;

public class AWTLogin extends Frame implements Runnable{
	
	Label un,up;
	TextField tu,tp;
	Button b1,b2;
	Panel p1,p2,p3;
	
	public AWTLogin() {
		super();
		MyFrame();
		new DateTimeThread().start();
	}
	

	public void MyFrame() {
		
		
		
		
		
		setBackground(Color.LIGHT_GRAY);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
		setLayout(new FlowLayout());
		p1=new Panel(new FlowLayout());
		p2=new Panel(new GridLayout(1,1));
		p3=new Panel(new GridLayout(1, 1));
		
		
		
		
		un=new Label("username:");
		tu=new TextField(20);
		
		up=new Label("password:");
		tp=new TextField(20);
		
		b1=new Button("ok");
		b2=new Button("cancel");
		
		
		
		p2.add(un);  p2.add(tu);
		p3.add(up);  p3.add(tp);
		p1.add(b1);  p1.add(b2);
		
		add(p2,BorderLayout.NORTH);
        add(p3,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);

		
	}
	
	
	class DateTimeThread extends Thread {
		@Override
		public void run() {
			for(;;) {
				try {
					Thread.sleep(1000);
					un.setText(new Date().toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {

		new Thread(new AWTLogin()).start();
		
		
	}


	@Override
	public void run() {
		new AWTLogin();
	}
	
}
