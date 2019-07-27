package com.swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

public class StudentResultDatabase extends JFrame {
	
	
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
	

	
	
	StudentResultDatabase(String title) {
		
		super(title);
		
		JLabel mymsz=new JLabel("Welcome to Result Portal");
		mymsz.setFont(new Font("Times Roman",Font.BOLD+Font.ITALIC,40));
		add(mymsz,BorderLayout.NORTH);
       
		
		JLabel namelb=new JLabel("Name:");
		JLabel fathlb=new JLabel("Father's name:");
		JLabel mothlb=new JLabel("Mother's name:");
		JLabel doblb=new JLabel("Birth date:");
		JLabel rolllb=new JLabel("roll no:");	
		
			
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
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DemoMenu();
				
			}
		});
		full.add(btns,BorderLayout.SOUTH);
		full.setPreferredSize(new Dimension(500,300));
		
		add(full,BorderLayout.CENTER);
		
		JLabel mymsz1=new JLabel("******Please fill right details");
		add(mymsz1,BorderLayout.SOUTH);		
		
		
		//submit.addActionListener(new MyAction());
		jcb.addActionListener(new MyAction());
		add.addActionListener( new MyAction());
		//reset.addActionListener(new MyAction());
		
		
	
		
	}	
	public static void main(String[] args) {
		
		StudentResultDatabase frame=new StudentResultDatabase("Result portal");
		frame.pack();
		frame.setResizable(false);
		frame.setBackground(Color.pink);;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		
	}
	
	
	private class MyAction implements  ActionListener {
		
		String stname;
		String stfname;
		String stmname;
		String stdob;
		String  stroll;
		String subject[]={"TOC","DCWN","DMSA","CFCA","OSD"};
		int stmark;
		int cnt=0;
		
		void get(){
			stname=name.getText();
			stfname=fathnm.getText();
			stmname=mothnm.getText();
			stdob=dob.getText();
			stroll=roll.getText();
			stmark=Integer.parseInt(mark.getText());
		}
		
		void reset() {
			  cnt=0;
			  name.setText("");
			  fathnm.setText("");
			  mothnm.setText("");
			  dob.setText("");
			  roll.setText("");	
			stname="";
			stfname="";
			stmname="";
			stdob="";
			stroll="";
			stmark=0;
		}
		void subreset() {
			jcb.setSelectedIndex(0);
			stmark=0;
		}
		
		void check(Statement pst){
			if(cnt==1){
				try {
					pst.executeUpdate("insert into student values('"+stroll+"','"+stname+"','"+stfname+"','"+stmname+"','"+stdob+"');");
				} catch (SQLException e) {
					System.out.println("Roll no should not be null");
				}
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/roshan","roshan","2310r231");
				Statement pst=con.createStatement();
				ResultSet rs;
				
				int read=jcb.getSelectedIndex();
				
				switch(read){
						case 1:if(e.getSource()==add){
							cnt++;							
							get();
							check(pst);
							pst.executeUpdate("insert into marks values('"+stroll+"','"+subject[0]+"','"+stmark+"');");
							subreset();
						}
							break;
						case 2:if(e.getSource()==add){
							cnt++;							
							get();
							check(pst);
							pst.executeUpdate("insert into marks values('"+stroll+"','"+subject[1]+"','"+stmark+"');");
							subreset();
						}
							break;
						case 3:if(e.getSource()==add){
							cnt++;
							check(pst);
							get();
							pst.executeUpdate("insert into marks values('"+stroll+"','"+subject[2]+"','"+stmark+"');");
							subreset();
						}
							break;
						case 4:if(e.getSource()==add){
							cnt++;
							check(pst);
							get();
							pst.executeUpdate("insert into marks values('"+stroll+"','"+subject[3]+"','"+stmark+"');");
							subreset();
						}
							break;
						case 5:if(e.getSource()==add){
							cnt++;
							check(pst);
							get();
							pst.executeUpdate("insert into marks values('"+stroll+"','"+subject[4]+"','"+stmark+"');");
							subreset();
						}
							break;				
				}
				
			
				
				if(cnt==5){
					reset();
					pst.close();
				}			
				
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				System.out.println("roll no should not be null");
			}
		}

		
				
	}
}
