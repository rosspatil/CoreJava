package com.io;

import java.io.File;

public class ListDirectoryRecursive {
	
	public static void main(String[] args) {
		
		File dir=new File("E:\\");
	    listrecursive(dir);	
	}

	static void listrecursive(File dir){
		if(dir.isDirectory()) {
			File[] files=dir.listFiles();
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
				 if(file.isDirectory()){
					 listrecursive(file);
				 }				 
			}
		}
		else {
		System.out.println(dir);
		}
	}
}
