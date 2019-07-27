package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.swing.StudentResult1;


public class StudentDAO {
	
	static Connection con=null;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","roshan","2310r231");
		return con;
	}
	
	
}
