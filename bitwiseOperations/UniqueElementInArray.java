package lectures.bitwiseOperations;

public class UniqueElementInArray {
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 6, 4, 2, 3, 6};
		System.out.println(uniqueElement(arr));
	}
	
	static int uniqueElement(int[] arr) {
		int unique = 0;
		
		for(int n : arr)
			unique ^= n;
		
		return unique;
	}
}
