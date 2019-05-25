package partition;

public class Partition {
	static void print(int [] a) {
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("}");
	}
	
	static int partition(int [] a) {
		System.out.print("원래 배열 : ");
		print(a);
		int pivot = a[0];
		int i=0;
		int z = 0;
		int j = a.length-1;
		for(j=a.length-1;j>0;j--) {
			if(a[j]<pivot) {
				int tmp = a[j];
				a[i] = tmp;
				System.out.print("         ");
				print(a);
				for(i=0;i<j;i++) {
					if(a[i]>pivot) {
						a[j] = a[i];
						System.out.print("         ");
						print(a);
						break;
					}
				}
			}
			if(i==j) {
				z = j;
				break;
			}	
		}
		a[z] = pivot;
		System.out.print("수정 배열 : ");
		print(a);
		return z;
	}
	
	public static void main(String[] args) {
		int [] a= {44,99,55,88,33,66,22,77};
		int p = partition(a);
		System.out.println("인덱스 J의 위치 : "+p);
	}

}
