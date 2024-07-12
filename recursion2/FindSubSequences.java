package recursion2;

public class FindSubSequences {
public static String[] findSubsequences(String str){
		if(str.length() == 0){
			String ans[] = {""};
			System.out.println(ans.length);
			return ans;
		}
		
		String smallAns[] = findSubsequences(str.substring(1));
		String ans[] = new String[2 * smallAns.length];
		//System.out.println(smallAns.length);
		
		int k = 0;
		//copy all ans String
		for(int i = 0; i < smallAns.length; i++){
			ans[k] = smallAns[i];
			k++;
		}
		//System.out.println(k);
	//printing smallans array
		for(int i=0;i<ans.length;i++) {
			//System.out.print(ans[i]+" ");
		}
		//System.out.println();
		
		for(int i = 0; i < smallAns.length; i++){
			// ans[i + smallAns.length]
			ans[k] = str.charAt(0) + smallAns[i];
//			System.out.println(smallAns.length);
//			System.out.println(str.charAt(0));
			k++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		String str = "xyz";
		String ans[] = findSubsequences(str);
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}	
	}
}
