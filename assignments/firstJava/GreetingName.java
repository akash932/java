package assignments.firstJava;

import java.util.Scanner;

public class GreetingName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		greetingName(str);
		
		sc.close();
	}
	
	static void greetingName(String name) {
		System.out.println("Welcome! " + name + ", Good Morning");
	}
	
}
