package lectures.bitwiseOperations;

public class MagicNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		int ans = 0;
		int base = 5;
		while(n > 0) {
			int last = n & 1;
			ans += last * base;
			
			n = n >> 1;
			base *= 5;
		}
		System.out.println(ans);
	}

}
