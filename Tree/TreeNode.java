/*****************************************************Tree_implementation_using_ArrayList********************************************************/
package Tree;
import java.util.ArrayList;
public class TreeNode<T>{
	public T data;
	public ArrayList<TreeNode<T>> children;//it means ki integer type ka node ka bcha integer type ka hi hoga
	
	public TreeNode(T data) {
		this.data=data;
		children=new ArrayList<>();
	}
}
