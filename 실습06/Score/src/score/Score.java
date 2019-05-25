package score;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Score {
	public static void main(String args[]) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner s = new Scanner(System.in);
		for(int i=1;i<4;i++) {
			System.out.println("심사위원"+i+"의 점수를 입력하세요");
			double x = s.nextDouble();
			list.add(x);
		}
		double max = Collections.max(list);
		double min = Collections.min(list);
		System.out.println("심사위원의 최고점수는 "+max+"입니다.");
		System.out.println("심사위원의 최저점수는 "+min+"입니다.");
		list.remove(max);
		list.remove(min);
		System.out.println("최고점수와 최저점수를 제외한 점수는"+list.get(0)+"입니다.");
		
		
	}

}
