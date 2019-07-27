package com.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DemoMenu extends JFrame {
	JMenuItem save=new JMenuItem("save");
	JMenuItem cut=new JMenuItem("Save");
	JButton btn=new JButton("ok");
	
   MenuItem m1=new MenuItem("hello");
	DemoMenu() {
		 
		super();
		JMenuBar m=new JMenuBar();
		setJMenuBar(m);
		JMenu file=new JMenu("file");
		JMenu edit=new JMenu("Edit");
		
		m.add(file);
		m.add(edit);
		
		
		file.add(save);
		edit.add(cut);
		
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentResultDatabase s=new StudentResultDatabase("mysql");				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		DemoMenu frame=new DemoMenu();
		frame.pack();
		frame.setResizable(false);
		frame.setBackground(Color.pink);;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(700, 400);
	}
}
