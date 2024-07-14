package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class MaximumFrequencyNumber {
	  public static int maxFrequencyNumber(int[] arr){
	        HashMap<Integer,Integer> h=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            if(h.containsKey(arr[i])){
	                h.put(arr[i],h.get(arr[i])+1);
	                //System.out.println("HI="+arr[i]+" "+h.get(arr[i])+1);
	               
	            }
	            
	            else {
	                h.put(arr[i],1);
	            }
	            
	            
	        }
	       
	        int max=0;
	        int maxKey=Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++) {
	            if(h.get(arr[i])>max){
	                max=h.get(arr[i]);
	                maxKey=arr[i];
	                }
	        }
	        return maxKey ;
	    }
	  public static void main(String[] args) {
		  int a[]= {1,3,2,2,2,2,4,1,2,2,1,10000,4,2,1,3};
			 System.out.println("Max occuring Character= "+maxFrequencyNumber(a));
	  }
	}
