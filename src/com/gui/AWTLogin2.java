package com.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;


public class AWTLogin2 extends Frame{
	
	Label un,up,username,paswd;
	TextField tu,tp;
	Button b1,b2;
	Panel p1,p2,p3;
	Checkbox c;
	
	public AWTLogin2() {
		super();
		MyFrame();
	}
	

	public void MyFrame() {
		
		
		
		
		
		setBackground(Color.LIGHT_GRAY);
		setSize(400, 400);
		setVisible(true);
		setResizable(true);
		p1=new Panel(new FlowLayout());
		p2=new Panel(new GridLayout(2,2));
		p3=new Panel(new GridLayout(1, 1));
		Myaction myaction=new Myaction();
		
		c=new Checkbox("check",true);
		
		un=new Label("username:");
		tu=new TextField(20);
		
		up=new Label("password:");
		tp=new TextField(20);
		
		b1=new Button("ok");
		b2=new Button("cancel");
		
		username=new Label("Username");
        paswd=new Label("Password");
        	
		
		p2.add(un);  p2.add(tu);
		p2.add(up);  p2.add(tp);
		p1.add(b1);  p1.add(b2); p1.add(c);
		p3.add(username);  p3.add(paswd);
		
		
		
		
		add(p2,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
 
        
        b1.addActionListener(myaction);
        b2.addActionListener(myaction);
        tu.addActionListener(myaction);
        tp.addActionListener(myaction);
         
        
        addWindowListener(new WindowAdapter() {
        	@Override
    		public void windowClosing(WindowEvent e) {
    		System.out.println("Closing window........");
    		System.exit(0);
    		}
        	
        	
		});
  
		
	}
	
	public static void main(String[] args) {

		
		new AWTLogin2();
		
	}
	
	private class Myaction  implements ActionListener{

		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o=e.getSource();
           
		
				
			
			
			if(o==b1) {
				System.out.println("ok clicked........");
		        String uname=tu.getText();
				String pswd=tp.getText();
				System.out.println(uname);
				System.out.println(pswd);
				username.setText(uname);
				paswd.setText(pswd);
				
			}
			if(o==b2) {
				System.out.println("Cancel clicked.....");
			}
			
		}

		
				
	}
	
}
