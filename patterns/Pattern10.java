package lectures.patterns;

public class Pattern10 {
	public static void main(String[] args) {
	pattern10(4);
	}
	
	static void pattern10(int n) {
		for(int row = 0; row < 2 * n - 1; ++ row) {
			for (int col = 0; col < 2 * n - 1; col++) {
				int arr = n - Math.min(Math.min(row, col), Math.min(2 * n - 2 - row, 2 * n - 2 - col));
				System.out.print(arr + " ");
			}
			System.out.println();
		}
	}
}
