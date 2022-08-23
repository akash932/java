package lectures.recursion.strings;

public class SkipCharacter {

	public static void main(String[] args) {
		System.out.println(skipCharacter("baccdah"));

	}
	
	static void skipCharacter(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		char ch = unprocessed.charAt(0);
		if (ch == 'a') {
			skipCharacter(processed, unprocessed.substring(1));
		}
		else {
			processed += ch;
			skipCharacter(processed, unprocessed.substring(1));
		}
	}
	
	static String skipCharacter(String str) {
		if(str.isEmpty()) 
			return "";
		
		char ch = str.charAt(0);
		if(ch == 'a') {
			return skipCharacter(str.substring(1));
		}
		else {
			
			return ch + skipCharacter(str.substring(1));
		}
		
	}

}
