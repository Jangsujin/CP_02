package binary;

public class Binary {
	
	static String bin(int n) {
		if(n==0) return "0";
		if(n==1) return "1";
		return bin(n/2) +( n%2 == 0? "0" : "1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=8;i<16;i++)
			System.out.println(bin(i));

	}

}
