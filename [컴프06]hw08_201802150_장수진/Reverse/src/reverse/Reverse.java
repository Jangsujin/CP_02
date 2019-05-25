package reverse;

public class Reverse {
	
	static String reverse(String s) {
		int r = s.length();
		if(r==0) return "";
		
		String [] a = new String[r];
		for(int i=0;i<r;i++) {
			a[i] = s.charAt(i)+"";
		}
		s="";
		for(int i=0;i<r-1;i++) {
			s += a[i];
		}	
		return a[r-1]+reverse(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("esreverÀÇ reverse : "+reverse("esrever"));
		System.out.println("niamÀÇ reverse : "+reverse("niam"));
		System.out.println("noisrucerÀÇ reverse : "+reverse("noisrucer"));
		
	}

}
