package PriorityQueue;

import java.util.PriorityQueue;

public class InBuiltPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
	 	int arr[]= {9,1,4,7,3};
	 	for(int i=0;i<arr.length;i++) {
	 		pq.add(arr[i]);
	 	}
//	 	System.out.println(pq.element());//shows minimum element
	 	while(!pq.isEmpty()) {
	 		System.out.print(pq.remove()+" ");
	 	}
	}
}
