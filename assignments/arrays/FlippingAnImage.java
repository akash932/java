package assignments.arrays;

import java.util.Arrays;

public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		for (int[] element : image) {
			reverse(element);
			flip(element);
		}
		for(int i = 0; i < image.length; ++i)
			System.out.println(Arrays.toString(image[i]));
	}
	
	public static int[] reverse(int[] arr) {
		int s = 0, e = arr.length-1;
		while(s<=e) {
			int temp = arr[s];
			arr[s++] = arr[e];
			arr[e--] = temp;
		}
		return arr;
	}
	
	public static int[] flip(int[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] == 0) {
				arr[i] = 1;
			}
			else {
				arr[i] = 0;
			}
		}
		return arr;
	}

}
