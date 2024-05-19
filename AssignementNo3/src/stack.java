import java.util.Arrays;

public class stack {
	private int top;
	private final int SIZE;
	private int arr[];
	public stack(int size) {
		SIZE=size;
		arr=new int[SIZE];
		top=SIZE;
	}
	public boolean isEmpty() {
		return top==SIZE;
	}
	public boolean isFull() {
		return top==0;
	}
	
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
		top--;
		arr[top]=value;
		//System.out.println(arr[top]);
		}
		
	}
	
	public void peek() {
		System.out.println(arr[top++]);
		//return top++;
	}
	public void pop() {
		if(isEmpty())
			System.out.println("stack is Full !!!");
		else
		top--;
	}
	public void dispaly() {
		//System.out.println(arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[0]+" ");
//		Arrays.toString(arr);
		for(int i=top;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
