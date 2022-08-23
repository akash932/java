package lectures.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllDuplicatesLeetCode442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDuplicates(new int[] {1}));
	}
	
	public static List<Integer> findDuplicates(int[] arr) {
       List<Integer> list = new ArrayList<>();
       int i = 0;
       while(i < arr.length) {
    	   int correct = arr[i] - 1;
    	   if(arr[i] != arr[correct])
    		   swap(arr, i, correct);
    	   else 
    		   ++ i;
       }
       
       for(int j = 0; j < arr.length; ++ j) {
    	   if(arr[j] != j + 1)
    		   list.add(arr[j]);
       }
       Collections.reverse(list);
       return list;
    }
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
