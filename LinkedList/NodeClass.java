//Without Using Generic function
package LinkedList;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		next=null;
	}
}

public class NodeClass {

	public static void main(String[] args) {
		Node n1=new Node(10);
		System.out.println(n1.data);
		System.out.println(n1.next);

	}

}
