package Queue;

//LinkedList.Noode;
	 class Node<T>{
			T data;
			Node<T> next;
			
			Node(T data){
				this.data=data;
				next=null;
			}
		}

public class QueueUsingLLNode {
//	 class Node<T>{
//			T data;
//			Node<T> next;
//			
//			Node(T data){
//				this.data=data;
//				next=null;
//			}
//		}
	public static void main(String[] args) {
		Node<Integer> node1=new Node<Integer>(12);
		System.out.println(node1.data);
		System.out.println(node1.next);
		Node<Integer> node2=new Node<Integer>(15);
		node1.next=node2;
		System.out.println(node1.next);
		System.out.println(node2);
	}
}
