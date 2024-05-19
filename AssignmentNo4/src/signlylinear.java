
public class signlylinear {

	public static void main(String[] args) {
		SinglylinaerList list=new SinglylinaerList();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(60);
		list.delLast();
		list.display();
		System.out.println();
		list.delLast();
		list.display();
		

	}

}
