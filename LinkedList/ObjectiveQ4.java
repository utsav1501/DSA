package LinkedList;

import java.util.Scanner;

public class ObjectiveQ4 {
	public static Noode<Integer> takeInput(){
		Noode<Integer>head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Noode<Integer> newNode=new Noode<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void fun(Noode<Integer> start)
	{
	  if(start == null)
	    return;
	  System.out.print( start.data+" "); 

	  if(start.next != null )
	    fun(start.next.next);
	  System.out.print(start.data+" ");
	}
	public static void main(String[] args) {
		Noode<Integer>head=takeInput();
		fun(head);
	}

}
