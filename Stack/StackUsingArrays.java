package Stack;

public class StackUsingArrays {
	public int data[];
 	public int top;//is the index of topmost element of stack
 	public StackUsingArrays() {//it is not static bcz we want it to execute for every object
 		data=new int[3];
 		top=-1;
 }
 
	public StackUsingArrays(int capacity) {//this constructor is made for when we want our stack of some particular size
 		data=new int[capacity];
 		top=-1;
 	}
 	public boolean isEmpty() {
 		return (top==-1);
 		/*this line means 
 		 if(top==-1)
 			return true;
 		else 
 			return false
 		*/
 	}
 	public int size(){
 		return top+1;
 	}
 	public int top() throws StackEmptyException{
 		if(size()==0) {
 		  //throw stack empty exception
 			StackEmptyException e=new StackEmptyException();
 			throw e;
 		}	
 		return data[top];
 	}

 	public void push(int elem) throws StackFull{
 		if(size()==data.length) {
 			//Stack full
 			doubleCapacity();
 		}
 		top++;
 		data[top]=elem;
 	}
 	public void doubleCapacity() {
 		int temp[]=data;
 		data=new int[2*temp.length];
 		for(int i=0;i<=top;i++) {
 			data[i]=temp[i];
 		}
 	}
 	public int pop() {
 		int temp=data[top];
 		top--;
 		return temp;
 		
 		
 	}
}
