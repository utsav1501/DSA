package recursion2;

public class checkAB {
	public static boolean checkAB(String input) {//aabb,abb
		//System.out.println(input.length());
	    
        if(input.length() == 0){
            return true;
        }
        
      if(input.charAt(0) == 'a'){//aabb,abb
          if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
        	  //System.out.println(input.substring(1).length());
              return checkAB(input.substring(3));//aabb
          }else{
               return checkAB(input.substring(1));//abb
          }
      }
        return false;
	}
	public static void main(String[] args) {
		String str="abbaabb";
		boolean ans=checkAB(str);
		System.out.println(ans);
	}

}
