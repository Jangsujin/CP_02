package node3;

public class Node {
	
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
	
	static void swap(Node list, int i, int j) {
		Node p = list;
		for(int c=0;c<i;c++) {
			p = p.next;
		}
		int d1 = p.data;
		p=list;
		for(int c=0;c<j;c++) {
			p = p.next;
		}
		int d2 = p.data;
		p=list;
		for(int c=0;c<i;c++) {
			p = p.next;
		}
		p.data = d2;
		p=list;
		for(int c=0;c<j;c++) {
			p = p.next;
		}
		p.data = d1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node(22);
		Node p = start;
		for(int i =1;i<8;i++) {
			p.next = new Node(11*(i+2));
			p = p.next;
		}
		p=start;
		for(;p!=null;p = p.next) {
			System.out.print(p.data + " ");
		}
		System.out.println();
		swap(start,2,5);
		
		p = start;
		for(;p!=null;p=p.next) {
			System.out.print(p.data + " ");
		}

	}

}
