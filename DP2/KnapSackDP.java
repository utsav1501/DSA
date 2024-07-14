package DP2;

public class KnapSackDP {
	public static int knapSack(int W,int val[],int wt[]) {
		int n=val.length;
		int [][]dp=new int[n+1][W+1];
		
		for(int i=n-1;i>=0;i--) {
			for(int  w=0;w<=W;w++) {
				int ans=0;
				if(wt[i]<=w) {
					int ans1=val[i]+dp[i+1][w-wt[i]];
					int ans2=dp[i+1][w];
					ans=Math.max(ans1, ans2);
				}
				else {
					ans=dp[i+1][w];
				}
				dp[i][w]=ans;
			}
		}
		return dp[0][W];
	}
	public static void main(String[] args) {
		int weights[]= {6,1,2,4,5};
		int values[]= {10,5,4,8,6};
		int maxWeight=5;
		System.out.println(knapSack(maxWeight, values, weights));
	}
}
