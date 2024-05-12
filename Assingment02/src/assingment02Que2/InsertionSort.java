package assingment02Que2;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[], int size) {
		
		for(int i = 1 ; i < size ; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]<temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
public static void main(String[] args) {
		
		int arr[] = {77,44,11,22,33,55,88,66,99};
		
		System.out.println("Before sorting "+ Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println("After sorting "+ Arrays.toString(arr));	
	
	

}
}
