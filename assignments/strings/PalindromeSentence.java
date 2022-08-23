package assignments.strings;

public class PalindromeSentence {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
		System.out.println((int) '{');
	}
	
	
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); ++ i){
            if((int)(s.charAt(i)) >=  97 && (int)(s.charAt(i)) <=  122 || (int)(s.charAt(i)) >=  48 && (int)(s.charAt(i)) <=  57)
                str.append(s.charAt(i));
        }
        System.out.println(str.toString());
        System.out.println(str.reverse().toString());
        return str.toString().equals(str.reverse().toString());
    }
	

}
