package lectures.patterns;

public class Pattern8 {
	
	public static void main(String[] args) {
		pattern8(4);
	}
	
	static void pattern8(int n) {
		for(int row = 1; row <= 2 * n - 1; ++row) {
			int spaces = (row > n) ? row % n : n - row;
			int col = (row > n) ? 2 * n - row : row; 
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = col; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= col; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
