package string.practice;

//Arrays.asList(arr)
//ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split(" ")));
//Collections.sort(list);

import java.util.Arrays;
import java.util.*;

public class SortStringUsingArrayList {
	public static void main(String[] args) {
		String str = "this is jai ganesh";
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split(" ")));
		Collections.sort(list);
		for(String s: list) {
			System.out.println(s);
		}
	}
}
