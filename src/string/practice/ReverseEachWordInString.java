package string.practice;

import java.util.*;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "online Java Compiler and run your Java code online";
		String[] sa = str.split(" ");
		
		for (int i = 0; i < sa.length; i++) {
			StringBuilder sb = new StringBuilder(sa[i]);
			sa[i] = sb.reverse().toString();
		}

		for(String s : sa) {
			System.out.println(s);
		}
	}

}
