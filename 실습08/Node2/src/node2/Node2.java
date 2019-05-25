package node2;


class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

public class Node2 {
	static void append(Node list1, Node list2) {
		Node p = list1;
		Node q = list2;
		for(;p.next!=null;p = p.next) {
			
		}
		p.next = q;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list1 = new Node(22);
		Node list2 = new Node(66);
		Node p = list1;
		Node q = list2;
		for(int i=1;i<4;i++) {
			p.next = new Node(11*(i+2));
			p = p.next;
			q.next = new Node(11*(i+6));
			q = q.next;
		}
		
		p = list1;
		for(;p!=null;p = p.next) {
			System.out.print(p.data + " ");
		}
		System.out.println();
		q = list2;
		for(;q!=null;q = q.next) {
			System.out.print(q.data + " ");
		}
		System.out.println();
		
		append(list1, list2);
		p = list1;
		for(;p!=null;p=p.next) {
			System.out.print(p.data + " ");
		}
		System.out.println();

	}

}
