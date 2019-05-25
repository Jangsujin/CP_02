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
			System.out.println("주소록 추가 1 -- 주소록 검색 2 -- 모든 주소록 출력 3 -- 종료 4");
			x = s.nextInt();
			if(x==1) {
				System.out.println("추가할 이름을 입력하세요");
				String name = s2.nextLine();
				System.out.println("주소를 입력하세요");
				String add = s2.nextLine();
				System.out.println("전화번호를 입력하세요(형식은 000-0000-0000 입니다.)");
				String num = s2.nextLine();
				if(num.length() != 13) {
					System.out.println("형식에 맞춰 다시 입력하세요"); // -없이 숫자만 입력했을 경우 다시 입력받음
					num = s2.nextLine();
				}
				v = new Value(add, num);
				m.put(name, v);
			}
			else if(x==2) {
				System.out.println("검색할 이름을 입력하세요");
				String key = s2.nextLine();
				boolean t;
				t = m.containsKey(key);
				if(t==true) {
					System.out.println(key+"의 주소 : "+ (m.get(key)).getAdd());
					System.out.println(key+"의 전화번호 : "+(m.get(key)).getCon());
				} else {
					System.out.println("주소록에 없습니다.");
				}
			}
			else if(x==3) {
				for(Map.Entry<String, Value> st : m.entrySet()) {
					String key = st.getKey();
					String add = (st.getValue()).getAdd();
					String num = (st.getValue()).getCon();
					System.out.println("이름 : "+key+" 주소 : "+add+" 전화번호 : "+num);
				}
			}
			else if(x == 4) {
				break;
			}
		}
	}
}