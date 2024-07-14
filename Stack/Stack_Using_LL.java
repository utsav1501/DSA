package Stack;

public class Stack_Using_LL<T> { 
	private Node<T> head;
	private int size;
	
	public Stack_Using_LL() {
		head=null;
		size=0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size()==0;//or head=null;
	}
	T top() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	void push(T element) {
		Node<T> newNode=new Node<T>(element);
		newNode.next=head;
		head=newNode;
		size++;
	}
	T pop() throws StackEmptyException {
		if(size==0) {
			//StackEmptyException e = new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		T tempdata=head.data;//for printing popped element
		head=head.next;
		size--;
		return tempdata;
	}

}
