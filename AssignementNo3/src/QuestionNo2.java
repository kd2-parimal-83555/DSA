import java.util.Scanner;

public class QuestionNo2 {
    public void maximum() {
    	
    }
	public static void main(String[] args) {
		//Insert 5 elements in stack and find maximum value in stack without traversing it. 
		int max;
		Scanner sc=new Scanner(System.in);
		Que2Stack st=new Que2Stack(5);
		st.push(20);
		st.push(80);
		st.push(10);
		st.maximum();
	}

}
