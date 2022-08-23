package lectures.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 7, -32, 89};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr)) ;

	}
	
	static void swap(int[] arr,  int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}
	
	public static void bubbleSort(int[] arr) {
		boolean swapped ; // to check if there was a swap or not for a particular value of i. if not, that means array is sorted and we dont need to check for next value of i therefore to break this loop swapped is use 
		for(int i = 0; i < arr.length; ++ i) {
			swapped = false;
			for(int j = 1; j < arr.length - i; ++ j) {
				if(arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
	}

}
