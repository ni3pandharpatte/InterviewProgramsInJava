package practice;

public class Denomation {

	public static void main(String[] args) {
		int[] a = { 1, 5, 10, 20, 100, 500, 2000 };
		int amount = 1937;
		int count = 0;
		while (amount > 0) {
			for (int i = a.length-1; i  >= 0  ; i--) {
				if (amount >= a[i]) {
					System.out.println(a[i] + " x " + amount/a[i] );
					count = count + amount/a[i];
					amount = amount%a[i];
				}
			}
		}
		System.out.println(count);
	}

}
