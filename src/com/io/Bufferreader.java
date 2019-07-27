package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*char a;
		do{
			a=(char) br.read();
			System.out.println(a);
		}while(a!='v');*/
		
		String s[]=new String[3];
		for (int i = 0; i < 3; i++) {
			s[i]=br.readLine();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(s[i]);
		}
		
		
		
	}
}
