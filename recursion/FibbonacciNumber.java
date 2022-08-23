package lectures.recursion;

public class FibbonacciNumber {
	public static void main(String[] args) {
		System.out.println(nFibbonacci(6));
	}
	
	static int nFibbonacci(int n) {
		
		if(n < 2)
			return n;
		
		return nFibbonacci(n - 1) + nFibbonacci(n - 2);
	}

}
