//we want ki Ans integer ki range se bhar n aaye so we create this program
package DP1;
public class BalanceBTs2 {
	public static int countBalanceBTs(int h) {
		int mod=(int)Math.pow(10,9)+7;
		return countBalanceBTs(h, mod);
	}
	public static int countBalanceBTs(int h,int mod) {
		if(h==0 || h==1) {
			return 1;
		}
		
		int x=countBalanceBTs(h-1,mod);
		int y=countBalanceBTs(h-2,mod);
//		int value1=(x*x)%mod;
//		int value2=(2*x*y)%mod; 
		
		long res1=(long)x*x;//when we multiply int and int the result comes is int
		long res2=(long)x*y*2;//when we multiply long and int the result comes is long
		int value1=(int)(res1%mod);
		int value2=(int)(res2%mod); 
		
		return (value1+value2)%mod;
	}
	public static void main(String[] args) {
		int h=7;
		long ans=countBalanceBTs(h);
		System.out.println(ans);
	}
}
   