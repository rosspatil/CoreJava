package com.swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

public class StudentResult extends JFrame {


	JTextField name=new JTextField();
	JTextField fathnm=new JTextField();
	JTextField mothnm=new JTextField();
	JTextField dob=new JTextField();
	JTextField roll=new JTextField();


	JButton submit=new JButton("Submit");
	JButton reset=new JButton("Reset");
	JButton add=new JButton("Add");

	JLabel sublb=new JLabel("Subjects:");
	JComboBox<String> jcb=new JComboBox<String>(new String[] {"Select","TOC","DCWN","DMSA","CFCA","OSD"});

	JLabel marklb=new JLabel("Marks:");
	JTextField mark=new JTextField();




	StudentResult(String title) {

		JLabel mymsz=new JLabel("Welcome to Result Portal");
		mymsz.setFont(new Font("Times Roman",Font.BOLD+Font.ITALIC,40));
		add(mymsz,BorderLayout.NORTH);


		JLabel namelb=new JLabel("Name:");
		JLabel fathlb=new JLabel("Father's name:");
		JLabel mothlb=new JLabel("Mother's name:");
		JLabel doblb=new JLabel("Birth date:");
		JLabel rolllb=new JLabel("roll no:");	

		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)  {
				if((e.getKeyCode()>=KeyEvent.VK_A && e.getKeyCode()<=KeyEvent.VK_Z) || (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) ||(e.getKeyCode()==KeyEvent.VK_SPACE) ||(e.getKeyCode()==KeyEvent.VK_SHIFT)||(e.getKeyCode()==KeyEvent.VK_CAPS_LOCK)){
					name.setEditable(true);
				}else{
					JOptionPane op=new JOptionPane();
					op.showMessageDialog(name, "Inavlid input");
				}
			}
		});

		JPanel info=new JPanel(new GridLayout(5,2));
		JPanel marks=new JPanel(new GridLayout(2, 2));
		JPanel btns=new JPanel();
		JPanel full=new JPanel(new BorderLayout());


		info.add(namelb);
		info.add(name);
		info.add(fathlb);
		info.add(fathnm);
		info.add(mothlb);
		info.add(mothnm);
		info.add(doblb);
		info.add(dob);
		info.add(rolllb);
		info.add(roll);
		info.setPreferredSize(new Dimension(500, 180));
		info.setBorder(new TitledBorder("Student info"));
		full.add(info,BorderLayout.NORTH);

		marks.add(sublb);
		marks.add(jcb);	
		marks.add(marklb);
		marks.add(mark);
		marks.setBorder(new TitledBorder("Marks Detail"));
		marks.setPreferredSize(new Dimension(500, 80));
		full.add(marks,BorderLayout.CENTER);

		btns.add(add);
		//btns.add(submit);
		btns.add(reset);		
		full.add(btns,BorderLayout.SOUTH);
		full.setPreferredSize(new Dimension(500,300));

		add(full,BorderLayout.CENTER);

		JLabel mymsz1=new JLabel("******Please fill right details");
		add(mymsz1,BorderLayout.SOUTH);		


		//submit.addActionListener(new MyAction());
		//	jcb.addActionListener(new MyAction());
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StudentResult1.insert(new StudentResult1(name.getText(), roll.getText()));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			
			}

		});


		//	reset.addActionListener(new MyAction());




	}	
	public static void main(String[] args) {

		StudentResult frame=new StudentResult("Result portal");
		frame.pack();
		frame.setResizable(false);
		frame.setBackground(Color.pink);;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(700, 400);

	}


}


