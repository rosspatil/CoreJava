import java.io.*;
import java.net.*;

public class Server2 {
	static ServerSocket echoServer=null;
	static Socket clientSocket=null;
	static int numConnections;
	public static void main(String args[]) {
		try {
			echoServer = new ServerSocket(1234);
		}
		catch (IOException e) {
			System.out.println(e);
		}   

		while ( true ) {
			try {
				clientSocket = echoServer.accept();
				numConnections ++;
				Server2Connection oneconnection = new Server2Connection(clientSocket, numConnections);
				new Thread(oneconnection).start();
			}   
			catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	
}

class Server2Connection implements Runnable {
	BufferedReader is;
	PrintStream os;
	Socket clientSocket;
	int id;

	public Server2Connection(Socket clientSocket, int id) {
		this.clientSocket = clientSocket;
		this.id = id;
		System.out.println( "Connection " + id + " established with: " + clientSocket );
		try {
			is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			os = new PrintStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void run() {
		String line;
		try {
			boolean serverStop = false;

			while (true) {
				line = is.readLine();
				System.out.println( "Received " + line + " from Connection " + id + "." );
				int n = Integer.parseInt(line);
				if ( n == -1 ) {
					serverStop = true;
					
					break;
				}
				if ( n == 0 ) break;
				os.println("" + n*n ); 
			}

			System.out.println( "Connection " + id + " closed." );
			is.close();
			os.close();
			clientSocket.close();

			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
