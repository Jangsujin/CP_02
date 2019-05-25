package node4;

public class BigInt {
	private Node start;
	
	private static class Node{
		int digit;
		Node next;
		Node(int digit){
			this.digit = digit;
		}
	}
	
	public BigInt(int n) {
		if(n<0) throw new IllegalArgumentException(n+"<0");
		start = new Node(n%10);
		Node p = start;
		n /= 10;
		while(n>0) {
			p = p.next = new Node(n%10);
			n /= 10;
		}
	}
	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString(start.digit));
		Node p = start.next;
		while(p!=null) {
			buf.insert(0,Integer.toString(p.digit));
			p = p.next;
		}
		return buf.toString();
	}
	
	public boolean equals(Object object) { 
		// override 하는 거라서 앞에 public이 붙어야 함.
		if(!(object instanceof BigInt)) throw new IllegalArgumentException();
		BigInt x = (BigInt)object;
		Node p = start;
		Node q = x.start;
		for(;p!=null;p=p.next) {
			if(p.digit == q.digit) {
				q = q.next;
			}
			else {
				return false;
			}
		}
		if(p == null && q == null) {
			return true;
		}
		return false;
		
	}
	BigInt time(int n) {
		Node p = start;
		int num = n*p.digit;
		BigInt z = new BigInt(num%10);
		Node r = z.start;
		p = p.next;
		while(p!=null) {
			num = num/10 +n*p.digit;
			r.next = new Node(num%10);
			p = p.next;
			r = r.next;
		}
		if(num>9) {
			r.next = new Node(num/10);
		}
		return z;
	}
	
	
	
	BigInt plus(BigInt y) {
		Node p = start;
		Node q = y.start;
		int n = p.digit + q.digit;
		BigInt z = new BigInt(n%10);
		Node r = z.start;
		p = p.next;
		q = q.next;
		while(p != null && q != null) {
			n = n/10 + p.digit + q.digit;
			r.next = new Node(n%10);
			p = p.next;
			q = q.next;
			r = r.next;
		}
		
		while(p!=null) {
			n = n/10 + p.digit;
			r.next = new Node(n%10);
			p = p.next;
			r = r.next;
		}
		while(q != null) {
			n = n/10 + q.digit;
			r.next = new Node(n%10);
			q = q.next;
			r = r.next;
		}
		if(n>9) {
			r.next = new Node(n/10);
		}
		
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInt x = new BigInt(0);
		BigInt y = new BigInt(1);
		BigInt z = new BigInt(1);
		
		System.out.println("피보나치 수열");
		for(int i=0;i<100;i++) {
			x = y;
			y = z;
			z = x.plus(y);
			System.out.println(z+" ");
		}
		System.out.println();
		
		BigInt w = new BigInt(9500);
		BigInt v = w.time(2);
		System.out.println(w+" time 2 is "+v);
		
		BigInt d = new BigInt(123);
		BigInt f = new BigInt(123);
		boolean cmp = d.equals(f);
		System.out.println(d+" equals BigInt "+f+" is "+cmp);

	}

}
