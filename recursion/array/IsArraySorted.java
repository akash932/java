package lectures.recursion.array;

public class IsArraySorted {

	public static void main(String[] args) {
		System.out.println(isArraySorted(new int[] {3, 4, 4, 5, 6, 7}, 0));

	}
	
	static boolean isArraySorted(int[] arr, int c) {
		if(c == arr.length - 1)
			return true;
		return arr[c] <= arr[c + 1] && isArraySorted(arr, c + 1);
	}

}
