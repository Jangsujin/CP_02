package bubblesort;

public class TestInsertionSort {
	public TestInsertionSort() {
		int[] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a);
		IntArrays.print(a);
	}
	void sort(int[]a) {
		for(int i=1;i<a.length;i++) {
			insert(a,i);
		}
	}
	void insert(int[]a,int i) {
		int ai = a[i], j=i;
		for(j=i;j>0 && a[j-1]>ai;j--) {
				a[j] = a[j-1];
			}
		a[j]=ai;
		}

	public static void main(String[] args) {
		new TestInsertionSort();

	}

}
