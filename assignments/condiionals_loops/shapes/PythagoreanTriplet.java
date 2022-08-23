package assignments.condiionals_loops.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		int ar[] = { 3, 1, 4, 6, 5, 8, 10 };
		System.out.println(triplet(ar));
		System.out.println(triplet2(ar));
	}
	
	static ArrayList<ArrayList<Integer>> triplet(int[] arr) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					ArrayList<Integer> list = new ArrayList<>();
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];
					
					if(x == y + z || y == x + z || z == x + y) {
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						Collections.sort(list);
						ans.add(list);
						
					}
					
				}
			}
		}
		
		return ans;
	}
	
	static ArrayList<ArrayList<Integer>> triplet2(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 2; i--) {
			ArrayList<Integer> list = new ArrayList<>();
			int l = 0;
			int r = i - 1;
			while(l < r) {
				if(arr[l] + arr[r] == arr[i]) {
					list.add((int)Math.sqrt(arr[l]));
					list.add((int)Math.sqrt(arr[r]));
					list.add((int)Math.sqrt(arr[i]));
					ans.add(list);
				}
				
				if(arr[l] + arr[r] > arr[i])
					r --;
				else 
					l ++;
				
			}
				 
		}
		return ans;
	}
}
