import java.util.Scanner;

public class BinarySearch {

	public static int binarysearch(int arr[],int size, int key) {
		
		int left = 0, right = size-1, mid;
		while(left <= right) {
			mid = (left + right)/2;
			if(key == arr[mid]) {
				return mid;
			}else if (key <= arr[mid])
				right = mid -1;
			else
				left = mid +1;
		}
		return -1;
	}
	public static void main (String[] args) {
		int arr[]= {22,88,44,66,99,33,55,11,77};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key to Search :");
		int key = sc.nextInt();
		int index = binarysearch(arr,arr.length,key);
		if(index != -1)
			System.out.println("key found at index :"+ index);
		else 
			System.out.println("key is not found");
	}
}
