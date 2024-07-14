package LinkedList;
class Node2<T>{
	T data;
	Node2<T> next;
	
	  Node2(T data){
		this.data=data;
		this.next=null;
	}
}

public class PrintLL1 {

	public static void main(String[] args) {
		Node2<Integer> node1=new Node2<Integer>(10);
		Node2<Integer> node2=new Node2<Integer>(20);
		Node2<Integer> node3=new Node2<Integer>(30);
		
		node1.next=node2;//here We point the address of node 2 to the next part of node 1
		node2.next=node3;//here we point the address of node3 to the next part of node 2
		
		Node2<Integer>head;//here we made the new node name head
		head=node1;
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		

	}

}
