
public class LinkedListRemove {

	static Node head;
	
	static  class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	int detectAndRemoveLoop(Node node)
	{
		Node slow=node,fast=node;
		
		while(slow !=null && fast !=null && fast.next !=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				removeloop(slow,node);
				return 1;
			}
		}
		return 0;
	}
	void removeloop(Node loop,Node curr)
	{
		Node ptr1=null,ptr2=null;
		ptr1=curr;
		while(1==1)
		{
			ptr2=loop;
			while(ptr2.next!=loop &&ptr2.next!=ptr1 )
			{
				ptr2=ptr2.next;
			}
			if(ptr2.next==ptr1)
			{
				break;
			}
			ptr1=ptr1.next;
		}
		ptr2.next=null;
	}
	void printList(Node node)
	{
		while(node !=null)
		{
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	public static void main(String args[])
	{
		LinkedListRemove list=new LinkedListRemove();
		
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=new Node(4);
		
		head.next.next.next.next=head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Enter the removing loop");
		list.printList(head);
	}
}