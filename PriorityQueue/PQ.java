package PriorityQueue;
import java.util.ArrayList;
public class PQ {
	
	private ArrayList<Integer> heap;//yha hum arrayList banaye hai jiska nam heap hai
	
	public PQ(){ // constructor
		heap=new ArrayList<>();
	}
	
	boolean isEmpty(){ //method
		return heap.size()==0;
	}
	
	int size(){ //method
		return heap.size();
	}
	
	int getMin() throws PriorityQueueException{ //method
		if(isEmpty()) {
			//Throw an Exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}
	
	void insert(int element) { //method
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0) {
			if(heap.get(childIndex)<heap.get(parentIndex)) {
				//do swapping
				int temp=heap.get(childIndex);
				heap.set(childIndex,heap.get(parentIndex));
				heap.set(parentIndex,temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else{ //it means ki childIndex>parentIndex ya value at(childIndex=ParentIndex)
				return;
			}
		}
	}
	
	int removeMin() throws PriorityQueueException{
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		int temp=heap.get(0);//jisko remove krna hai uska index rakh lo so that isko return bhi to karna hai
		
		heap.set(0,heap.get(heap.size()-1));
		//it means ki 0 index pe shift krdo last wla heap(arrayList) ke value se
		heap.remove(heap.size()-1);
		int index=0;
		int minIndex=index;
		int leftChildIndex=1;
		int rightChildIndex=2;
		
		while(leftChildIndex<heap.size()) {
			if(heap.get(leftChildIndex)<heap.get(minIndex)) {
				minIndex=leftChildIndex;
			}
			
			if(rightChildIndex<heap.size() && heap.get(rightChildIndex)<heap.get(minIndex)) {
				minIndex=rightChildIndex;
				//yha pe basically hum left aur right child ko compare kr rhe h
			}
			
			if(minIndex==index) {
				break;
			}
			else {
				int temp1=heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex,temp1);
				index=minIndex;
				leftChildIndex=2*index+1;
				rightChildIndex=2*index+2;
			}
		}
		return temp;
	}	
}
