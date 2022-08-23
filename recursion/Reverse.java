package lectures.recursion;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1842;
		
		
		System.out.println(reverse2(n));
		System.out.println(reverse(n));
	}
	
	static int reverse(int n) {
		if(n % 10 == n)
			return n;
		return Integer.parseInt((n % 10) + "" + reverse(n / 10)); 
		
	}
	
	
	static int reverse2(int n) {
		int l = (int) Math.log10(n) + 1;// it will give no of digits in n 
		return helper(n, l);
		
	}
	
	private static int helper(int n, int pow) {
		if(n % 10 == n)
			return n;
		return (int) ((n % 10) * Math.pow(10, pow - 1))+ helper(n / 10, -- pow); 
		
	}
}
