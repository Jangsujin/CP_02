package bubblesort;

public class IntArrays {
	private java.util.Random random = new java.util.Random();
	
	public static void print(int[] a) {
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("}");
	}
	
	public static void swap(int [] a, int i, int j) {
		int ai = a[i], aj = a[j];
		if(ai==aj)
			return;
		a[i] = aj;
		a[j] = ai;
	}

}
