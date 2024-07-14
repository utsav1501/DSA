package HashMap;

import java.util.HashMap;

public class PairSumToZero {
	public static int pairSum(int[] input,int size) {
		if(size==0) {
			return 0;
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int key:input) {
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}
			else {
				map.put(key,1);
			}
		}
		int countPairs=0;
		for(Integer i:map.keySet()) {
			if(map.containsKey(-i)&& i!=0) {
				//System.out.println("value of -i ="+-i);
				countPairs=countPairs+(map.get(i)*map.get(-i));
				//System.out.println(map.get(i)*map.get(-i));
				//System.out.println("No of times = "+countPairs);
			}
		}
		//System.out.println(countPairs);
		countPairs=countPairs/2;//since countpairs updates over all value of array so it should be divided by 4
		if(map.containsKey(0)) {
			int val=map.get(0);
			countPairs=countPairs+(val*(val-1))/2;
		}
		return countPairs;
	}
	public static void main(String[] args) {
		int arr[]= {1,-1,2,-2};
		System.out.println(pairSum(arr,arr.length));
	}

}
