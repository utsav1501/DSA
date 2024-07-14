//Here We use Generic class
package LinkedList;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

class Noode<T>{
	T data;
	Noode<T> next;
	
	Noode(T data){
		this.data=data;
		next=null;
	}
}
public class NodeClass1 {

	public static void main(String[] args) {
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		for(int i = 1; i <= 5; i++){
			queue.enqueue(i);
		}
		
		
		while(! queue.isEmpty()){
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
