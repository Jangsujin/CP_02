package part;

public class Insertion {
	public Insertion() {
		int [] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a,2,7);
		IntArrays.print(a);
	}
	
	void sort(int [] a, int p, int q) {
		for(int i=p;i<q;i++) {
			int ai = a[i]; int j=i;
			for(j=i;j>p&&a[j-1]>ai;j--) {
				a[j]=a[j-1];
			}
			a[j] = ai;
		}
	}

	public static void main(String[] args) {
		new Insertion();
	}
}
