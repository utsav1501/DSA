package BinaryTrees;

//import BST2.BinaryTreeNode;

public class BSTClass {
private boolean hasDataHelper(int data,BinaryTreeNode<Integer> root) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(data>root.data) {
			return hasDataHelper(data, root.right);
		}
		else {
			return hasDataHelper(data, root.left);
		}
	}
	
	public boolean hasData(int data) {
		BinaryTreeNode<Integer> root = null;
		return hasDataHelper(data,root);
	}
}
