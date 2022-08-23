package assignments.firstJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Long> list = new ArrayList<>();
		
		long n1 = sc.nextLong(), n2 = sc.nextLong();
		
		for(long i = n1; i <= n2; i++) {
			if(isArmstrong(i))
				list.add(i);
		}
		
		System.out.println(list);
		
		sc.close();
	}

	static boolean isArmstrong(long n) {
		int count = 0;
		long temp = n, temp2 = n;
		while(temp > 0) {
			count++;
			temp/=10;
		}
		int sum = 0;
		while(n > 0) {
			long rem = n % 10;
			sum += Math.pow(rem, count);
			n /=10;
		}
		
		return sum == temp2;
	}
	
}
