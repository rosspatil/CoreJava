package com.swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;

public class LoginForm1 extends JFrame {
	
	

	private JPanel loginInfo,btns,userinfo;
	private JLabel usrnmLable,pswdLable,nameLabel,emailLabel,mobileLabel,commentLable;
	private JTextField usrnmTxt,name,email,mobile,comment; 
	private JPasswordField pswdTxt;
	private JButton submit,reset;
	int cnt=0;
	public LoginForm1(String title) {
		super(title);
		
		message m=new message();
		
		
		loginInfo=new JPanel();
		btns=new JPanel();
		userinfo=new JPanel(new FlowLayout());
		userinfo.setForeground(Color.LIGHT_GRAY);
		
		
		usrnmLable=new JLabel("Username:", 10);
		usrnmTxt=new JTextField(30);
		
		pswdLable=new JLabel("Password:");
		pswdTxt=new JPasswordField(30);
		
		nameLabel=new JLabel("Name:");
		name=new JTextField(30);
		
		emailLabel =new JLabel("Email:");
		email=new JTextField(30);
		
		mobileLabel=new JLabel("Mobile:");
		mobile=new JTextField(30);
		
		commentLable=new JLabel("Comment:");
		comment=new JTextField();
		comment.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
        comment.setSize(10, 10);		
		submit=new JButton("Submit");
		submit.setToolTipText("submit");
		reset=new JButton("Reset");
		reset.setToolTipText("Reset");
		
		
		
		
		
		add(loginInfo,BorderLayout.NORTH);
		loginInfo.add(m);
		loginInfo.setLayout(new GridLayout(3, 2, 0, 0));
		loginInfo.setBorder(new TitledBorder("Login Info"));
		loginInfo.add(usrnmLable);
		loginInfo.add(usrnmTxt);
		loginInfo.add(pswdLable);
		loginInfo.add(pswdTxt);
		
		add(userinfo,BorderLayout.BEFORE_LINE_BEGINS);
		userinfo.setLayout(new GridLayout(4,2));
		
		userinfo.setBorder(new TitledBorder("PersonalInfo"));		
		userinfo.add(nameLabel);
		userinfo.add(name);
		userinfo.add(emailLabel);
		userinfo.add(email);
		userinfo.add(mobileLabel);
		userinfo.add(mobile);
		userinfo.add(commentLable);
		userinfo.add(comment);
		comment.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			    switch(e.getKeyCode()){
			    
			    case KeyEvent.VK_BACK_SPACE:
			    	cnt--;
			    	
			    default: {
					
					cnt++;
					if(cnt>30){
						System.out.println("limit over");
						String s=comment.getText();
						comment.setText(s+"\n");
						cnt=0;
					}
					
					break;
					}


				
			    }
				
			}
		});
		
		
		add(btns,BorderLayout.SOUTH);
		btns.add(submit);
		btns.add(reset);
		
		
		submit.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ENTER:{ System.out.println("Submit is clicked...");
				cnt=0;
				}
				
				}
				
			}
		});
		
		

		reset.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int cnt=0;
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ENTER:{ System.out.println("Reset is clicked...");
				String reset="";
				usrnmTxt.setText(reset);
				pswdTxt.setText(reset); 
				name.setText(reset);
				email.setText(reset);
				mobile.setText(reset);
				comment.setText(reset);
				cnt=0;
				}
				
				}
				
			}
		});
		
        submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit is clicked");
				cnt=0;
			}
		});
		
		reset.addActionListener(new ActionListener() {
			String reset="";
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("rest is clicked");
				usrnmTxt.setText(reset);
				pswdTxt.setText(reset);
				name.setText(reset);
				email.setText(reset);
				mobile.setText(reset);
				comment.setText(reset);
				cnt=0;
			}
		});
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		JFrame frame=new LoginForm1("MyLogin");
        frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		
		
	}
	
	
	private class message extends JPanel {
		@Override
		public void paintAll(Graphics g) {
			super.paintAll(g);
			g.drawString("roshan",10,40);
		}
	}
	
	
	
	
}
