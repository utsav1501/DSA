package BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
	public static void PrintTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted=root.data+"";
		if(root.left!=null) {
			toBePrinted+="L:"+root.left.data+",";
		}
		if(root.right!=null) {
			toBePrinted+="R:"+root.right.data;
		}
		System.out.println(toBePrinted);
		PrintTree(root.left);
		PrintTree(root.right);
	}
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		int rootData;
		System.out.println("Enter root data");
		rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInput(s);
		PrintTree(root);
		s.close();
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
//		root.left=node1;
//		BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
//		root.right=node2; 
	}
}
