package assignments.strings;

public class SortingTheSentence {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = "is2 sentence4 This1 a3";
			String[] str = s.split(" ");
			String[] arr = new String[str.length];
			for(int i = 0; i < str.length; ++i) {
				int a = Character.getNumericValue(str[i].charAt(str[i].length()-1));
				String abc = str[i].substring(0, str[i].length() - 1);
				arr[a - 1] = abc;
			}
			
		
			
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			
			System.out.println(sb.toString().trim());
			
			
		}
		
		
	}



