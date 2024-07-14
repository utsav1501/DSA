package PriorityQueue;
import java.util.*;//import all packages
public class KSmallElement {
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		int i=0;
		for(;i<k;i++){
			pq.add(input[i]);
		}
		for(;i<n;i++){//where n=inputLength
			int max=pq.element();
			if(max>input[i]){
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
		ArrayList<Integer> store=kSmallest(input.length,input,3);
		for(int i:store) {
			System.out.print(i+" ");
		}
	}
}
