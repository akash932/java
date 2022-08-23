package lectures.recursion.permutations;

import java.util.ArrayList;
//import java.util.List;

public class DiceRollsAmazon {
	public static void main(String[] args) {
		diceRolls("", 4);
		System.out.println(dice("", 4));
	}
	
	static void diceRolls(String s, int i) {
		if(i == 0) {
			System.out.println(s);
			return;
		}
		
		for(int j = 1; j <= 6 && j <= i; ++ j) {
			diceRolls(s + j, i - j);
		}
	}
	
	static ArrayList<String> dice(String s, int i) {
		ArrayList<String> list = new ArrayList<>();
		if(i == 0) {
			list.add(s);
			return list;
		}
		
		for(int j = 1; j <= 6 && j <= i; ++ j) {
			list.addAll(dice(s + j, i - j));
		}
		return list;
	}
}
