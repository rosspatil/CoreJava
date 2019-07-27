package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	static Connection con;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection(){
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/image","roshan","2310r231");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
