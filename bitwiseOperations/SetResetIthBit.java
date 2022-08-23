package lectures.bitwiseOperations;

public class SetResetIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setIthBit(86, 5));
		System.out.println(resetIthBit(86, 5));
		
	}
	
	static int setIthBit(int n, int i) {
		return (n | (1 << (i - 1))); 
	}
	
	static int resetIthBit(int n , int i) {
		return (n & (~(1 << (i - 1))));
	}

}
