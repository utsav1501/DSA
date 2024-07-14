package PriorityQueue;
//import java.util.*;//add all packages
import java.util.PriorityQueue;

public class KSortedArray {
	private static void sortKsorted(int[] arr, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++) {//i=3 enters here at starting
			arr[i-k]=pq.remove();//removal of peak element and inserting into  array
			//System.out.println(i);
			pq.add(arr[i]);
		}
		for(int j=arr.length-k;j<arr.length;j++) {//last wle element ko put kr rhe h
			arr[j]=pq.remove();
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,1,9,6,8};
		int k=3;
		sortKsorted(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
