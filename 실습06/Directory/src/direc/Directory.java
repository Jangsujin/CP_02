package direc;

import java.util.*;

public class Directory {
	public static void main(String args[]) {
		Map<String, String>m = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.println("�����߰� 1 -- �����˻� 2 -- ������ ��� �ܾ� ��� 3");
			int x = s.nextInt();
			if(x ==1) {
				System.out.println("���� �ܾ �Է��ϼ���.");
				String tmp = s2.nextLine();
				System.out.println("�ܾ ���� �ǹ̸� �Է��ϼ���.");
				String tmp2 = s2.nextLine();
				m.put(tmp, tmp2);
			}
			else if(x == 2) {
				System.out.println("�˻��� �ܾ �Է��ϼ���.");
				boolean t;
				String tmp = s2.nextLine();
				t = m.containsKey(tmp);	
				if(t == true) {
					System.out.println("�ܾ��� �ǹ̴� "+m.get(tmp)+"�Դϴ�.");
				} else {
					System.out.println("������ �ܾ �����ϴ�.");
				}
				
			}
			else if(x == 3) {
				for(Map.Entry<String, String> st : m.entrySet()) {
					String key = st.getKey();
					String value = st.getValue();
					System.out.println("�ܾ� : "+key+" �ǹ� : "+value);
				}
				break;
			}
		}
		
	}

}
