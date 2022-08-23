package lectures.recursion.array;



public class RotatedBinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
		System.out.println(rotatedBinarysearch(arr, 4, 0, arr.length - 1));
	}
	
	static int rotatedBinarysearch(int[] arr, int target, int start, int end) {
		if(start > end)
			return -1;
		
		int mid = start + ( end - start) / 2;
		
		if(arr[mid] == target)
			return mid;
		
		if(arr[mid] >= arr[start]) {
			if(target >= arr[start] && target <= arr[mid])
				return rotatedBinarysearch(arr, target, start, mid - 1);
			else
				return rotatedBinarysearch(arr, target, mid + 1, end);
		}
		
		if(target >= arr[mid] && target <= arr[end])
			return rotatedBinarysearch(arr, target, mid + 1, end);
		else
			return rotatedBinarysearch(arr, target, start, mid - 1);
	}

}
