package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		try {
			serverSocket = new ServerSocket(5555);
		} catch(IOException e) {
			System.err.println("다음 포트 번호에 연결할 수 없습니다 : 5555");
			System.exit(1);
		}
		int i=0;
		while(i<5) {
			clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
				Thread t = new ClientThread2(clientSocket);
				t.start();
			} catch(IOException e) {
				System.err.println("accept() 실패");
				System.exit(1);
			}
			i++;	
		}
		if(clientSocket!=null) {
			clientSocket.close();
		}
		if(serverSocket!=null) {
			serverSocket.close();
		}
	}
}

class ClientThread2 extends Thread{
	Socket clientSocket;
	public ClientThread2(Socket c){
		this.clientSocket = c;
	}
	public void run() {
		PrintWriter out;
		BufferedReader in;
		try {
			QuizProtocol qp = new QuizProtocol();
			String inputLine, outputLine;
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));	
			outputLine = qp.process(null);
			out.println(outputLine);
			
			while((inputLine=in.readLine())!=null) {
				outputLine = qp.process(inputLine);
				out.println(outputLine);
				if(outputLine.equals("quit"))
					break;
			}
			if(out!=null) {
				out.close();	
			}
			if(in!=null) {
				in.close();
			}
		} catch(IOException e){
			
		}
	}
}
