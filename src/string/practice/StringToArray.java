package string.practice;

public class StringToArray {
	public static void main(String[] args) {
		String str = "jai ganesh";
		char[] sa = str.toCharArray();
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
			Character.toString(sa[i]);
		}
	}
}
