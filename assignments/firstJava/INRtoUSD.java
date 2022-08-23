package assignments.firstJava;

import java.util.Scanner;

public class INRtoUSD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double inr = sc.nextDouble();
		
		System.out.println("The amount in USD is : $" + inrToUsd(inr));
		
		sc.close();
	}
	
	static double inrToUsd(double inr) {
		return inr / 77.51; 
	}

}
