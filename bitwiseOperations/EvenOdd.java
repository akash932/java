package lectures.bitwiseOperations;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println(isOdd(16));
	}
	
	static boolean isOdd(int n) {
		return (n & 1) == 1;
	}
}
