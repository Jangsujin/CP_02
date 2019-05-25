package caesar;

import java.io.*;

public class Caesar {
	File inputFile = null;
	File outputFile = null;
	File outputFile2 = null;
	BufferedReader bufReader = null;
	BufferedWriter bufWriter = null;
	
	public Caesar() throws IOException{
		inputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\test.txt");
		outputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\encryption.txt");
		outputFile2 = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\decryption.txt");
	}
	public void encryption(int n) throws IOException {
		String line = "";
		bufReader = new BufferedReader(new FileReader(inputFile));
		bufWriter = new BufferedWriter(new FileWriter(outputFile));
		while((line=bufReader.readLine()) != null) {
			String caesarChange = caesarEc(line, n);
			bufWriter.write(caesarChange);
			bufWriter.newLine();
		}
		bufWriter.close();
	}
	
	public void decryption(int n) throws IOException{
		String line = "";
		bufReader = new BufferedReader(new FileReader(outputFile));
		bufWriter = new BufferedWriter(new FileWriter(outputFile2));
		while((line=bufReader.readLine())!=null) {
			String caesarChange = caesarDc(line,n);
			bufWriter.write(caesarChange);
			bufWriter.newLine();
		}
		bufWriter.close();
	}
	
	public String caesarEc(String str, int n) throws IOException {
		int [] ec = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			ec[i] = str.charAt(i);
			if(65<=ec[i]+n && ec[i]+n<=90) {
				ec[i] = ec[i]+n;
			} else if(97<=ec[i]+n && ec[i]+n<=122) {
				ec[i] = ec[i]+n;
			} else if(ec[i]==32) {
				ec[i] = ec[i];
			} else {
				ec[i] = ec[i]-26+n;
			}
		}
		String s="";
		for(int i =0;i<str.length();i++) {
			s = s+(char)ec[i];
		}
		return s;
	}
	
	public String caesarDc(String str, int n) throws IOException{
		int [] ec = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			ec[i] = str.charAt(i);
			if(65+n<=ec[i]&&ec[i]<=90+n) {
				ec[i] = ec[i]-n;
			} else if(97+n<=ec[i] && ec[i]<=122+n) {
				ec[i] = ec[i]-n;
			} else if(ec[i]==32) {
				ec[i] = ec[i];
			} else {
				ec[i] = ec[i]+26-n;
			}
		}
		String s ="";
		for(int i=0;i<str.length();i++) {
			s = s+(char)ec[i];
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		Caesar c = new Caesar();
		c.encryption(3);
		c.decryption(3);
	}
}
