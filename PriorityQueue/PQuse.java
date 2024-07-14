package PriorityQueue;

public class PQuse {
	public static void main(String[] args) throws PriorityQueueException {
		PQ priorityQ=new PQ();
		int arr[]= {5,1,9,2,0};
		for(int i=0;i<arr.length;i++) {
			priorityQ.insert(arr[i]);
		}
		while(!priorityQ.isEmpty()) {
			System.out.print(priorityQ.removeMin()+" ");
		}
		System.out.println();
		
		//so the elements form after removal is in sorted order and this is called heap sort
	}
}
