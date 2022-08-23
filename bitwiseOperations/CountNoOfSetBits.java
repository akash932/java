package lectures.bitwiseOperations;

public class CountNoOfSetBits {
	
	public static void main(String[] args) {
//		int n = 197898797;
//		System.out.println(Integer.toBinaryString(n));
//		System.out.println(setBitsA1(n));
//		System.out.println(setBitsA2(n));
//		System.out.println(setBitsA3(n));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toString(10,2));
		System.out.println(Integer.toString(10,8));
		System.out.println(Integer.toString(10,16));
		System.out.println(Integer.highestOneBit(10));
		System.out.println(Integer.lowestOneBit(10));
		
		
	}
	
	static int setBitsA1(int n) {
		int count = 0;
		while( n > 0) {
			if( (n & 1) == 1)
				count ++;
			n = n >> 1;
		}
		return count;
	}
	
	static int setBitsA2(int n) {
		int count = 0;
		while( n > 0) {
			count ++;
			n -= (n & -n);
		}
		return count;
	}
	
	static int setBitsA3(int n) {
		int count = 0;
		while( n > 0) {
			count ++;
			n = (n & (n - 1));
		}
		return count;
	}

}
