package com.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBag extends JFrame {

	GridBagConstraints cons=new GridBagConstraints();
	JButton btn1=new JButton("one");
	JButton btn2=new JButton("two");
	JButton btn3=new JButton("three");
	JButton btn4=new JButton("four");
	JButton btn5=new JButton("five");
	JButton btn6=new JButton("six");
	public GridBag() {
		setSize(500, 400);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		cons.gridx = 0; cons.gridy = 0;
		cons.gridwidth = 1; cons.gridheight = 2;
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = 1; cons.weighty = 2;
		add(btn1,cons);
		
		cons.gridx = 1; cons.gridy = 0;
		cons.gridwidth = 1; cons.gridheight = 2;
		cons.fill = GridBagConstraints.VERTICAL;
		cons.anchor = GridBagConstraints.EAST;
		cons.weightx = 1; cons.weighty = 2;
		add(btn2,cons);
		
		cons.gridx = 2; cons.gridy = 0;
		cons.gridwidth = 2; cons.gridheight = 2;
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.anchor = GridBagConstraints.NORTH;
		cons.weightx = 2; cons.weighty = 2;
		add(btn3,cons);
		
		cons.gridx = 0; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = cons.weighty = 1;
		add(btn4,cons);
		
		cons.gridx = 1; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.SOUTHWEST;
		cons.weightx = cons.weighty = 1;
		add(btn5,cons);
		
		cons.gridx = 2; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = 2; cons.weighty = 1;
		add(btn6,cons);
	}
	
	
	public static void main(String[] args) {
		new GridBag();
	}
}
