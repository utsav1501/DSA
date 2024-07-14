package DP1;

public class MinimumCountOfSquaresDP {
	public static int minCount(int n) {
		int storage[]=new int[n+1];
		if(n<=3) {
			return n;
		}
		storage[0]=0;
		storage[1]=1;
		storage[2]=2;
		storage[3]=3;
		for(int i=4;i<=n;i++) {
			int ans=i;
			for(int j=1;j<=Math.sqrt(i);j++) {
				ans =Math.min(ans, storage[i-j*j]+1);
			}
			storage[i]=ans;
		}
		return storage[n];

	}
	public static void main(String[] args) {
		int n=29;
		int ans=minCount(n);
		System.out.println(ans);
//		System.out.println(Math.sqrt(5));
	}
}
