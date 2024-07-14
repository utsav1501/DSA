package return_Double_from_function;
import java.util.Scanner;
public class ReverseRecursive {
	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newnode=new Node<Integer>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		if(head==null || head.next==null) {
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode smallans=reverseLLBetter(head.next);
		smallans.tail.next=head;//we suppose ki return me 4 3 2 aaya hai so 2 ke next me head yani ki 1 dal do
		head.next=null;//last node ke next me null dal diye
		
		DoubleNode ans=new DoubleNode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;//hum head aur tail dono return kr rhe hai according to return type of fxn so we make ans
	}
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		DoubleNode ans=reverseLLBetter(head);
		print(ans.head);
	}
}
