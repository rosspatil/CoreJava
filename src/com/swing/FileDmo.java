package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JSpinner;

public class FileDmo extends JFrame{
	
	JFileChooser file=new JFileChooser("C:\\");

	JSpinner spin=new JSpinner();
	FileDmo(){
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		file.setMultiSelectionEnabled(false);
		file.setControlButtonsAreShown(false);
//		add(file);
		add(spin);
		file.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				File f=file.getSelectedFile();
			}
		});
	}
	public static void main(String[] args) {
		new FileDmo();
	}

}
