package lectures.sortingAlgorithms;

//import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}
	

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                ++ i;
        }
        
//        System.out.println(Arrays.toString(nums));
        
        for(int j = 0; j < nums.length; ++ j){
            if(nums[j] != j + 1)
                return nums[j];
        }
        return -1;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	

}
