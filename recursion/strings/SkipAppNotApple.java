package lectures.recursion.strings;

public class SkipAppNotApple {
	public static void main(String[] args) {
//		System.out.println(skip("bcdappfg"));
		skip("", "bcdapplefg");
	}
	static String skip(String str) {
		if(str.isEmpty())
			return "";
		if(str.startsWith("app") && !str.startsWith("apple"))
			return skip(str.substring(3));
		else {
			return str.charAt(0) + skip(str.substring(1));
		}
	}
	
	static void skip(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple"))
			skip(processed, unprocessed.substring(3));
		else {
			processed += unprocessed.charAt(0);
			skip(processed, unprocessed.substring(1));
		}
	}
}
