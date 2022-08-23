package lectures.recursion;



public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(palindrome(1284821));
	}
	
	static boolean palindrome(int n) {
		return n == reverse(n);
	}
	
	static int reverse(int n) {
		if(n % 10 == n)
			return n;
		return Integer.parseInt((n % 10) + "" + reverse(n / 10));
	}

}
