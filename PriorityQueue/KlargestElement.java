package PriorityQueue;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KlargestElement {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++){
			pq.add(input[i]);
		}
		for(;i<input.length;i++){
			int min=pq.element();
			if(min<input[i]){
				pq.remove();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> output=new ArrayList<>();
		while(!pq.isEmpty()){
			output.add(pq.remove());
		}
		return output;
	}
	public static void main(String[] args) {
		int input[]= {2,15,8,9,12,13,20};
		ArrayList<Integer> store=kLargest(input,3);
		for(int i:store) {
			System.out.print(i+" ");
		}
	}
}
