package record;

import java.util.*;

class Student{
	private String name;
	private String add;
	private String num;
	public Student(String name, String add, String num) {
		this.name = name;
		this.add = add;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public String getNum() {
		return num;
	}
}

public class Record {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student student;
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.println("학생정보 추가 1 -- 학생정보 검색 2 -- 학생정보 삭제 3 -- 모든 학생정보 출력 4");
			int x = s.nextInt();
			if(x == 1) {
				System.out.println("학생 이름을 입력하세요");
				String name = s2.nextLine();
				System.out.println("학생 주소를 입력하세요");
				String add = s2.nextLine();
				System.out.println("학생 전화번호를 입력하세요(형식은 000-0000-0000)");
				String num = s2.nextLine();
				if(num.length() != 13) {
					System.out.println("형식에 맞춰 다시 입력하세요"); // -없이 숫자만 입력했을 경우 다시 입력받음
					num = s2.nextLine();
				}
				student = new Student(name,add,num);
				list.add(student);	
			}
			else if(x == 2) { 
				boolean t=false;
				int cmp=0;
				System.out.println("검색할 학생 이름을 입력하세요 ");
				String name = s2.nextLine();
				for(int i=0; i<list.size();i++) {
					t = name.equals((list.get(i)).getName());
					if(t == true) {
						cmp = i;
					}
				}
				if(t == true) {
					System.out.println((list.get(cmp)).getName()+"학생의 주소는 "+(list.get(cmp)).getAdd()+"입니다.");
					System.out.println((list.get(cmp)).getName()+"학생의 전화번호는 "+(list.get(cmp)).getNum()+"입니다.");
				}
				else {
					System.out.println("학적부에 없는 학생입니다.");
				}
			}
			else if(x==3) {
				boolean t = false;
				int cmp = 0;
				System.out.println("삭제할 학생 이름을 입력하세요");
				String name = s2.nextLine();
				for(int i=0; i<list.size();i++) {
					t = name.equals((list.get(i)).getName());
					if(t == true) {
						cmp = i;
					}
				}
				if(t == true) {
					list.remove(cmp);
				} else {
					System.out.println("학적부에 없는 학생입니다."); // 예외처리
				}
			} else if(x==4) {
				for(int i =0; i<list.size();i++) {
					String name = (list.get(i)).getName();
					System.out.println(name+"학생의 주소는 "+(list.get(i)).getAdd()+"입니다.");
					System.out.println(name+"학생의 전화번호는 "+(list.get(i)).getNum()+"입니다.");
				}
				break;
			}
		}
	}
}
