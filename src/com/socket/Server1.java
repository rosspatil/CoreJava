package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 extends Thread{
	static ServerSocket s=null;
	static Socket c=null;

	public void input() throws IOException{
		System.out.println(c.getLocalPort());
		OutputStream out=c.getOutputStream();

		DataOutputStream os=new DataOutputStream(out);
		os.writeUTF("Hiiiiii");
		System.out.println("Client join:"+c.getInetAddress()+" prot: "+c.getPort());

		InputStream in=c.getInputStream();
		while(true ){
			if(in!=null){
				DataInputStream din=new DataInputStream(in);

				String msz=din.readUTF();
				System.out.println(msz);
			}
		}
		/*DataInputStream din=new DataInputStream(in);

		String msz=din.readUTF();
		System.out.println(msz);
		if (msz.equalsIgnoreCase("exit")) {
			s.close();
		}*/
		//		out.close();
	}

	@Override
	public void run() {
		try {			
			input();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {

		try {
			s=new ServerSocket(1234);
			while (true) {
				c=s.accept();
				if(c.isInputShutdown()){
					Thread thread=new Thread(new Server1());
					thread.start();
				}

				if(c.isConnected()){
					Thread thread=new Thread(new Server1());
					thread.start();
				}

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
