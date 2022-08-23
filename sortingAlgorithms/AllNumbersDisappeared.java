package lectures.sortingAlgorithms;

import java.util.*;

public class AllNumbersDisappeared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
                swap(arr, i, correct);
            else 
                ++ i;
        }
        
        for(int j = 0; j < n; ++ j){
            if(arr[j] != j + 1)
                list.add(j + 1);
        }
        return list;
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	

}
