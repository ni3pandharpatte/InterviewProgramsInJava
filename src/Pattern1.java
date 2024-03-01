
public class Pattern1 {
	public static void main(String[] args) {
		int counter = 0;
		int pre = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				pre = counter;
				System.out.print(++counter + "  ");
			}
			System.out.println("");
			counter = pre + counter - 1;
		}
	}
}
