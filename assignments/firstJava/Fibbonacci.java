package assignments.firstJava;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c;
		int i=2;
		
		int n = sc.nextInt();
		
		System.out.print(a + ", ");
		System.out.print(b);
		
		while(i <= n) {
			c = a + b;
			System.out.print(", " + c  );
			a = b; 
			b = c;
			i++;
		}
		sc.close();

	}

}
