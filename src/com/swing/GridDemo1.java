package com.swing;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.database.StudentDAO;

public class GridDemo1 extends JFrame{
	
	

	GridBagLayout grid=new GridBagLayout();
	GridBagConstraints gc=new GridBagConstraints(); 
	void insert(String str,GridBagConstraints g){
		JTextField text=new JTextField(str);
		text.setFont(new Font("times new roman", Font.BOLD, 20));
		text.setEditable(true);
		grid.setConstraints(text, g);
		add(text);		
	}
	
	GridDemo1() throws SQLException{
		pack();
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(grid);
		gc.anchor=GridBagConstraints.NORTH;
		
		Statement st=StudentDAO.getConnection().createStatement();
		
		ResultSet rs=st.executeQuery("select  * from student;" );
		while(rs.next()){
		  gc.gridwidth=1;
		  gc.gridheight=1;
		 
		  gc.fill=GridBagConstraints.BOTH;
		  gc.weightx=1.0;
	//	  gc.weighty=1.0;
		  gc.ipadx=250;
		  insert(rs.getString("name"), gc);
		  gc.gridwidth=GridBagConstraints.REMAINDER;
		  byte[] by=rs.getBytes("roll");
		  String s=new String(by);
		  insert(s, gc);
		}
		
		
	}
	public static void main(String[] args) throws SQLException {
		new GridDemo1();
	}
}
