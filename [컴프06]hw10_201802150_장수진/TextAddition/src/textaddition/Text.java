package textaddition;

import java.io.*;

public class Text {
	File inputFile = null;
	File inputFile2 = null;
	File outputFile = null;
	BufferedReader bufReader = null;
	BufferedWriter bufWriter = null;
	public Text() {
		inputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\text1.txt");
		inputFile2 = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\text2.txt");
		outputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW10\\[컴프06]hw10_201802150_장수진\\add.txt");
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
