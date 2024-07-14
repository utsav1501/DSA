package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class BuyTheTicket {
	public static int buyTicket(int input[],int k){
//		int index[]=new int[input.length];
//		for(int i=0;i<input.length;i++){
//    	 index[i]=i;
//      }
//		for(int i=0;i<input.length;i++) {
//			
//		}
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<input.length;i++){
            pq.add(input[i]);
        }

        int ans = 0;
        while(!pq.isEmpty()){
            int x = pq.element();
            if(x == input[k]){
                break;
            }else{
                pq.remove();
                ans++;
            }
        }

        return ans + 1;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,2,2,4};
		System.out.println(buyTicket(arr,3));
	}
}
