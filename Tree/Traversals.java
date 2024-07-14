package Tree;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class Traversals {
	public static void preOrder(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		//System.out.println("PostOrder Calling....");
		if(root==null) {
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data+" ");
		//return;
	}
	
public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s=new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}
	
public static void printLevelWise(TreeNode<Integer> root){
		if(root==null){
          return;
        }
        QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();//we made queue
        TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
//        System.out.println(Integer.MIN_VALUE); ->2147483648
//        System.out.println(Integer.MAX_VALUE); ->2147483647
        q.enqueue(root);
        q.enqueue(nullNode);
       // System.out.println(q.size()); ->2
        System.out.println(root.data);
        while(q.size()!=1){
            TreeNode<Integer> temp = null;
            try{
                temp = q.dequeue();//->10
                //System.out.println("temp data= "+temp.data);
                
            } catch (QueueEmptyException e){
                
            }
            if(temp==nullNode){
                q.enqueue(nullNode);
                System.out.println();
                continue;
            }
            for(int i = 0; i<temp.children.size();i++){
                System.out.print(temp.children.get(i).data+" ");//20 30 40
                //System.out.println(temp.children.get(i).data+" Hi");
                q.enqueue(temp.children.get(i));//nullNode 20 30 40  , 30 40 nullNode 40 50  
            }
        }
	}
	
public static void main(String[] args) {
		TreeNode<Integer>root=takeInputLevelWise();
		//printLevelWise(root);
		//preOrder(root);
		//System.out.println();
		postOrder(root);
	}

}
