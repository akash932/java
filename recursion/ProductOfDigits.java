package lectures.recursion;

public class ProductOfDigits {
	public static void main(String[] args) {
		System.out.println(productOfDigits(3045555));
	}
	
	static long productOfDigits(int n) {
		if(n % 10 == n)
			return n;
		return n % 10 * productOfDigits(n/10);
	}
}

