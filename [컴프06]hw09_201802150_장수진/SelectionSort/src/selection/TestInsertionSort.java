package selection;

public class TestInsertionSort {
	
	public TestInsertionSort() {
		int [] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a);
		IntArrays.print(a);
	}
	void sort(int[]a) {
		sort(a, 0);
	}
	
	void sort(int[]a, int n) {
		if(n==a.length) return;
		int ai = a[n]; int i=n;
		for(i=n;i>0&&a[i-1]>ai;i--) {
			a[i] = a[i-1];
		}
		a[i] = ai;
		sort(a,n+1);
	}

	public static void main(String[] args) {
		new TestInsertionSort();
	}

}
