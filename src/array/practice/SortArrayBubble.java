package array.practice;

import java.util.Arrays;

public class SortArrayBubble {
	public static void main(String[] args) {
		int arr[] = {3,1,6,4,8,9,2,7};
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		}
		Arrays.sort(arr);
		for(int value : arr) {
			System.out.println(value);
		}
	}

}
