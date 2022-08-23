package assignments.flowOfProgram;

import java.util.Scanner;

public class SumUntilX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			sum += n;
		}
		System.out.println(sum);
		sc.close();
	}

}
