package assignments.strings;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPalindrome("cjcjhoxgolccskkhxjzhhkdawonihhkffmdqvvsaehdzvrpkjlygflojqmyrjowcoeskgmjmzvnnbttmddngdptgfestestuwhmqnonntgsrryqwrrsmoaigubcqpeeuzogjdzpevtyrdpatoesrybpdyanheojxdvrdwmsxuidsmdpvfgbirimlkpykrcfhqdpmabgyuzbretlxlogyrkaibxuddotsrkcjryznypmesxjvbjfmrntggyjooackhsnycjqwlwytvdqmmdbohvjnmljyfxrpmxsfugnzrftvxgckobepplrgwaoubvwhzjzfzuvdgrnjrtvtigbwgjqldfzibfwhqqumqzioxuuwdywgnrwcgvisnaobzvdtyqwijjirefqkpodnaitnfrfjlcctxatvtwstgyzfpkwyuwnxobiwsmetbcfucpqkpdgnipynqgnzeclgqnzaqbjqnnnmoktvjtbawdhfnyuvrfdfofookjtgaldcjxrznixtarlrowbiuwillpiecoyyijgwxidtsjnvwyspdlbtfrlmddklhcvgaoakqnmxybotqlvtmazymyfedkwtmescpdtzqhqjmhawefbehzmbeypbhagiceriokxkfubroofgwmscjtojwuzmmzmzcgpaynrrspavdvyykzohcgpkoplbiwrjxjsohutswhmiobjpjhuavtuxllubqyqkgeqvqvjplqojqlsypiygjwwwfzywmorvqcnuzltwhrmvwlpcqfsluyjmuefqopoopwwtdwuizynteboqgxubilmuzgrbxbiwrslgnsetrskubqptmocnfktkdbfotubwczlgcvujihnawvfupwbunowcjxhndpvmehithtqkmaurpshxgkrqlzboskouryhawbuwowaorblnvodyvcayhleqsdsaegpaxelhejopjlxrhrxulfeamzvzlgpqbladorcxbvajixteorxjymr"));
		StringBuilder str = new StringBuilder("eeee");
		System.out.println(checkPalindrome(str));
	}
	
	
    public static boolean validPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        if(checkPalindrome(str))
            return true;
        
        for(int i = 0; i < str.length(); ++ i){
        	StringBuilder sb = new StringBuilder(str);
            if(checkPalindrome(sb.deleteCharAt(i)) )
                return true;
            
        }
        return false;
    }
    
    public static boolean checkPalindrome(StringBuilder str){
        
        return str.toString().equals(str.reverse().toString());
    }
	

}
