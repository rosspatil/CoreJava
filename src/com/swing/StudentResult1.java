package com.swing;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Vector;

import com.database.StudentDAO;

public class StudentResult1 implements Serializable {
	
	private String name;
	private String fname;
	private String mname;
	private String dob;
	private String roll;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "StudentResult1 [name=" + name + ", fname=" + fname + ", mname="
				+ mname + ", dob=" + dob + ", roll=" + roll + "]";
	}
	public StudentResult1(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public static void insert(StudentResult1 student) throws SQLException{
		PreparedStatement st=StudentDAO.getConnection().prepareStatement("insert into student (name,roll) values(?,?)");
		
		st.setString(1,student.getName());
		st.setString(2, student.getRoll());
		st.executeUpdate();
		StudentDAO.getConnection().close();
		
	}
	
}
