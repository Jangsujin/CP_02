package part;

public class Bubble {
	public Bubble() {
		int[] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a,2,7);
		IntArrays.print(a);
	}
	
	void sort(int[]a, int p, int q) {
		for(int j=q-1;j>p;j--) {
			for(int i=p;i<j;i++) {
				if(a[i]>a[i+1]) {
					IntArrays.swap(a, i, i+1);
				}
			}
		}	
	}

	public static void main(String[] args) {
		new Bubble();
	}
}
