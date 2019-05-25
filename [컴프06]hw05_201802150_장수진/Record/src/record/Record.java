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
			System.out.println("�л����� �߰� 1 -- �л����� �˻� 2 -- �л����� ���� 3 -- ��� �л����� ��� 4");
			int x = s.nextInt();
			if(x == 1) {
				System.out.println("�л� �̸��� �Է��ϼ���");
				String name = s2.nextLine();
				System.out.println("�л� �ּҸ� �Է��ϼ���");
				String add = s2.nextLine();
				System.out.println("�л� ��ȭ��ȣ�� �Է��ϼ���(������ 000-0000-0000)");
				String num = s2.nextLine();
				if(num.length() != 13) {
					System.out.println("���Ŀ� ���� �ٽ� �Է��ϼ���"); // -���� ���ڸ� �Է����� ��� �ٽ� �Է¹���
					num = s2.nextLine();
				}
				student = new Student(name,add,num);
				list.add(student);	
			}
			else if(x == 2) { 
				boolean t=false;
				int cmp=0;
				System.out.println("�˻��� �л� �̸��� �Է��ϼ��� ");
				String name = s2.nextLine();
				for(int i=0; i<list.size();i++) {
					t = name.equals((list.get(i)).getName());
					if(t == true) {
						cmp = i;
					}
				}
				if(t == true) {
					System.out.println((list.get(cmp)).getName()+"�л��� �ּҴ� "+(list.get(cmp)).getAdd()+"�Դϴ�.");
					System.out.println((list.get(cmp)).getName()+"�л��� ��ȭ��ȣ�� "+(list.get(cmp)).getNum()+"�Դϴ�.");
				}
				else {
					System.out.println("�����ο� ���� �л��Դϴ�.");
				}
			}
			else if(x==3) {
				boolean t = false;
				int cmp = 0;
				System.out.println("������ �л� �̸��� �Է��ϼ���");
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
					System.out.println("�����ο� ���� �л��Դϴ�."); // ����ó��
				}
			} else if(x==4) {
				for(int i =0; i<list.size();i++) {
					String name = (list.get(i)).getName();
					System.out.println(name+"�л��� �ּҴ� "+(list.get(i)).getAdd()+"�Դϴ�.");
					System.out.println(name+"�л��� ��ȭ��ȣ�� "+(list.get(i)).getNum()+"�Դϴ�.");
				}
				break;
			}
		}
	}
}
