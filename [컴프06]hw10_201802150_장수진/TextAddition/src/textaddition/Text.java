package textaddition;

import java.io.*;

public class Text {
	File inputFile = null;
	File inputFile2 = null;
	File outputFile = null;
	BufferedReader bufReader = null;
	BufferedWriter bufWriter = null;
	public Text() {
		inputFile = new File("C:\\Users\\LG\\Desktop\\18\\2�б�\\����2\\HW10\\[����06]hw10_201802150_�����\\text1.txt");
		inputFile2 = new File("C:\\Users\\LG\\Desktop\\18\\2�б�\\����2\\HW10\\[����06]hw10_201802150_�����\\text2.txt");
		outputFile = new File("C:\\Users\\LG\\Desktop\\18\\2�б�\\����2\\HW10\\[����06]hw10_201802150_�����\\add.txt");
	}
	public void addition() throws IOException{
		String line = "";
		bufReader = new BufferedReader(new FileReader(inputFile));
		bufWriter = new BufferedWriter(new FileWriter(outputFile));
		while((line=bufReader.readLine())!=null) {
			bufWriter.write(line);
			bufWriter.newLine();
		}
		bufReader = new BufferedReader(new FileReader(inputFile2));
		while((line=bufReader.readLine())!=null) {
			bufWriter.write(line);
			bufWriter.newLine();
		}
		bufWriter.close();
	}

	public static void main(String[] args) throws IOException {
		Text t = new Text();
		t.addition();
	}
}
