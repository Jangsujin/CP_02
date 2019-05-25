package direc;

import java.util.*;

public class Directory {
	public static void main(String args[]) {
		Map<String, String>m = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.println("사전추가 1 -- 사전검색 2 -- 사전의 모든 단어 출력 3");
			int x = s.nextInt();
			if(x ==1) {
				System.out.println("영어 단어를 입력하세요.");
				String tmp = s2.nextLine();
				System.out.println("단어에 대한 의미를 입력하세요.");
				String tmp2 = s2.nextLine();
				m.put(tmp, tmp2);
			}
			else if(x == 2) {
				System.out.println("검색할 단어를 입력하세요.");
				boolean t;
				String tmp = s2.nextLine();
				t = m.containsKey(tmp);	
				if(t == true) {
					System.out.println("단어의 의미는 "+m.get(tmp)+"입니다.");
				} else {
					System.out.println("사전에 단어가 없습니다.");
				}
				
			}
			else if(x == 3) {
				for(Map.Entry<String, String> st : m.entrySet()) {
					String key = st.getKey();
					String value = st.getValue();
					System.out.println("단어 : "+key+" 의미 : "+value);
				}
				break;
			}
		}
		
	}

}
