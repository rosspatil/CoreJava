package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServer {

	public static void main(String args[]){
//		Scanner sc=new Scanner(System.in);
		DatagramSocket aSocket = null;
		
		int socket_no=1234;
		System.out.println("socet no"+socket_no);
		try {
			String hi="hiiiiiiii";
			byte[] msz = hi.getBytes();
			int len=msz.length;
			String aHostname="localhost";
//			InetAddress aHost = InetAddress.getByName(aHostname);
//			int port=1234;

			aSocket = new DatagramSocket(socket_no);
			byte[] buffer = new byte[1000];
//			while(true) {
				DatagramPacket request = new DatagramPacket(buffer,buffer.length);
				aSocket.receive(request);
				System.out.println("Msz: "+new String(request.getData()));
				System.out.println("Mszlen: "+request.getLength());
				System.out.println("Inetadd: "+request.getAddress());
				System.out.println("port: "+request.getPort());
//				DatagramPacket reply = new DatagramPacket(request.getData(),request.getLength(),request.getAddress(),	request.getPort());
				DatagramPacket reply=new DatagramPacket(msz, len, request.getAddress(), request.getPort());
				aSocket.send(reply);
//			}
		}
		catch (SocketException e) {
			System.out.println("Socket: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("IO: " + e.getMessage());
		}
		finally {
			if (aSocket != null)
				aSocket.close();
		}
	}
}
