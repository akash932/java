package lectures.bitwiseOperations;

import java.util.Scanner;

public class NoOfDigitsInBaseRepresentaion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println(count(100, 10));
		System.out.println(Integer.toString(n, b).length());// to find length directly
		sc.close();
	}
	
	static int count(int n, int b) {
		return (int)(Math.log(n)/ Math.log(b)) + 1;
	}

}
