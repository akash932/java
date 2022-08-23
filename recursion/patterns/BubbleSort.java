package lectures.recursion.patterns;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 4, 78, 95, 5, 6, 42, 22 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void bubble(int[] arr) {
		sort(arr, arr.length - 1, 0);
	}
	
	static void sort(int[] arr, int r, int c) {
		if(r == 0)
			return;
		
		if(c < r) {
			if(arr[c] > arr[c + 1]) {
				int temp = arr[c];
				arr[c] = arr[c + 1];
				arr[c + 1] = temp;
			}
			sort(arr, r, c + 1);
		}
		else {
			sort(arr, r - 1, 0);
		}
	}

}
