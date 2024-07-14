package BinaryTrees;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;
import Tree.TreeNode;

public class TakeInputLevelWise {
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

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		PrintTree(root);

	}

}
