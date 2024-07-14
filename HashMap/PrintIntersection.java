package HashMap;
import java.util.HashMap;

import LinkedList.print;
public class PrintIntersection {
	public static void printIntersection(int[] arr1,int[] arr2){
	  if(arr1.length==0 || arr2.length==0)
            return ;
            HashMap<Integer,Integer> harr1=new HashMap<>();
            for(int i=0;i<arr1.length;i++) { 
				if(harr1.containsKey(arr1[i])){
                int value=harr1.get(arr1[i]);
                harr1.put(arr1[i],value+1);
                }
             else
                 harr1.put(arr1[i],1);
            }
            
            for(int i=0;i<arr2.length;i++)
            {
                if(harr1.containsKey(arr2[i])){
                    int frequency=harr1.get(arr2[i]);//it means ki arr2 me jo value hai uske corresponding harr1(map) me kitna value store hai
                    if(frequency>0){             //or  (freq!=0)
                    System.out.print(arr2[i]+" ");
                    harr1.put(arr2[i],frequency-1);//if equal value exist so we do
                    }
                }
                else
                    continue;
            }
        }
	public static void main(String[] args) {
		int arr1[]={1,4,5,2,2,3,6,5,3,2};
		int arr2[]= {0,2,3,2,6,6,5,1};
		
		printIntersection(arr1, arr2);
		}
	}
