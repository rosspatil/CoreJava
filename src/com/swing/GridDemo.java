package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.*;
import java.applet.Applet;

	 public class GridDemo extends JFrame{
		 
		   JScrollBar scroll=new JScrollBar();
		   Container c=new Container();
		   GridBagLayout grid=new GridBagLayout();
		   GridBagConstraints gc=new GridBagConstraints();
		   JScrollPane s=new JScrollPane(c);
		   GridBagConstraints gc1=new GridBagConstraints();
		   JPanel p1=new JPanel();
		   JPanel p2=new JPanel();
		   
		   
		   void insert(String name, GridBagConstraints g){
			   JTextField button=new JTextField(name);
			      
				 grid.setConstraints(button, g);		  
				 add(button);
				// add(c,BorderLayout.CENTER);
				  
			   
		   }
		   
	   GridDemo(){
		   
		   setSize(400, 300);
		   setVisible(true);
//		   setResizable(false);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   setLocationRelativeTo(null);
		   //setLayout(new BorderLayout());
		   c.setSize(300, 200);
		   setLayout(grid);
//		   int i=1;
//		   scroll.setOrientation(JScrollBar.VERTICAL);
//		   scroll.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//		   scroll.setUnitIncrement(10);
//		  
//		   s.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//		   add(s,BorderLayout.SOUTH);
		  
			      gc.anchor=GridBagConstraints.NORTH;
				  gc.gridwidth=1;
				  gc.gridheight=1;
				  gc.fill=GridBagConstraints.BOTH;
				  gc.weightx=1.0;
				  insert("roshan", gc);
				  gc.gridwidth=GridBagConstraints.REMAINDER;
				  insert("roshan", gc);
			    
		   
		   
		 
		   
		   
		  
		  
		  
		  
//		  gc.gridwidth=1;
//		  gc.gridheight=1;
//		  gc.weightx=1.0;
//		  grid.setConstraints(t3, gc);
//		  add(t3);
//		  gc.gridwidth=GridBagConstraints.REMAINDER;
//		  grid.setConstraints(t4,gc);
//		  add(t4);
//		  gc.gridwidth=1;
//		  gc.gridheight=1;
//		  gc.weightx=1.0;
//		  grid.setConstraints(t5, gc);
//		  add(t5);		 
//		  gc.gridwidth=GridBagConstraints.REMAINDER;
//		  grid.setConstraints(t6, gc);
//		  add(t6);
		  
		  
		  
		   
		   
		   
	   }
	   public static void main(String[] args) {
		new GridDemo();
	}
		 
	 }
		
	
	


