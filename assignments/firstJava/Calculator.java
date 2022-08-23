package assignments.firstJava;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			System.out.println("The result of " + a + " "  + ch + " " + b + " is : " + calculator(ch, a, b));
			
		}
		else {
			System.out.println("Enter a valid sign!");
		}
		
		sc.close();
	}

	private static double calculator(char ch, double a, double b) {
		double result = 0;
		if(ch == '+')
			result = a + b;
		else if(ch == '-')
			result = a-b;
		else if(ch == '*')
			result = a * b;
		else 
			try {
				result = a / b;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return result;
	}

}
