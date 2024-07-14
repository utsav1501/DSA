package Tree;
import java.util.Scanner;

public class TreeUse {
	public static TreeNode<Integer> takeInput(Scanner sc){
		//int n;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter next Node data");
		int n=sc.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter Number of Children for " +n);
		int childCount=sc.nextInt();//No of children for the given root
		//System.out.println("Childcount= "+childCount);ye kiye kyo ki steps pta karna tha
		for(int i=0;i<childCount;i++) {
			//System.out.println("No of times loop executed "+(i+1));
			TreeNode<Integer> child=takeInput(sc);
			root.children.add(child);
			//System.out.println("wapas chalo");//ye kiye kyo ki steps pta karna tha
		}
		//System.out.println("Wapas chalo ke bad yaha pahuche?");//ye kiye kyo ki steps pta karna tha
		//System.out.println(root.data);//ye kiye kyo ki hme pta krna tha ki return value kya ja rhi hai
		return root;
	}
	public static void printTree(TreeNode<Integer> root){
		String s=root.data+":";
		//System.out.println(root.children.size());
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer> root=takeInput(sc);//it returns integer type object
		//System.out.println("In main "+root.data);
		printTree(root);
		
		
		
		
		
//	TreeNode<Integer> n1=new TreeNode<Integer>(5);
//	TreeNode<Integer> n2=new TreeNode<Integer>(2);
//	TreeNode<Integer> n3=new TreeNode<Integer>(9);
//	TreeNode<Integer> n4=new TreeNode<Integer>(8);
//	TreeNode<Integer> n5=new TreeNode<Integer>(7);
//	TreeNode<Integer> n6=new TreeNode<Integer>(15);
//	TreeNode<Integer> n7=new TreeNode<Integer>(1);
//	
//	//add children for node 5;
//	n1.children.add(n2);
//	n1.children.add(n3);
//	n1.children.add(n4);
//	n1.children.add(n5);
//	//add children for node 9
//	n3.children.add(n6);
//	n3.children.add(n7);
	}
}
