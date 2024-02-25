package string.practice;

public class GetSumOfDigitsFormGivenString {

	public static void main(String[] args) {
		String name = "ni3t4i7n";  // sum = 3 + 4 + 7
		String strNum = name.replaceAll("[^0-9]", "");
		System.out.println(strNum);
		int sum = 0; 
        for(int i=0 ; i<strNum.length();i++){
        	char ch = strNum.charAt(i);
            sum = sum + Integer.parseInt(Character.toString(ch));
        }
        System.out.println(sum);
	}

}
