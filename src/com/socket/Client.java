package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("localhost",1234);
		String msz=null;
		InputStream in=s.getInputStream();
		DataInputStream din=new DataInputStream(in);

		String str=new String(din.readUTF());
		System.out.println(str);

		
		while (true) {
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			System.out.println("Enter message for server: ");
			 msz=sc.next();
			
			dos.writeUTF(msz);	
		}
		
		

//		din.close();
//		s.close();
//		in.close();
	}
}
