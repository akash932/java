package assignments.flowOfProgram;

import java.util.Scanner;

public class HCFandLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 , n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("The LCM and HCF of " + n1 + " and " + n2 + " is : " + lcm(n1, n2) + " and " + hcf(n1,n2) + " respectively. ");
		
		sc.close();
	}
	
	static int hcf(int a, int b) {
		if(a == b) return a;
		if(a == 0) return b;
		if(b == 0) return a;
		int hcf =0;
		
		for (int i = 1; i <=a || i <=b; i++) {
			if(a % i == 0 && b % i == 0)
				hcf = i;
		}
		return hcf;
	}
	
	static long lcm(int a, int b) {
		return ((long)a * b) / hcf(a, b);
	}

}
