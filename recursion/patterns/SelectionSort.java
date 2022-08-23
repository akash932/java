package lectures.recursion.patterns;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 4, 78, 95, 5, 6, 42, 22 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void selection(int[] arr) {
		sort(arr, arr.length, 0, 0);
	}
	
	static void sort(int[] arr, int r, int c, int max) {
		if(r == 0)
			return;
		
		
		if(c < r) {
			if(arr[c] > arr[max]) {
				max = c;
			}
			sort(arr, r, c + 1, max);
		}
		else {
			int temp = arr[max];
			arr[max] = arr[r - 1];
			arr[r - 1] = temp;
			sort(arr, r - 1, 0, 0);
		}
		
	}

}



