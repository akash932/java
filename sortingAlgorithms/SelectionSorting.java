package lectures.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 7, -32, 89};
		System.out.println(Arrays.toString(arr));
		selection(arr);
		System.out.println(Arrays.toString(arr)) ;
	}
	
	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for(int i = start; i <= end; ++ i) {
			if(arr[i] > arr[max]) 
				max = i;
		}
		return max;
	}
	
	static void swap(int[] arr, int last,int max) {
		int temp = arr[last];
		arr[last] = arr[max];
		arr[max] = temp;
	}
	
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// find the max item in the remaining array and swap with the correct index
			int last = arr.length - i - 1;
			int max = getMaxIndex(arr, 0, last);
			swap(arr,last, max);
		}
	}

}
