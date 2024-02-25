package array.practice;
import java.util.Arrays;

public class SortStringUsingArraysClass {
	public static void main(String[] args) {
		String[] sa = {"mahesh", "ganesh", "ravi", "nitin"};
		Arrays.sort(sa);
		for(String s : sa) {
			System.out.println(s);
		}
	}
}
