package bubblesort;

public class TestSelectionSort {
	public TestSelectionSort() {
		int [] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a);
		IntArrays.print(a);
	}
	void sort(int[] a) {
		for(int i = a.length-1;i>0;i--) {
			select(a,i);
		}
	}
	void select(int [] a, int i) {
		int m = 0;
		for(int j=1;j<=i;j++) {
			if(a[m]<a[j]) m=j;
		}
		IntArrays.swap(a, i, m);
	}

	public static void main(String[] args) {
		new TestSelectionSort();

	}

}
