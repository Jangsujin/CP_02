package score;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Score {
	public static void main(String args[]) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner s = new Scanner(System.in);
		for(int i=1;i<4;i++) {
			System.out.println("�ɻ�����"+i+"�� ������ �Է��ϼ���");
			double x = s.nextDouble();
			list.add(x);
		}
		double max = Collections.max(list);
		double min = Collections.min(list);
		System.out.println("�ɻ������� �ְ������� "+max+"�Դϴ�.");
		System.out.println("�ɻ������� ���������� "+min+"�Դϴ�.");
		list.remove(max);
		list.remove(min);
		System.out.println("�ְ������� ���������� ������ ������"+list.get(0)+"�Դϴ�.");
		
		
	}

}
