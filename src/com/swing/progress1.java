package com.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;

import java.awt.BorderLayout;

public class progress1 extends JFrame  {

	
	int cnt=0;
	JProgressBar progressBar = new JProgressBar();
	JButton Start = new JButton("Start");
	Thread t;
	public progress1() {
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		progressBar.setStringPainted(true);

		Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t=new Thread(new thread());
				t.start();
			}			
		});
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(Start, BorderLayout.SOUTH);
		getContentPane().add(progressBar, BorderLayout.CENTER);
		
		
	}
	
	private class thread implements Runnable{
		@Override
		public void run() {
			
			for (;;) {
				cnt++;
				progressBar.setValue(cnt);
				progressBar.getPercentComplete();
				if (progressBar.getValue()==100) {
					JOptionPane.showMessageDialog(progressBar,"Task Completed");
					System.exit(0);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		
	}
	
	

	public static void main(String[] args) {
		new progress1();
	}



}
