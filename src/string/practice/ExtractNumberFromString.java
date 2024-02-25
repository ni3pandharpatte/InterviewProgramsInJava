package string.practice;

//str.replaceAll("[^0-9]", "")
//Character.isDigit(ch)

public class ExtractNumberFromString {
	public static void main(String[] args) {
		String str = "Jai Ganesh 121";
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		char ch;
		String digits = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digits = digits +ch;
				
			}
		}
		System.out.println(digits);
	}
}
