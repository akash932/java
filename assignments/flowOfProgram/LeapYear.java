package assignments.flowOfProgram;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(isLeap(year)?"Leap Year":"Not a leap year");
		sc.close();
	}
	
	static boolean isLeap(int year) {
		if(year%400 ==0)
			return true;
		if(year%100 ==0)
			return false;
		if(year%4==0){
			return true;
		}
		return false;
	}

}
