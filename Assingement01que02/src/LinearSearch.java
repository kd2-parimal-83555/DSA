import java.util.Scanner;

public class LinearSearch {
public static int linearSearch(int arr[],int size,int key) {
		
		for(int i = size-1;i>=0 ; i--) {
			if(key == arr[i])
				return i;
		}
		
	
		return -1 ;
	}
	public static void main(String[] args) {
		
int arr[] = {55,99,88,99,55,66,99,22,99,33};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter key to Search :");
		int key = sc.nextInt();
		
		int index =linearSearch(arr,arr.length,key);
		if(index != -1) 
			System.out.println("Key is found at index :"+ index);
		else
			System.out.println("key is not found");
	}
}
