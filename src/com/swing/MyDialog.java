package com.swing;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyDialog extends JDialog {
	
	JButton ok=new JButton("Ok");
	JButton cancel=new JButton("Cancel");
	JLabel msz=new JLabel("!Login or Password is incorrect");
	
	
	public MyDialog(){		
		setSize(400, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(msz,BorderLayout.CENTER);
		msz.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JPanel btn=new JPanel();
		btn.add(ok);
		btn.add(cancel);
		add(btn,BorderLayout.SOUTH);
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				toBack();
				
			}
		});
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new MyDialog();
	}

}
