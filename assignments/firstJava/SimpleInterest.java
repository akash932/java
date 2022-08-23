package assignments.firstJava;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		
		System.out.println("The simple interest is : " + simpleInterest(p, r, t));
		
		sc.close();
		
	}

	static double simpleInterest(double p, double r, double t) {
		return (p * r * t)/100;
	}
	
}
