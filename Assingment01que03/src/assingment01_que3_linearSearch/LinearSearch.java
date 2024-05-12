package assingment01_que3_linearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[],int size,int key){
		int comp = 0;
		for(int i = 0; i< size; i++) {
			comp ++;
			if(key == arr[i]) {
				System.out.println("Number of comparison :"+ comp);
				return i;
			}
				
		}
		return -1;
		
	}
	
	public static void main(String[]args ) {
		
		int arr[] = {22,33,66,55,44,11};
		int comp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search :");
		int key  = sc.nextInt();
		int index = linearSearch(arr,arr.length,key);
		if(index != -1)
		System.out.println("key is found at Index :"+ index);
		else
			System.out.println("key is not found");
			
	}
}
