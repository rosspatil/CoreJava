package com.database;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.jdbc.DatabaseMetaData;

public class StoredFunction {
	
	public static void main(String[] args) throws SQLException {
		
		CallableStatement st=StudentDAO.getConnection().prepareCall("{?=call fun(?) }");
		st.setString(2, "roshan");
		st.registerOutParameter(1, java.sql.Types.INTEGER);
		st.execute();
		System.out.println(st.getInt(1));
		
		
		CallableStatement st1=StudentDAO.getConnection().prepareCall("{call pro(?,?)}");
		st1.setString(1, "jagruti");
		st1.registerOutParameter(2, Types.INTEGER);
		st1.execute();
		int rno=st1.getInt(2);
		System.out.println(rno);
		
		
		java.sql.DatabaseMetaData db=StudentDAO.getConnection().getMetaData();
		System.out.println(db.getDriverName());
		
		
		
	
		
	}

}
