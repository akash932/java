package lectures.recursion.subSequence;

import java.util.ArrayList;

public class AllSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsequence("", "abc", new ArrayList<String>()));
		System.out.println(subseq("", "abc"));

	}
	
	static void subsequence(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		subsequence(processed + unprocessed.charAt(0), unprocessed.substring(1));
		subsequence(processed, unprocessed.substring(1));
	}
	
	static ArrayList<String> subsequence(String processed, String unprocessed, ArrayList<String> list) {
		if(unprocessed.isEmpty()) {
			if(processed.isEmpty())
				return list;
			list.add(processed);
			return list;
		}
		
		subsequence(processed + unprocessed.charAt(0), unprocessed.substring(1), list);
		subsequence(processed, unprocessed.substring(1), list);
		return list;
	}
	
	static ArrayList<String> subseq(String processed, String unprocessed) {
		ArrayList<String> list = new ArrayList<>();
		if(unprocessed.isEmpty()) {
			if(processed.isEmpty())
				return list;
			list.add(processed);
			return list;
		}
		
		list.addAll(subseq(processed + unprocessed.charAt(0), unprocessed.substring(1)));
		list.addAll(subseq(processed, unprocessed.substring(1)));
		return list;
	}

}
