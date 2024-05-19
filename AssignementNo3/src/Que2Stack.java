
public class Que2Stack {
	private final int SIZE;
	private int top;
	private int arr[];
	private int max = 0;

	public Que2Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public void push(int value) {
		if (value > max) {
			max = value;
		}
		top++;
		arr[top] = value;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Satck is Empty!!");
		} else
			top--;
	}

	public void peek() {
		System.out.println(arr[top]);
		//
	}

	public void maximum() {
		if (isEmpty()) {
			System.out.println("Stack is Empty :");
		}
		else 
		System.out.println(max);
	}
}
