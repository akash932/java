package assignments.arrays;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

	public static void main(String[] args) {
		int num[] = {0}, k = 23;
//		System.out.println(num.length);
		System.out.println(addToArrayForm(num, k));
//		System.out.println(56 >> 1);

	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int l = num.length - 1;
        int i = l;
        int c = 0;
        while(k > 0 || i >= 0) {
        	int r = k % 10;
        	int element;
        	if(i < 0) {
        		element = 0;
        	}
        	else
        		element = num[i--];
        	int sum = r + element + c;
        	list.add(0, sum % 10);
        	c = sum / 10;
        	k /= 10;
        }
        if(c != 0)
        	list.add(0, c);
        
        
        
        
        return list;
    }
}
