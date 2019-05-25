package node1;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}

public class Node1 {
	static Node copy(Node list) {
		Node p = list;
		Node list2 = new Node(list.data);
		Node p1 = list2;
		for(int i=1;i<8;i++) {
			p1.next = new Node(p.next.data);
			p = p.next;
			p1 = p1.next;
		}
		return list2;
		
	}
	
	public static void main(String args[]) {
		Node list = new Node(22);
		Node p = list;
		for(int i=1;i<8;i++) {
			p.next = new Node(11*(i+2));
			p = p.next;
		}
		System.out.print("기존 list : ");
		p = list;
		for(;p!=null;p = p.next) {
			System.out.print(p.data + " ");
		}
		System.out.println();
		System.out.println("list1을 list2에 복사");
		Node list2 = copy(list);
		
		System.out.print("수정된 list ");
		p = list;
		p.data = 2;
		for(;p!=null;p = p.next) {
			System.out.print(p.data + " ");
		}
		p = list2;
		System.out.println();
		System.out.print("복사된 list2 ");
		for(;p!=null;p=p.next) {
			System.out.print(p.data + " ");
		}
	}

}
