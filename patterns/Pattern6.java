package lectures.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		pattern6(5);
	}
	
	static void pattern6(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int col = (i > n) ? (2 * n) % i : i;//no. of columns in a row
			int spaces = (i > n) ? i % n : n - i;// no of spaces in a row;
			
			for (int j = 1; j <= spaces; j++) {
				
				System.out.print(" ");
			}
			
			for (int j = 1; j <= col; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
