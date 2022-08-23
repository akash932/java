package lectures.patterns;

public class Pattern7 {
	
	public static void main(String[] args) {
		pattern7(5);
	}
	
	static void pattern7(int n) {
		for(int row = 1; row <= n; ++row) {
			int spaces = n - row;
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = row; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
