package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class RemoveLeafNodes {
	public static BalanceTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height=0;
			boolean isBal=true;
			BalanceTreeReturn ans=new BalanceTreeReturn();
			ans.height=height;
			ans.isBalanced=isBal;
			return ans;//return two things at a time
		}
		
		BalanceTreeReturn leftoutput=isBalancedBetter(root.left);
		BalanceTreeReturn rightOutput=isBalancedBetter(root.right);
		boolean isBal=true;
		int height=1+Math.max(leftoutput.height,rightOutput.height);
		
		if(Math.abs(leftoutput.height-rightOutput.height)>1) {
			isBal=false;
		}
		if(!leftoutput.isBalanced || !rightOutput.isBalanced) {
			isBal=false;
		}
		BalanceTreeReturn ans=new BalanceTreeReturn();
		ans.height=height;
		ans.isBalanced=isBal;
		return ans;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		//System.out.println(root.data);
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return 1+Math.max(leftHeight, rightHeight);
		
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root)
	{
		if(root==null) {
			return true;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		if(Math.abs(leftHeight-rightHeight)>1) {
			return false;
		}
		else {
			return true;
		}
//		boolean isleftBalanced=isBalanced(root.left);
//		boolean isrightBalanced=isBalanced(root.right);
//		
//		return isleftBalanced && isrightBalanced;
	}
	

	 public static void printTreeDetailed(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data+":");
	        if(root.left != null){
	            System.out.print("L"+root.left.data+", ");
	            }
	        if(root.right != null){
	            System.out.print("R"+root.right.data);
	            }
	        printTreeDetailed(root.left);
	        printTreeDetailed(root.right);

	    }
	
public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of"+ parentData);
            }
        }
       // System.out.println("Enter root data");
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
        return root;

    }
	
	public static BinaryTreeNode<Integer> removeleaf(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		root.left=removeleaf(root.left);
		root.right=removeleaf(root.right);
		return root;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        //printTreeDetailed(root);
//		BinaryTreeNode<Integer> newRoot=removeleaf(root);
		//printLevelWise(newRoot);
		//System.out.println("isBalanced = "+(isBalanced(root)));
        
        System.out.println("isBalanced "+isBalancedBetter(root).isBalanced);
	} 

}
