package lectures.arraySubsets;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateSubsets {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
		List<List<Integer>> list = removeDuplicates(arr);
		for (List<Integer> ans : list)
			System.out.println(ans);
	}
	
	static List<List<Integer>> removeDuplicates(int[] arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		int start = 0;
		int end = 0;
		for(int i = 0; i < arr.length; ++i) {
			start = 0;
			if(i > 0 && arr[i] == arr[i - 1])// if duplicate is found & if i = 0 this condition may give arrayIndexoutOfBound therfore first condition is applied
				start = end + 1;
			end = outer.size() - 1;
			for (int j = start; j <= end; j++) {
				List<Integer> internal = new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}
}
