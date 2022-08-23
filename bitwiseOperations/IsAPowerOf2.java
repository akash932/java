package lectures.bitwiseOperations;

public class IsAPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		boolean ans = (n & (n-1)) == 0;
		
		if(n == 0) // Exception for 0;
			System.out.println(false);
			
		
		else
			System.out.println(ans);

	}

}
