package lectures.recursion.strings;

public class SkipString {
	public static void main(String[] args) {
		skipString("", "bcdapplefg", "fg");
		System.out.println(skipString("bcdapplefg", "cdapple"));
		
	}
	
	static void skipString(String processed, String unprocessed, String skip) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		if(unprocessed.startsWith(skip)) {
			skipString(processed, unprocessed.substring(skip.length()), skip);
		}
		else {
			processed += unprocessed.charAt(0);
			skipString(processed, unprocessed.substring(1), skip);
			
		}
	}
	
	static String skipString(String str, String skip) {
		if(str.isEmpty()) {
			return "";
		}
		
		if(str.startsWith(skip)) {
			return skipString(str.substring(skip.length()), skip);
		}
		else {
			
			return str.charAt(0) + skipString(str.substring(1), skip);
			
		}
	}

}
