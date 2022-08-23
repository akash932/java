package lectures.bitwiseOperations;

public class XORtillNfrom0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xorTillN(12));
		System.out.println(xorBetweenAandB(3, 9));
	}
	
	static int xorTillN(int n) {
		
		if(n % 4 == 0)
			return n;
		if(n % 4 == 1)
			return 1;
		if(n % 4 == 2)
			return n + 1;
		if(n % 4 == 3)
			return 0;
		return -1;
	}
	
	static int xorBetweenAandB(int a, int b ){
		
		return xorTillN(b) ^ xorTillN(a - 1);
	}

}
