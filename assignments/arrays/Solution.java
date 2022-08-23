package assignments.arrays;

//import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		int[] gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));
	}
	
	public static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        int sum = 0;
        int max = 0;
        for(int i = 1; i < alt.length; ++i){
            sum += gain[i-1];
            alt[i] += sum;
            if(alt[i] > max)
            	max = alt[i];
        }
        return max;
    }
}