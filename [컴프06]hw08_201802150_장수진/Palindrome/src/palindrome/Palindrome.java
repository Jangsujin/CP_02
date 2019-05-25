package palindrome;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	static boolean isPalindrome(String s) {
		int r = s.length();
		String [] a = new String[r];
		for(int i=0;i<r;i++) {
			a[i] = s.charAt(i)+"";
		}
		if(r==0) return true;
		boolean cmd;
		if(a[0].equals(a[r-1])) {
			cmd = true;
		} else {
			cmd = false;
		}
		for(int i=0;i<r-1;i++) {
			a[i] = a[i+1];
		}
		r = r-2;
		s = "";
		for(int i=0;i<r;i++) {
			s += a[i];
		}
		return cmd && isPalindrome(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("aba : " + isPalindrome("aba"));
		System.out.println("cbcb : "+isPalindrome("cbcb"));
		System.out.println("koaa : "+isPalindrome("koaa"));
		System.out.println("akoooka : "+isPalindrome("akoooka"));
	}

}
