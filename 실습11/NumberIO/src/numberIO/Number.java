package numberIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Number {
	File inputFile = null;
	File outputFile = null;
	FileReader fileReader = null;
	FileWriter fileWriter = null;
	BufferedReader bufferedReader = null;
	BufferedWriter bufferedWriter = null;
	ArrayList<Double> list = null;
	
	public Number() throws IOException{
		inputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\실습11\\TestFile.txt");
		outputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\실습11\\OutputFile.txt");
		bufferedReader = new BufferedReader(new FileReader(inputFile));
		bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
		list = new ArrayList<Double>();
	}
	public void readNumber() throws IOException{
		String line = "";
		while((line=bufferedReader.readLine()) != null) {
			list.add(Double.parseDouble(line));
		}
		bufferedReader.close();
	}
	
	public void writeNumber() throws IOException{
		Collections.sort(list);
		//PrintWriter print = new PrintWriter(bufferedWriter); 
		for(int i=0;i<list.size();i++) {
//			String s = String.format("%f",list.get(i));
			String s = Double.toString(list.get(i));
			bufferedWriter.write(s);
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		Number a = new Number();
		a.readNumber();
		a.writeNumber();
	}

}
