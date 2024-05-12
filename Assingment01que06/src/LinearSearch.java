import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[],int size,int key,int occarance) {
		int count = 0;
		for(int i = 0;i<size -1; i++) {
			if(key == arr[i])
				count++;
			if(count == occarance)
				return i;
		}
		return -1;
	}
	
	public static void main(String[]args) {
		
		int arr[] = {55,99,88,44,55,66,55,22,11,33};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter key to Search :");
		int key = sc.nextInt();
		System.out.println("Enter occarance : ");
		int occarance = sc.nextInt();
		int index =linearSearch(arr,arr.length,key,occarance);
		if(index != -1) 
			System.out.println("Key is found at index :"+ index);
		else
			System.out.println("key is not found");
		
	}
}
