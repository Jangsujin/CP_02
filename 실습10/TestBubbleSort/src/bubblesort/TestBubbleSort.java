package bubblesort;

public class TestBubbleSort {
	
	public TestBubbleSort() {
		int[] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a);
		IntArrays.print(a);
	}
	void sort(int[] a) {
		for(int i = a.length-1;i>0;i--) {
			bubbleUp(a,i);
		}
	}
	void bubbleUp(int[] a, int i) {
		for(int j=0;j<i;j++) {
			if(a[j]>a[j+1]) {
				IntArrays.swap(a,j,j+1);
			}
		}
	}

	public static void main(String[] args) {
		new TestBubbleSort();

	}

}
