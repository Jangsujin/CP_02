package contact;

import java.util.*;

class Value {
	String add;
	String con;
	public Value(String add, String con) {
		this.add = add;
		this.con = con;
	}
	public String getAdd() {
		return add;
	}
	public String getCon() {
		return con;
	}
}

public class Contact {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int x;
		Value v;
		Map<String, Value> m = new HashMap<String, Value>();
		while(true){
			System.out.println("�ּҷ� �߰� 1 -- �ּҷ� �˻� 2 -- ��� �ּҷ� ��� 3 -- ���� 4");
			x = s.nextInt();
			if(x==1) {
				System.out.println("�߰��� �̸��� �Է��ϼ���");
				String name = s2.nextLine();
				System.out.println("�ּҸ� �Է��ϼ���");
				String add = s2.nextLine();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���(������ 000-0000-0000 �Դϴ�.)");
				String num = s2.nextLine();
				if(num.length() != 13) {
					System.out.println("���Ŀ� ���� �ٽ� �Է��ϼ���"); // -���� ���ڸ� �Է����� ��� �ٽ� �Է¹���
					num = s2.nextLine();
				}
				v = new Value(add, num);
				m.put(name, v);
			}
			else if(x==2) {
				System.out.println("�˻��� �̸��� �Է��ϼ���");
				String key = s2.nextLine();
				boolean t;
				t = m.containsKey(key);
				if(t==true) {
					System.out.println(key+"�� �ּ� : "+ (m.get(key)).getAdd());
					System.out.println(key+"�� ��ȭ��ȣ : "+(m.get(key)).getCon());
				} else {
					System.out.println("�ּҷϿ� �����ϴ�.");
				}
			}
			else if(x==3) {
				for(Map.Entry<String, Value> st : m.entrySet()) {
					String key = st.getKey();
					String add = (st.getValue()).getAdd();
					String num = (st.getValue()).getCon();
					System.out.println("�̸� : "+key+" �ּ� : "+add+" ��ȭ��ȣ : "+num);
				}
			}
			else if(x == 4) {
				break;
			}
		}
	}
}