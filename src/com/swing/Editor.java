package com.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import java.io.FileInputStream;

import java.io.FileWriter;

import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class Editor extends JFrame {

	TextArea text=new TextArea();
	Panel btn=new Panel();
	JFileChooser fs=new JFileChooser("C://");
	JMenuBar menubar=new JMenuBar();
	JMenu file=new JMenu("File");
	JMenu edit=new JMenu("Edit");
	JMenuItem save=new JMenuItem("Save as");
	JMenuItem open=new JMenuItem("Open");
	JMenuItem close=new JMenuItem("Close");
	JMenuItem selectall=new JMenuItem("Select all");
	
	Editor(){
		setTitle("Text Editor");
		setSize(400, 200);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		file.add(open);
		file.add(save);		
		file.add(close);
		edit.add(selectall);
		menubar.add(file);
		menubar.add(edit);
		add(menubar,BorderLayout.NORTH);
		add(text,BorderLayout.CENTER);
		text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fs.setFileFilter(new FileTypeFilter("Text File", ".txt"));
		fs.setFileFilter(new FileTypeFilter("Word File", ".doc"));
		fs.setFileFilter(new FileTypeFilter("Word File", ".docx"));
		fs.setFileFilter(new FileTypeFilter("Python", ".py"));
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {													
					try {	
						fs.setDialogTitle("Save as");
						fs.showSaveDialog(null);						
						String txt=text.getText();				
						String file=fs.getSelectedFile().getAbsolutePath();
						FileWriter fout=new FileWriter(new File(file));
						fout.write(txt);
						fout.flush();
						fout.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}				
			}
		});
		open.addActionListener(new ActionListener() {
			
			@SuppressWarnings("resource")
			@Override
			public void actionPerformed(ActionEvent e) {			
				try {
					fs.setDialogTitle("Open");
					fs.showOpenDialog(null);					
					String file=fs.getSelectedFile().getAbsolutePath();
					FileInputStream fin=new FileInputStream(new File(file));
					int read;
					String txt="";
					while((read=fin.read())!=-1){
						txt+=(char)read;						
					}
					text.setText(txt);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		selectall.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.selectAll();
				
			}
		});
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				MyDialog dia=new MyDialog();
				
				
			}
			
			
			
		});
	}


	public static void main(String[] args) {
		new Editor();
	}

}
