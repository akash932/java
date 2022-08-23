package assignments.strings;

public class EquivalentStrings {

	public static void main(String[] args) {
		String[] word1 = {"abc", "d", "defg"};
		String[] word2 ={"abcddefg"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = new String();
        String str2 = new String();
        
       
        
            for(int i = 0; i < word1.length; ++i){
               str +=  word1[i];
                
            }
            for(int i = 0; i < word2.length; ++i){
                
                 str2 += word2[i];
             }
        
        return str.equals(str2);
        
    }

}
