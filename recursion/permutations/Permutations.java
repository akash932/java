package lectures.recursion.permutations;

import java.util.ArrayList;

public class Permutations {
	 
	public static void main(String[] args) {
//		permutations("", "abc");
		System.out.println(permutationsCount("", "abc", 0));
	}
	
	static void permutations(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		char ch = unprocessed.charAt(0);
		for(int i = 0; i <= processed.length(); ++i) {
			String first = processed.substring(0, i);// i is exclusive here because in substring last index is exclusive
			String second = processed.substring(i, processed.length());// processed.length() index is exclusive here
			
			permutations(first + ch + second, unprocessed.substring(1));
		}
		
	}
	
	static ArrayList<String> permut(String processed, String unprocessed) {
		ArrayList<String> list = new ArrayList<>();//local to this call
		if(unprocessed.isEmpty()) {
			list.add(processed);
			return list;
		}
		
		char ch = unprocessed.charAt(0);
		for(int i = 0; i <= processed.length(); ++i) {
			String first = processed.substring(0, i);// i is exclusive here because in substring last index is exclusive
			String second = processed.substring(i, processed.length());// processed.length() index is exclusive here
			
			list.addAll(permut(first + ch + second, unprocessed.substring(1)));
		}
		return  list;
		
	}
	
	
	static int permutationsCount(String p, String up) {
		if(up.isEmpty())
			return 1;
		char ch = up.charAt(0);
		int count = 0;
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count += permutationsCount(f + ch + s, up.substring(1));
		}
		return count;
	}

	// not correct, Didn't found the answer
	 
	static int permutationsCount(String processed, String unprocessed,  int count) {
		
		if(unprocessed.isEmpty()) {
			
			return 1;
		}
		
		char ch = unprocessed.charAt(0);
//		int n = 0;
		for(int i = 0; i <= processed.length(); i++) {
			
			String first = processed.substring(0, i);// i is exclusive here because in substring last index is exclusive
			String second = processed.substring(i, processed.length());// processed.length() index is exclusive here
			
			count+=1;
			permutationsCount(first + ch + second, unprocessed.substring(1),count);
		}
		return count;
		
	}
	
	
	
}
