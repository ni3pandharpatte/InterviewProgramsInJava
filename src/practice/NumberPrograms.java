package practice;

import java.util.Iterator;

public class NumberPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrograms numberProgram = new NumberPrograms();
//		numberProgram.isPerfectNumber(28); // 28 = 1 + 2 + 4 + 7 + 14 = 28
		numberProgram.feboniciesSeries(10); // 0 1 1 2 3 5 8 13 21 34 ...
	}

	public void feboniciesSeries(int limit) {
		int num1 = 0;
		int num2 = 1;
		int next = 0;
		for (int i = 0; i < limit; i++) {
			System.out.println(num1);
			next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
	}

	public void isPerfectNumber(int number) {
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Does not Perfect Number");
		}
	}
}
