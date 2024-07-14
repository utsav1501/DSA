package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import LinkedList.print;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class problems {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if (root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();//poll means deque
            System.out.print(front.data+":");
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }          
            
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            System.out.println();
        }
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s=new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front=pendingNodes.dequeue();	
				}
		
		catch(QueueEmptyException e) {
			return null;
			}
			System.out.println("Enter left child of "+front.data);
			int leftChild=s.nextInt();
			if(leftChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter right child of "+front.data);
			int rightChild=s.nextInt();
			if(leftChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right=child;
			}
		}
		return root;
	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null){//base case not edge case
			return 0;
		}
		int ans=1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		return ans;
	}
	
	public static boolean ans=false;
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	   	if(root==null){//base case not edge case
			return ans ;
		}
		if(root.data==x){
			ans=true;
			return ans;
		}
		boolean leftTree= isNodePresent(root.left,x);
		 boolean rightTree=isNodePresent(root.right,x);
		return (leftTree||rightTree);
	}
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int largestLeft=largest(root.left);
		int largestright=largest(root.right);
		return Math.max(root.data,Math.max(largestLeft, largestright));
	}
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root,int x) {
	        if (root==null)
	        {
	            return 0;
	        }
	        
	        int smallOutput=countNodesGreaterThanX(root.left,x)+countNodesGreaterThanX(root.right,x);
	        if (root.data>x)
	        {
	        	//System.out.println("Smalloutput if root is big="+smallOutput);
	            return smallOutput+1;
	        }
	        else
	        {
	        	System.out.println("Smalloutput="+smallOutput);
	            return smallOutput;
	        }
		}
	
	public static int numofLeaf(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return numofLeaf(root.left)+numofLeaf(root.right);
	}
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root,int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left,k-1);
		printAtDepthK(root.right,k-1);
	}
	
	public static void solve(BinaryTreeNode<Integer> root,int level){
	    if(root==null){
	        return;
	    }
	    root.data=level;
	    solve(root.left,level+1); 
	    solve(root.right,level+1);
	   
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root)
	{
	    solve(root,0); 
}
	public static void printInorder(BinaryTreeNode<Integer> root) {
		if(root==null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right); 
	}
	
	public static boolean isNodePresent1(BinaryTreeNode<Integer> root, int x) {
		   if(root==null){
			   return false;
		   }
		   if(root.data==x){
			   return true;
		   }
		boolean leftTree= isNodePresent(root.left, x);
		boolean rightTree=isNodePresent(root.right, x);
		return (leftTree||rightTree);
		}

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
	    if (root==null)
    {
        return; 
    }
    
    if (root.left==null && root.right==null)
    {
        return;
    }
    
    if (root.left==null)
    {
        System.out.print(root.right.data+" ");
        printNodesWithoutSibling(root.right);
    }
    else if (root.right==null)
    {
        System.out.print(root.left.data+" ");
        printNodesWithoutSibling(root.left);
        
    }
    else
    {
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		  helper(root,k,"");
	    }
	
	public static void helper(BinaryTreeNode<Integer> root,int k,String s){
	    	System.out.println("s ="+s);
	        if(root==null)
	            return;
	        if(root.left==null && root.right==null && root.data==k)
	        {
	            System.out.println(s+root.data);
	            return;
	        }
	        s=s+root.data+" ";
	   
	        helper(root.left,k-root.data,s);
	        helper(root.right,k-root.data,s);
	        
	    }
	
	public static ArrayList<Integer> getRootNodeToPath(BinaryTreeNode<Integer> root,int data){
		if(root==null) {
			return null;
		}
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput=getRootNodeToPath(root.left, data);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput=getRootNodeToPath(root.right, data);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer>root=takeInputLevelWise();
		//System.out.println(root.data); ->10
		//printLevelWise(root);
		//System.out.println(countNodes(root));
		
//		System.out.println("Enter value of node to be checked");
//		int x=sc.nextInt();//checked number
//		System.out.println(isNodePresent(root,x));
		
		//System.out.println("Largest node= "+largest(root));
		
//		int x=sc.nextInt();
//		System.out.println(countNodesGreaterThanX(root,x));
		
		//System.out.println(numofLeaf(root));
		
//		int k=sc.nextInt();
//		printAtDepthK(root,k);
		
//		changeToDepthTree(root);
//		printInorder(root);
		
//		int k=sc.nextInt();
//		System.out.println(isNodePresent1(root,k));
		
		//printNodesWithoutSibling(root);
		//rootToLeafPathsSumToK(root, 13);
		
		System.out.println(getRootNodeToPath(root,2));
	}

}
