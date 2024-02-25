package array.practice;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,17,4,5,25,7,16,13};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(isPerfect(arr[i])) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j] && !isPerfect(arr[j])) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static boolean isPerfect(int number) {
		int sqrt = (int) Math.sqrt(number);
		return sqrt * sqrt == number;
	}
	

}
