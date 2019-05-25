package arrays;

import java.util.*;

public class IntArrays {
	public static void print(int [] a) {
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("}");
	}
	
	public static boolean isSorted(int [] a) {
		for(int i =1;i<a.length;i++)
			if(a[i]<a[i-1]) return false;
		return true;
	}
	
	public static int[] randomInts(int n, int range) {
		if(n<0 || range<2) throw new IllegalArgumentException();
		Random random = new Random();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = random.nextInt(range);
		return a;
	}
	
	public static int[] resize(int[] a, int n) {
		if(n<a.length) throw new IllegalArgumentException();
		int [] aa = new int[n];
		System.arraycopy(a, 0, aa, 0, a.length);
		return aa;
	}
	
	public static void swap(int [] a, int i, int j) {
		int ai = a[i], aj = a[j];
		if(ai==aj) return;
		a[i] = aj;
		a[j] = ai;
	}
	
	public static int[] reverse(int [] a) {
		java.util.Arrays.sort(a);
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i] = a[a.length-1-i];
		}
		return b;
	}

}
