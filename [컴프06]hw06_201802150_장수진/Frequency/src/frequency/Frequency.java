package frequency;

public class Frequency {

	public static void main(String[] args) {
		int [] a = {1,4,5,4,9,2,4,3,1,1,6,1,3,5,3,2,4,2,9,2,1,1,4,8,4,3,2,1,1};
		print(a);
		for(int i=1;i<10;i++) {
			int frequency = frequency(a,i);
			System.out.println(i+"에 대한 배열의 빈도수는 "+frequency);
			
			
		}

	}
	static int frequency(int [] a,int value) {
		int fre = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				fre += 1;
			}
		}
		return fre;
	}
	
	static void print(int [] a) {
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("}");
	}

}
