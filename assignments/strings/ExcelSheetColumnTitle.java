package assignments.strings;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(28));

	}
	
	 public static String convertToTitle(int columnNumber) {
		 StringBuilder sb = new StringBuilder();
		 while(columnNumber-- > 0) {
			 
			 sb.append((char) (65 + columnNumber % 26));
			 columnNumber /= 26;
		 }
		 return sb.reverse().toString();
		 
	 }

}
