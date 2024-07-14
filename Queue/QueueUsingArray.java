package Queue;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public QueueUsingArray(int Capacity) {
		data=new int[Capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int front() throws QueueEmptyException {
		if(size==0) {//agar Queue khali ho
			throw new QueueEmptyException();//we we directly made object and throw exception
		}
		return data[front];
	}
	void Enqueue(int Element) throws QueueFullException {
		if(size==data.length) {
			throw new QueueFullException();
		}
		if(size==0) {//bs size 0 rahega tabhi front ko 0 set krenge
			front=0;
		}
		size++;
		rear++;
		if(rear==data.length) {
			rear=0;
		}
		data[rear]=Element;
	}
	int deQueue() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}
		int temp = data[front];
		//front = (front + 1) % data.length;
		front++;
		if(front == data.length){
			front = 0;
		}
		size--;
		if(size == 0){
			front = -1;
			rear = -1;
		}
		return temp;
	}
	}
