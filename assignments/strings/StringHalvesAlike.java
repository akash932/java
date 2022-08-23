package assignments.strings;

public class StringHalvesAlike {

	public static void main(String[] args) {
		System.out.println(halvesAreAlike("book"));

	}
	
	public static boolean halvesAreAlike(String s) {
		s = s.toLowerCase();
		String s1 = s.substring(0, s.length()/2);
		String s2 = s.substring(s.length() / 2);
		
		int count1 = countVowels(s1);
		int count2 = countVowels(s2);
        return count1 == count2;
    }

	private static int countVowels(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				count++;
		}
		return count;
	}

}
