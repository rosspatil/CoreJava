package com.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConnectionFactory {

	private ConnectionFactory() throws IOException {
		FileInputStream fin=new FileInputStream("D:\\SEED_JAVASOFT\\JSE_workspace\\Core_JAVA-1.7\\src\\com\\database\\jdbc.properties");
		Properties pro=new Properties();
		pro.load(fin);
		String driver=pro.getProperty("jdbc.driver");
		System.out.println(driver);
		System.out.println("Driver: "+pro.getProperty("jdbc.driver"));
		System.out.println("URL: "+pro.getProperty("jdbc.url"));
		System.out.println("User: "+pro.getProperty("jdbc.user"));
		System.out.println("pswd: "+pro.getProperty("jdbc.pswd"));
	}

	public static void main(String[] args) {
		try {
			new ConnectionFactory();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
