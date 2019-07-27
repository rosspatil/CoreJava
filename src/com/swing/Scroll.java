package com.swing;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Scroll extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public Scroll() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4, BorderLayout.CENTER);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1, BorderLayout.SOUTH);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
	}

	
}
