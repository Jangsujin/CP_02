package echo;

import java.io.*;
import java.net.*;

public class EchoClient {
	ServerSocket sc;
	Socket s = null;
	OutputStream os = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public EchoClient() throws IOException{
		try {
			System.out.println("-----------");
			System.out.println("Client start");
			System.out.println("-----------");
			
			s = new Socket("10.3.223.111", 7000);
			
			System.out.println("클라이언트 연결");
			
			String data = "테스트 문자열";
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			bw.write(data);
			bw.newLine();
			bw.flush();
			
			String receiveData = "";
			
			receiveData = br.readLine();
			
			System.out.println("서버로부터 받은 데이터 : " + receiveData);
		} catch(IOException e) {
			System.out.println("접속 실패");
		}
		bw.close();
		osw.close();
		os.close();
		br.close();
		isr.close();
		is.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EchoClient a = new EchoClient();
	}

}
