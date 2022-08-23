package lectures.recursion.permutations;

import java.util.ArrayList;
//import java.util.List;

public class PhonePadLeetCode17 {
	public static void main(String[] args) {
//		pad("", "12");
		System.out.println(pad("", "12", new ArrayList<>()));
		System.out.println(padRet("", "12"));
		System.out.println(padCount("", "12"));
	}
	
	static void pad(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		int digit = unprocessed.charAt(0) - '0';// return character as int i.e '1' as 1
		for(int i = (digit - 1) * 3; i < digit * 3; ++ i) {
			char ch = (char) ('a' + i);
			pad( processed + ch, unprocessed.substring(1));
		}
	}
	
	static ArrayList<String> pad(String processed, String unprocessed, ArrayList<String> list) {
		if(unprocessed.isEmpty()) {
			list.add(processed);
			return list;
		}
		int digit = unprocessed.charAt(0) - '0';// return character as int i.e '1' as 1
		for(int i = (digit - 1) * 3; i < digit * 3; ++ i) {
			char ch = (char) ('a' + i);
			pad( processed + ch, unprocessed.substring(1), list);
		}
		return list;
	}
	
	static ArrayList<String> padRet(String processed, String unprocessed) {
		ArrayList<String> list = new ArrayList<>();
		if(unprocessed.isEmpty()) {
			list.add(processed);
			return list;
		}
		int digit = unprocessed.charAt(0) - '0';// return character as int i.e '1' as 1
		for(int i = (digit - 1) * 3; i < digit * 3; ++ i) {
			char ch = (char) ('a' + i);
			list.addAll(padRet( processed + ch, unprocessed.substring(1)));
		}
		return list;
	}
	
	static int padCount(String processed, String unprocessed) {
		
		if(unprocessed.isEmpty()) {
			return 1;
		}
		int count = 0;
		int digit = unprocessed.charAt(0) - '0';// return character as int i.e '1' as 1
		for(int i = (digit - 1) * 3; i < digit * 3; ++ i) {
			char ch = (char) ('a' + i);
			count += padCount( processed + ch, unprocessed.substring(1));
		}
		return count;
	}
}
