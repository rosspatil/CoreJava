package com.swing;

import java.awt.*;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Imagedemo extends JFrame {
	
	Label namelb=new Label("Name");
	TextField name=new TextField();
	
	
	Imagedemo(){
		setSize(100, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Imagedemo();
	}
	
}