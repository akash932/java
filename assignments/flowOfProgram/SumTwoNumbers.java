package assignments.flowOfProgram;

import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		int c = Integer.MAX_VALUE;
		int d = Integer.MAX_VALUE;
		
		
		
//		System.out.printf("The sum of %d and %d is : %d", a, b, sumTwoNumbers(a, b));
		System.out.printf("The sum of %d and %d is : %d", c, d, sumTwoNumbers(c, d));
		
//		System.out.println((long)(2147483647)+(long)(2147483647));
		
		sc.close();
		
	}
	
	static long sumTwoNumbers(int a, int b) {
		return ((long)a+b);
	}

}
