import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[],int size) {
		int comp = 0;
		for(int i = 0 ; i< size - 1 ;i++) {
			for(int j= i+1; j< size; j++) {
				comp++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp ;
									}
			}
		}
		System.out.println("Number of comparison :"+comp);
	
	}
	
	public static void main(String[]args) {
		
		int arr[] = {88,55,66,22,33,11,77,44};
		
		System.out.println("Before sorting"+ Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("After sorting"+ Arrays.toString(arr));

	}

}
