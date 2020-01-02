
public class CountList {
	class Node
	{
		int data;
		Node previous;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node head,tail=null;
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			head.previous=null;
			head.next=null;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	public int countNodes()
	{
		int counter=0;
		Node current=head;
		while(current!=null)
		{
			counter++;
			current=current.next;
		}
		return counter;
	}

	 public void display()
	 {
		 Node current=head;
		 if(head==null)
		 {
			 System.out.println("List is empty");
			 return;
		 }
		 System.out.println("Nodes of double linked list");
		 while(current!=null)
		 {
			 System.out.println(current.data+"");
			 current=current.next;
		 }
	 }
	 public static void main(String args[])
	 {
		 CountList dlist=new CountList();
		 dlist.addNode(1);
		 dlist.addNode(2);
		 dlist.addNode(3);
		 dlist.addNode(4);
		 dlist.addNode(5);
		 dlist.addNode(0);
		 
		 dlist.display();
		 System.out.println("\nCount of nodes present in the list: " + dlist.countNodes());
	 }
}
