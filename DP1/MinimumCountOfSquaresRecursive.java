package DP1;

public class MinimumCountOfSquaresRecursive {
	public static int minSquares(int n) {
		if(n==0) {
			return 0;
		}
		int minAns=Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currAns=minSquares(n-(i*i));
			if(minAns>currAns) {
				minAns=currAns;
			}
		}
		int myAns=1+minAns;
		return myAns;
	}
	public static void main(String[] args) {
		int n=7;
		System.out.println(minSquares(n));
	}
}
