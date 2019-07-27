package com.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Copy  extends JFrame{


	JFileChooser fs=new JFileChooser("D://");
	JLabel head=new JLabel("File Copy");
	JCheckBox src=new JCheckBox("Click for source file");
	JCheckBox dst=new JCheckBox("Click for Destination");
	JTextField srclb=new JTextField();
	JTextField dstlb=new JTextField();
	JPanel p1=new JPanel(new GridLayout(2, 2));
	JButton copy=new JButton("Copy");
	JButton cancel=new JButton("Cancel");
	JPanel btn=new JPanel();
	Copy(){
		setSize(400, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		head.setFont(new Font("Times New Roman", Font.BOLD, 35));
		add(head,BorderLayout.NORTH);
		p1.add(src);
		p1.add(srclb);
		p1.add(dst);
		p1.add(dstlb);
		add(p1,BorderLayout.CENTER);
		srclb.setEditable(false);
		dstlb.setEditable(false);
		btn.add(copy);
		btn.add(cancel);
		add(btn,BorderLayout.SOUTH);

		src.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fs.setControlButtonsAreShown(false);
				fs.showOpenDialog(null);
				String srcadd=fs.getSelectedFile().getAbsolutePath();
				srclb.setText(srcadd);
			}
		});

		dst.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fs.setControlButtonsAreShown(true);
				fs.showSaveDialog(null);
				String dstadd=fs.getSelectedFile().getAbsolutePath();
				dstlb.setText(dstadd);
			}
		});

		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//				if(!(dstlb.getText().equals("")) && !(srclb.getText().equals(""))){
				File file1=new File(srclb.getText());
				File file2=new File("D://mszs.mp4");
				try(FileInputStream fin=new FileInputStream(file1); FileWriter fout=new FileWriter(file2)){
					DataInputStream din=new DataInputStream(fin);
					while((din.read())!=-1){
						fout.write(fin.read());
						System.out.print((char)din.read());
					}
					din.close();
					fout.flush();
					fout.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				//	}
			}
		});

		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);	
			}
		});


	}
	public static void main(String[] args) {
		new Copy();
	}

}
