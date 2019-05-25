package addressIO;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Person{
	String name;
	String number;
	String email;
	public Person(String name, String number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}
}

public class Address {
	File inputFile = null;
	File outputFile = null;
	FileReader fileReader = null;
	FileWriter fileWriter = null;
	BufferedReader bufferedReader = null;
	BufferedWriter bufferedWriter = null;
	ArrayList<Double> list = null;
	
	public Address() throws IOException{
		inputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\실습11\\AddressBook.txt");
		outputFile = new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\실습11\\AddressBook.txt");
		bufferedReader = new BufferedReader(new FileReader(inputFile));
		bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
		list = new ArrayList<Double>();
	}
	public void readAddress(String searchNum) throws IOException{
		String line ="";
		StringTokenizer st = null;
		while((line=bufferedReader.readLine()) != null) {
			
			st=new StringTokenizer(line);
			String s = st.nextToken();
			//Double d = Double.parseDouble(s);
			//list.add(d);
			if(s.equals(searchNum) ) {
				System.out.println("이름 : "+st.nextToken());
				System.out.println("전화번호 : "+st.nextToken());
				System.out.println("이메일 : "+st.nextToken());
				break;
				}
			}

			
	}
	public void writeAddress(ArrayList<Person> personList) throws IOException{
		for(int i=0;i<personList.size();i++) {
			bufferedWriter.write((i+1)+" "+personList.get(i).name+" "+personList.get(i).number+" "+personList.get(i).email);
			bufferedWriter.newLine();
			
		}
		bufferedWriter.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Address book = new Address();
		Person a = new Person("홍길동", "011-111-1111", "hong@hanmail.net");
		Person b = new Person("김유신", "010-2222-2222", "kim@hanmail.net");
		Person c = new Person("김나라", "010-3333-4444", "na@hanmail.net");
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(a);
		personList.add(b);
		personList.add(c);
		
		book.writeAddress(personList);
		book.readAddress("2");
		book.readAddress("3");
		
		
	}

}
