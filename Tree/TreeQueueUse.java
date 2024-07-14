package Tree;
import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;
public class TreeQueueUse {
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();//Queue banaye hai
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNodes.dequeue();
				//System.out.println(frontNode.data);
				System.out.println("Enter num of children of "+frontNode.data);
				int numChild=s.nextInt();
				for(int i=0;i<numChild;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
					int child=s.nextInt();
					TreeNode<Integer> childNode=new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			}
			catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		
//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
	}
}
