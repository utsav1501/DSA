package LinkedList;

public class print {
public static void print(Noode<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
	System.out.println();
}

	public static void main(String[] args) {	
		Noode<Integer> node1=new Noode<Integer>(10);
		Noode<Integer> node2=new Noode<Integer>(20);
		Noode<Integer> node3=new Noode<Integer>(30);
		node1.next=node2;
		node2.next=node3;
		Noode<Integer> head=node1;
		print(head);
		}
}
