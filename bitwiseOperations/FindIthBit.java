package lectures.bitwiseOperations;

public class FindIthBit {
	public static void main(String[] args) {
		System.out.println(findIthBit(182, 6));
	}
	
	static int findIthBit(int n, int i) {
		if( (n & (1 << (i - 1))) == 0 )
			return 0;
		return 1;
	}
}
