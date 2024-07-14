package HashMap;
import java.util.HashMap;
public class AseHi {
	public static void practise(int arr[]) {
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
                System.out.println("HI="+arr[i]+" "+h.get(arr[i])+1);
               
            }
            
            else {
                h.put(arr[i],1);
            }
            
            
        }
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,1,3,3};
		practise(arr);
	}
}
