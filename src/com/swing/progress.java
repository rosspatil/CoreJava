package com.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;

public class progress extends JFrame  {


	int cnt=0;
	JProgressBar progressBar = new JProgressBar();
	JButton Start = new JButton("Start");
	JButton Stop = new JButton("Stop");
	Timer t;
	public progress() {
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		progressBar.setStringPainted(true);

		t=new Timer(100, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				progressBar.setValue(cnt);
				progressBar.getPercentComplete();
				if (progressBar.getValue()==100) {
					JOptionPane.showMessageDialog(progressBar,"Task Completed");
					System.exit(0);
				}
			}

		});

		Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.start();
			}

		});
		Stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.stop();
			int opt=JOptionPane.showConfirmDialog(progressBar, "Do you want to stop it?","Alert",JOptionPane.YES_NO_OPTION);
				if(opt==JOptionPane.YES_OPTION){
					t.stop();
				}
				if (opt==JOptionPane.NO_OPTION) {
					t.restart();					
				}
			}

		});
		getContentPane().add(progressBar);
		getContentPane().add(Start);
		getContentPane().add(Stop);
	}


	public static void main(String[] args) {
		new progress();
	}



}
