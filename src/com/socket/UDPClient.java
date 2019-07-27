package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {
	
	public static void main(String args[]){
		
		DatagramSocket aSocket = null;
//		Scanner sc=new Scanner(System.in);
		try {
		aSocket = new DatagramSocket();
		byte[] msz=new byte[1000];
		String hi="I am connected with you......";
		msz=hi.getBytes();
		int len=msz.length;
		
		String aHostname="localhost";
		InetAddress aHost = InetAddress.getByName(aHostname);
		int port=1234;
		DatagramPacket request =	new DatagramPacket(msz, len, aHost, port);
		aSocket.send(request);
		
		
		
		byte[] buffer = new byte[1000];
		DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
		aSocket.receive(reply);
		System.out.println("Reply: "+ new String(reply.getData()));
		}
		catch (SocketException e) {
		System.out.println("Socket: " + e.getMessage());
		e.getStackTrace();
		}
		catch (IOException e) {
		System.out.println("IO: "+ e.getMessage());
		e.getStackTrace();
		}
		finally {
		if (aSocket != null)
		aSocket.close();
		}
		}

}
