package assignments.strings;

public class DecryptString {
	
	public static void main(String[] args) {
		System.out.println(freqAlphabets("10#11#12"));
	}
	
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            if(i + 2 < n && s.charAt(i + 2) == '#'){
                int num = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) (97 + num - 1));
                i += 3;
            }
            else{
                sb.append((char) (97 + Character.getNumericValue(s.charAt(i)) - 1));
                i+=1;
            }
            
        }
        return sb.toString();
    }
	
}
