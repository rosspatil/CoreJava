package com.swing;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class LoginForm extends JFrame {
	
	

	private JPanel loginInfo,btns,userifno;
	private JLabel usrnmLable,pswdLable,nameLabel,emailLabel,mobileLabel,commentLable;
	private JTextField usrnmTxt,name,email,mobile;
	private JTextArea comment;
	private JPasswordField pswdTxt;
	private JButton submit,reset;
	
	public LoginForm(String title) {
		super(title);
		
		loginInfo=new JPanel();
		btns=new JPanel();
		userifno=new JPanel();
		
		usrnmLable=new JLabel("Username:");
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
		comment=new JTextArea(3, 2);
		
		
		submit=new JButton("Submit");
		reset=new JButton("Reset");
		add(loginInfo,BorderLayout.NORTH);
		loginInfo.setLayout(new GridLayout(2, 2));
		loginInfo.setBorder(new TitledBorder("Login Info"));
		loginInfo.add(usrnmLable);
		loginInfo.add(usrnmTxt);
		loginInfo.add(pswdLable);
		loginInfo.add(pswdTxt);
		
		add(userifno,BorderLayout.CENTER);
		userifno.setLayout(new GridLayout(4,2));
		userifno.setBorder(new TitledBorder("PersonalInfo"));
		userifno.add(nameLabel);
		userifno.add(name);
		userifno.add(emailLabel);
		userifno.add(email);
		userifno.add(mobileLabel);
		userifno.add(mobile);
		userifno.add(commentLable);
		userifno.add(comment);
		
		
		
		add(btns,BorderLayout.SOUTH);
		btns.add(submit);
		btns.add(reset);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		JFrame frame=new LoginForm("MyLogin");
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
	}
	
}
