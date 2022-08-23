package lectures.recursion.patterns;

public class Triangle {
	public static void main(String[] args) {
		triangle(4);
	}

	static void reverseTriangle(int n) {
		printReverseTriangle(n, 0);
	}
	
	static void triangle(int n) {
//		printTriangle(0, 0, n);
		printTriangle2(n, 0);
	}
	
	static void printTriangle(int r, int c, int n) {
		if(r == n)
			return;
		
		if(c <= r) {
			System.out.print("* ");
			printTriangle(r, c + 1, n);
		}
		else {
			System.out.println();
			printTriangle(r + 1, 0, n);
		}
		
	}

	static void printReverseTriangle(int n, int i) {
		if(n == 0)
			return;
		
		if(i < n) {
			System.out.print("* ");
			printReverseTriangle(n, i + 1);
		}
		else {
			System.out.println();
			printReverseTriangle(n - 1, 0);
		}
		
	}
	
	static void printTriangle2(int r, int c) {
		if(r == 0)
			return;
		
		if(c < r) {
			printTriangle2(r, c + 1);
			System.out.print("* ");
		}
		else {
			printTriangle2(r - 1, 0);
			System.out.println();
		}
		
	}

}
