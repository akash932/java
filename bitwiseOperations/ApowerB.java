package lectures.bitwiseOperations;

public class ApowerB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int power = 4;
		int ans = 1;
		
		while(power > 0) {
			if((power & 1) == 1)
				ans *= base;
			
			power = power >> 1;
			base *= base;
		}
		System.out.println(ans);
	}

}
