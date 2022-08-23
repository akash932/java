package lectures.sortingAlgorithms;

public class FirstMissingPositiveLeetCode41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstMissingPositive(new int[] {7,8,9,11,12}));
	}
	
	public static int firstMissingPositive(int[] arr) {
        int i = 0; 
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])
            	swap(arr, i, correct);
            else {
				++ i;
			}
        }
        for(int j = 0; j < arr.length;  ++ j) {
        	if(arr[j] != j + 1)
        		return j + 1;
        }
        return arr.length + 1;
    }
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
