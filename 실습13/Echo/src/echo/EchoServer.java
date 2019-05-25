package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	ServerSocket sc;
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	OutputStream os = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public EchoServer() throws IOException{
		try {
			sc = new ServerSocket(7000);
			System.out.println("-----------");
			System.out.println("SERVER start");
			System.out.println("-----------");
			Socket s = sc.accept();
			System.out.println(s.getInetAddress()+"클라이언트 연결");
			
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String data = null;
			data = br.readLine();
			System.out.println("클라이언트로부터 받은 데이터 : "+data );
			
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(data);
			bw.flush();
		} catch(IOException e) {
			System.out.println("접속 실패");
		}
		bw.close();
		osw.close();
		os.close();
		sc.close();
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		EchoServer a = new EchoServer();
	}

}
