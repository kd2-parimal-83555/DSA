
public class SinglylinaerList {
	class Node{
//		private Node prev;
		private Node next;
		private int data;
		public Node(int value) {
			this.data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	public SinglylinaerList() {
		head=tail=null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void addFirst(int data) {
		Node newnode =new Node(data);
		if(head==null) {
			tail=head=newnode;
		}
		else{
		Node trav=head;
		//head.next=newnode;
		newnode.next=trav;
		head=newnode;
		}
	}
	public void addLast(int data) {
		Node newnode =new Node(data);
		if(head==null) {
			tail=head=newnode;
		}
		else{
		tail.next=newnode;
		//newnode.prev=trav;
		tail=newnode;
		}
	}
	public void delFrist() {
		if(isEmpty())
			head=tail=null;
		else {
			head=head.next;
		}
	}
	public void delLast() {
		if(isEmpty())
			head=tail=null;
		else {
			Node trav=head;
			while(trav.next!=tail) {
				//System.out.println(trav.data);
				trav=trav.next;
			}
			trav.next=null;
			tail=trav;
			//System.out.println(trav.next);
		}
	}
	
	public void display() {
		Node trav=head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
	}
	
	
	
}
