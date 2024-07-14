package LinkedList;
import java.util.Scanner;

public class InsertNode {
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
	public static Noode<Integer> insert(Noode<Integer> head,int data,int pos) {
		Noode<Integer> newNode=new Noode<Integer>(data);
		if(pos==0) {
			newNode.next=head;
			//head=newNode;
			return newNode;//is time pe head newNode hi hoga
		}
		int i=0;
		Noode<Integer> temp=head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		//yha tab ainge jab i sahi location pe pahunch gya hoga
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	public static void print(Noode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Noode<Integer> head=takeInput();
		head=insert(head,80,3);
		print(head);

	}

}
