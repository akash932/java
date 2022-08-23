package assignments.flowOfProgram;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		printTable(x);
		sc.close();
		
	}
	
	static void printTable(int x) {
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d X %d = %d \n", x, i, x*i);
			
		}
	}

}
