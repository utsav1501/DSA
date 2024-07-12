package recursion2;

public class CheckPermutation {
	public static String[] permutationOfString(String input){
		  if(input.length() == 0){
          String y[] = {""};
          //System.out.println(y.length);
          return y;
      }
      
      String [] ans = permutationOfString(input.substring(1));
    //  char ch = input.charAt(0);
		String output[] = new String[ans.length*input.length()];
      
      int k=0;
      for(int i=0;i<ans.length;i++){
          
          for(int j=0;j<=ans[i].length();j++){
              output[k++] = ans[i].substring(0,j) + input.charAt(0) + ans[i].substring(j);
              //System.out.println("hi");
          }
      }
      //System.out.println(output[0]);
      return output;// Write your code here
		
	}

	public static void main(String[] args) {
		String str="abc";
		String[] ans=permutationOfString(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
