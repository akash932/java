package assignments.firstJava;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		System.out.println("The largest of two numbers is : " + largestNumber(a, b));
		
		sc.close();
	}
	
	static double largestNumber(double a, double b) {
		return a > b ? a : b;
	}
}
