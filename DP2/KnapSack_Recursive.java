package DP2;

public class KnapSack_Recursive {
	public static int knapSack(int weights[],int values[],int maxWeight) {
		return knapSack(weights,values,maxWeight,0);
	}
	private static int knapSack(int weights[],int values[],int maxWeight,int i) {
		if(i==weights.length || maxWeight==0) {
			return 0;
		}
		if(weights[i]>maxWeight) {//skip karo
			return knapSack(weights,values,maxWeight,i+1);
		}
		else {
			//include this ith item
			int op1=values[i]+knapSack(weights,values,maxWeight-weights[i],i+1);
			
			//dont include
			int op2=knapSack(weights,values,maxWeight,i+1);
			return Math.max(op1,op2);
		}
	}
	public static void main(String[] args) {
		int weights[]= {6,1,2,4,5};
		int values[]= {10,5,4,8,6};
		int maxWeight=5;
		System.out.println(knapSack(weights, values, maxWeight));
	}
}
