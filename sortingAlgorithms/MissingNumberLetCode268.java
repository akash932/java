package lectures.sortingAlgorithms;

public class MissingNumberLetCode268 {
	public static void main(String[] args) {
		int arr[] = {3, 0, 1, 2};
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i];
			if(arr[i] < arr.length && arr[i] != arr[correct])
				swap(arr, i, correct);
			else {
				++ i;
			}
		}
		for(int j = 0; j < arr.length; ++ j) {
			if(arr[j] != j) {
				return j;
			}
		}
		return arr.length;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
