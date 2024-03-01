package string.practice;

public class VowelsSubString {

	public static void main(String[] args) {
		// Find out the vowels substring of a given length
		//Example: length: 3 input: waarortuoeaio - output: uoe
		//Example: length: 2 input: waarortuoeaio - output: aa
		String str = "waarortuoeaio";
		int count = 0, max = 0;
		String vs = "", maxvs = "";
		int sub = 2;
		for (int i = 0; i <= str.length() - sub; i++) {
			count = 0;
			vs = "";
			for (int j = i; j < sub + i; j++) {
				char ch = str.charAt(j);
				if ("aeiou".indexOf(ch) != -1) {
					count = count + 1;
					vs = vs.concat(Character.toString(ch));
				}
			}
			if (max < count) {
				max = count;
				maxvs = vs;
			}
		}
		System.out.println(maxvs+" "+max);
	}

}
