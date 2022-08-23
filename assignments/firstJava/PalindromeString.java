package assignments.firstJava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toLowerCase();
//		System.out.println(reverse(str));
		
		System.out.println(isPalindrome(str) ? "Palindrome" : "Not a palindrome");
		
		sc.close();

	}

	private static boolean isPalindrome(String str) {
		String str1 = reverse(str);
		
		return str.equals(str1);
	
	}

	private static String reverse(String str) {
		String nstr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			nstr = ch + nstr;
		}
		
		return nstr;
	}

}
