package exp;

public class Exp {
	double exp1(double x, int n) {
		double y = 1.0;
		if(n<0) {
			for(int i=0;n<i;i--) {
				y *= (1/x);
			}
		}
		else {
			for(int i=0;i<n;i++) {
				y *= x;
			}
		}
		return y;
	}
	double exp2(double x, int n) {
		if(n<0) return 1.0/exp2(x,-n);
		double factor = (n%2 == 0 ? 1.0 : x);
		
		if(n<2) return factor;
		return factor*exp2(x*x,n/2);
	}
	
	Exp(){
		System.out.println("exp1(3,4) : "+exp1(3,4));
		System.out.println("exp2(3,4) : "+exp2(3,4));
		System.out.println("exp1(5,-2) : "+exp1(5,-2));
		System.out.println("exp2(5,-2) : "+exp2(5,-2));
		System.out.println("exp1(2,-5) : "+exp1(2,-5));
		System.out.println("exp2(2,-5) : "+exp2(2,-5));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exp();
		

	}

}
