package BinaryTrees;

import java.util.Scanner;

public class DiameterOptimal {
	public static DiameterOptimalPair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
		if(root==null) {
			DiameterOptimalPair<Integer,Integer> output=new DiameterOptimalPair<>();
			output.first=0;
			output.second=0;
			return output;
		}
		DiameterOptimalPair<Integer,Integer> lo=heightDiameter(root.left);//lo->left output
		DiameterOptimalPair<Integer, Integer> ro=heightDiameter(root.right);//ro->right output
		int height=1+Math.max(lo.first,ro.first);
		int option1=lo.first+ro.first;
		int option2=lo.second;//Diameter
		int option3=ro.second;//Diameter
		int diameter=Math.max(option1,Math.max(option2, option3));
		DiameterOptimalPair<Integer,Integer> output=new DiameterOptimalPair<>();
		output.first=height;
		output.second=diameter;
		return output;
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeTreeInputBetter(true, 0, true);
		System.out.println("diameter :"+heightDiameter(root).second);
		System.out.println("height: "+heightDiameter(root).first);
	}

}
