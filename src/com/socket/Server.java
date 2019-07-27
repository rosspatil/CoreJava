package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	static ServerSocket s = null;
	static Socket c = null;

	public void msz() throws IOException {
		System.out.println(c.getLocalPort());
		// OutputStream out=c.getOutputStream();

		// DataOutputStream os=new DataOutputStream(out);
		// os.writeUTF("Hiiiiii");
		System.out.println("Client join:" + c.getInetAddress() + " prot: " + c.getPort());

		
		while (true) {
			InputStream in = c.getInputStream();
			DataInputStream din = new DataInputStream(in);
			if (din != null) {
				
				System.out.println(c.getInetAddress());
				int read=0;
				while((read=din.read())!=-1){
					System.out.print((char) read);
				}
			}
		}
		// if (msz.equalsIgnoreCase("exit")) {
		// s.close();
		// }
		// // out.close();
	}

	@Override
	public void run() {
		try {
			msz();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			s = new ServerSocket(80);
			while (true) {
				c = s.accept();
				Thread thread = new Thread(new Server());
				thread.start();
			}
		} catch (Exception e) {
			try {
				s.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
