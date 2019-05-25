package part;

public class Selection {
	public Selection() {
		int [] a = {88,55,22,77,11,44,33,99,66};
		IntArrays.print(a);
		sort(a,2,7);
		IntArrays.print(a);
	}
	
	void sort(int[]a,int p, int q) {
		for(int j=q-1;j>p;j--) {
			int m = p;
			for(int i=p+1;i<=j;i++) {
				if(a[m]<a[i]) m = i;
			}
			IntArrays.swap(a, m, j);
		}
	}
	
	public static void main(String[] args) {
		new Selection();
	}
}
