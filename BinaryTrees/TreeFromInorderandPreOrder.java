package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeFromInorderandPreOrder {
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

		return buildTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);//helper function
	}
	
	public static BinaryTreeNode<Integer> buildTree(int preOrder[],int preStart,int preEnd,int inOrder[],int inStart,int inEnd){
		if(preStart>inStart){
			return null;
		}
		int rootData=preOrder[preStart];
		BinaryTreeNode<Integer> root=new BinaryTreeNode(rootData);//root banaye

		int rootIndex=-1;
		for(int i=0;i<inEnd;i++){
			if(inOrder[i]==rootData){
				rootIndex=i;
				break;
			}
		}
		if(rootIndex==-1) {
			return null;
		}
		int leftInStart=inStart;
		int leftInEnd=rootIndex-1;
		int leftpreStart=preStart+1;
		int leftPreEnd=leftInEnd-leftInStart+leftpreStart;
		
		int rightInStart=rootIndex+1;
		int rightInEnd=inEnd;
		int rightPreStrt=leftPreEnd+1;
		int rightPreEnd=preEnd;
		
		root.left=buildTree(preOrder,leftpreStart,leftPreEnd,inOrder,leftInStart,leftInEnd);
		root.right=buildTree(preOrder,rightPreStrt,rightPreEnd,inOrder,rightInStart,rightInEnd);
		
		return root;
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
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
			else{
				System.out.print("L:-1");
			}         
           
           if (front.right!=null)
           {
               nodesToPrint.add(front.right);
               System.out.print(",R:"+front.right.data);
           }
			else{
				System.out.print(",R:-1");
			}
           System.out.println();
       }
	}
	
	public static void main(String[] args) {
		int in[]= {4,2,5,1,3,7};
		int pre[]= {1,2,4,5,3,7};
		BinaryTreeNode<Integer> root=buildTree(in,pre);
		printLevelWise(root);
		}
	}