package lectures.recursion.patterns;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 5, 94, 625,6253,5334,534,2534, 8977, -6237 };
		
		
//		arr = mergeSort(arr);// for every function calls new objects(Arrays) are being created. original
								// array is not being modified therefore storing the new array in original
								// object
		System.out.println(Arrays.toString(mergeSortInPlace(arr, 0, arr.length - 1)));
	}

	static int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));// returns a new array between given index range of arr
 		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);
	}
	
	static int[] mergeSortInPlace(int[] arr, int start, int end) {
		int mid = start + (end - start) / 2;
		if(start < end) {
			
			mergeSortInPlace(arr, start, mid);
			mergeSortInPlace(arr, mid + 1, end);
			
		

		}
		return mergeInPlace(arr, start, mid, end);

		
	}

	private static int[] mergeInPlace(int[] arr, int start, int mid, int end) {
		int[] temp = new int[arr.length];
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		
		int i = start, k = start;
		int j = mid + 1;
		
		while(i <= mid && j <= end) {
			if(temp[i] < temp[j]) {
				arr[k++] = temp[i++];
			}
			else {
				arr[k++] = temp[j++];
			}
		}
		while(i <= mid) arr[k++] = temp[i++];
		while(j <= end) arr[k++] = temp[j++];
		
		return arr;
	}

	private static int[] merge(int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		int[] arr = new int[left.length + right.length];

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		// it may be possible that one of the arrays is not complete
		// therefore copying the rest elements
		while (i < left.length) {
			arr[k++] = left[i++];

		}

		while (j < right.length) {
			arr[k++] = right[j++];

		}

		return arr;
	} 

}
