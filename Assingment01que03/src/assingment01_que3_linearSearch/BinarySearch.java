package assingment01_que3_linearSearch;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int N, int key){
		int comp =0;
		int left = 0 , right = N-1, mid;
		while(left <= right) {
			comp ++;
			mid =(left + right )/2;
			if(key == arr[mid]) {
				
				System.out.println("Number of comparison :"+ comp);
				return mid ;
			}else if(key <= arr[mid])
				right = mid - 1;
			else 
				left = mid +1;
			
		}
		return -1;
	}
	public static void main (String[] args) {
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search : ");
		int key = sc.nextInt();
		int index = binarySearch(arr,arr.length,key);
		if(index != -1)
			System.out.println("key found at Index :"+ index);
		else
			System.out.println("key is not found");
		
	}
}
