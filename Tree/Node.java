package Tree;

//import Queue.Node;

public class Node<T>{
	//class Node<T>{
		T data;
		Node<T> next;
		
		Node(T data){
			this.data=data;
			next=null;
		}
	}
