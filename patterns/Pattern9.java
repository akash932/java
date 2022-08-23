package lectures.patterns;

public class Pattern9 {
	
	public static void main(String[] args) {
		pattern9(4);
	}
	
	static void pattern9(int n) {
		for (int i = 0; i < 2 * n + 1; i++) {
			for (int j = 0; j < 2 * n + 1; j++) {
				int arr = Math.min(Math.min(i, j), Math.min( 2 * n - i,  2 * n - j));
				System.out.print(arr + " ");
			}
			System.out.println();
		}
	}

}
