package HashMap;
import java.util.HashMap;
public class PairsWithDifferenceK {

	public static int getPairsWithDifferenceK(int arr[], int k) {
	  HashMap<Integer,Integer> map=new HashMap<>();
	  int count=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){

                map.put(arr[i],1);

            }else{
                int oldfreq=map.get(arr[i]);
                map.put(arr[i],oldfreq+1);

            }
        }
        if(k==0){
            for(int i=0;i<arr.length;i++){
                int freq=map.get(arr[i]);
                if(freq>1){
//                    for(int j=0;j<(freq*(freq-1))/2;j++){
//                        System.out.println(arr[i]+" "+arr[i]);
//
//                    }
                	count=count+(freq*(freq-1))/2;

                }
                map.put(arr[i],0);
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i]+k)){
                    int freq1=map.get(arr[i]);
                    int freq2=map.get(arr[i]+k);
//                    for(int j=0;j<freq1*freq2;j++){
//                        System.out.print(arr[i]+" ");
//                        System.out.println(arr[i]+k);
//
//                    }
                    count=count+freq1*freq2;
                   // System.out.println(count);

                }
                if(map.containsKey(arr[i]-k)){
                    int freq1=map.get(arr[i]);
                    int freq2=map.get(arr[i]-k);
                    count=count+freq1*freq2;
                    //System.out.println(count);
                }
                map.put(arr[i],0);//reduce the frequency to 0 because its

            } 
        }  
        return count;
    }
	public static void main(String[] args) {
		int arr[]= {5,1,2,4};
		System.out.println(getPairsWithDifferenceK(arr,3));
	}
}
