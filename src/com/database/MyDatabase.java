package com.database;

import java.sql.*;

public class MyDatabase {
	String name="lokesh";
	int roll=2;
	
	MyDatabase() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/roshan","roshan","hibuddy");
			
			PreparedStatement st=c.prepareStatement("insert into student values ( name, last name)");
			
			st.setString(1, name);
			st.setInt(2, roll);
//			String sql="insert into student(name,roll) values("+" '"+name+"','"+ roll+"');";
			st.executeUpdate();
			/*ResultSet rs;
			rs=st.executeQuery("select * from student;");
			while(rs.next()){
				if(rs.getString("name").equals("roshan") && rs.getInt("roll")==1){
					System.out.println("User exist");
				}
			}*/
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		new MyDatabase();
		
	}

}
