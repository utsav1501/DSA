package LinkedList;

public class IncrementEveryElementInLinkedList {
	public static Noode<Integer> createLinkedList(){
		Noode<Integer> node1=new Noode<>(10);
		Noode<Integer> node2=new Noode<>(20);
		Noode<Integer> node3=new Noode<>(30);
		Noode<Integer> node4=new Noode<>(40);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		return node1;
 		
	}
	public static void Print(Noode<Integer> head) {
		Noode<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void increment(Noode<Integer> head) {
//		head=new Noode<Integer>(100);
//		head.data++;
//		System.out.println("Hi"+head.data);
		
		head.data++;//yha pe same node me changes ho rahi hai
	}
	public static void main(String[] args) {
		Noode<Integer> head=createLinkedList();
		increment(head);
		Print(head);
		

	}

}
