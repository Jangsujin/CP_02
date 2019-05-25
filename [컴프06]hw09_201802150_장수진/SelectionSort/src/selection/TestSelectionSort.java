package selection;

public class TestSelectionSort {
	public TestSelectionSort() {
		int[] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a);
		IntArrays.print(a);
	}
	void sort(int[]a) {
		sort(a, a.length);
	}
	void sort(int [] a, int n) {
		if(n<1) return;
		int m = 0;
		for(int i=1;i<n;i++) {
			if(a[m]<a[i]) m = i;
		}
		IntArrays.swap(a, m, n-1);
		sort(a, n-1);
	}

	public static void main(String[] args) {
		new TestSelectionSort();
	}

}
