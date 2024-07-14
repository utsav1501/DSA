package Tree;
import java.util.*;

import BinaryTrees.BinaryTreeNode;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class PrintLevelWise {
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
//            else
//            {
//                System.out.print("L:");
//            }
            
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
//            else
//            {
//                System.out.print(",R:");
//            }
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer>root=takeInputLevelWise();
		//System.out.println(root.data); ->10
		printLevelWise(root);
	}

}
