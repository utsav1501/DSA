package Tree;

import java.util.Scanner;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class FindNumberOfNodes {
	public static int numNodes(TreeNode<Integer> root) {
		if (root == null) {//This is not base Case this is edge case
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			//System.out.println("Count for "+(i+1)+"th child of "+root.data);
			count=count+numNodes(root.children.get(i));
			//System.out.println("c= "+count);
		}
		//System.out.println("Count= "+count);
		return count;
	}
	
	public static int getHeight(TreeNode<Integer> root){
		 int temp=0;int Height=0;
		if (root == null) {
			return 0;
		} 
		for (int i = 0; i < root.children.size(); i++) {
			//System.out.println("Calling for "+root.data+" ka "+(i+1)+"th element");
			temp=getHeight(root.children.get(i));
			//System.out.println("Temp= "+temp+" Height= "+Height);
			if(temp>Height){
				//
				Height=temp;
				//System.out.println("Temp= "+temp+" Height= "+Height);
			}
		}
		//System.out.println("Height= "+Height);
		System.out.print(root.data+" ");
		return Height+1;	
	}

public static int LargestNode(TreeNode<Integer> root) {
	if (root == null) {//This is not base Case this is edge case
		return 0;
	}
	int ans=root.data;
	//System.out.println("data= "+ans);
	for (int i = 0; i < root.children.size(); i++) {
		int childLargest=LargestNode(root.children.get(i));
		if(childLargest>ans) {
			//System.out.println("ans= "+ans);
			ans=childLargest;
			//System.out.println("ChildLargest = "+childLargest);
		}
	}
	//System.out.println("Count= "+count);
	return ans;
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
	
	public static void main(String[] args) {
		TreeNode<Integer>root=takeInputLevelWise();
		//System.out.println(root.data); ->10
		//printLevelWise(root);
//		System.out.println("No of Nodes = "+numNodes(root));
//		System.out.println("LargestNodes= "+LargestNode(root));
		System.out.println("Height ="+getHeight(root));
	}
}
