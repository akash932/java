package assignments.firstJava;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();
		System.out.println(evenOdd(num) ? "Even number" : "Odd Number.");
		
		sc.close();
	}
	
	static boolean evenOdd(int num) {
		return num%2 == 0;
	}
	
}
