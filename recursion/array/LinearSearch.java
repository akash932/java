package lectures.recursion.array;

import java.util.ArrayList;

public class LinearSearch {
	public static void main(String[] args) {
//		System.out.println(isPresent(new int[] {1, 2, 34, 4, 67, 98, 36, 12}, 12, 0));
//		System.out.println(find(new int[] {1, 2, 34, 4, 67, 98, 36, 12}, 2, 0));
//		System.out.println(findFromLast(new int[] {1, 2, 34, 4, 67, 98, 36, 12}, 2, 7));
//		findAllIndex(new int[] {1, 2, 4, 4, 67, 98, 36, 12}, 4, 0);
//		System.out.println(list1);
		System.out.println(findAllOccurrences(new int[] {1, 2, 4, 4, 67, 98, 4, 12}, 4, 0, new ArrayList<Integer>()));
		System.out.println(findAllIndex2(new int[] {1, 2, 4, 4, 67, 4, 4, 12}, 4, 0));
	}
	
	private static ArrayList<Integer> findAllIndex2(int[] arr, int target, int c) {
		ArrayList<Integer> list = new ArrayList<>();
		if(c == arr.length)
			return list;
		if(arr[c] == target)
			list.add(c);
		list.addAll(findAllIndex2(arr, target, c + 1));
		return list;
	}

	private static ArrayList<Integer> findAllOccurrences(int[] arr, int target, int c, ArrayList<Integer> list) {
		if(c == arr.length)
			return list;
		if(arr[c] == target)
			list.add(c);
		
		return findAllOccurrences(arr, target, c + 1, list);
		
	}

	static boolean isPresent(int[] arr, int target, int c) {
		if(c == arr.length)
			return false;
		
		return arr[c] == target || isPresent(arr, target, c + 1);
	}
	
	static int find(int[] arr, int target, int c) {
		if(c == arr.length)
			return -1;
		if(arr[c] == target)
			return c;
		
		return find(arr, target, c + 1);
	}
	
	
	static int findFromLast(int[] arr, int target, int c) {
		if(c == -1)
			return -1;
		if(arr[c] == target)
			return c;
		
		return findFromLast(arr, target, c - 1);
	}
	
	
	static ArrayList<Integer> list1 = new ArrayList<>();
	static void findAllIndex(int[] arr, int target, int c) {
		if(c == arr.length)
			return;
		if(arr[c] == target)
			list1.add(c);
		
		findAllIndex(arr, target, c + 1);
	}
	
	
}
