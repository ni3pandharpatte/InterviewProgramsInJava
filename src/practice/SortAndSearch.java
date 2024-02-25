package practice;

public class SortAndSearch {
	public static void main(String[] args) {
		SortAndSearch sortAndSearch = new SortAndSearch();
//		sortAndSearch.bubbleSort();
//		sortAndSearch.insertionSort();
		sortAndSearch.binerySearch();
	}

	public void bubbleSort() {
		int num[] = { 16, 5, 7, 2, 9, 8, 3 };
		int n = num.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - (i + 1); j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}

	public void insertionSort() {
		int num[] = { 12, 17, 13, 5, 6 };
		int n = num.length;

		for (int j = 1; j < n; j++) {
			int key = num[j];
			int i = j - 1;
			while ((i > -1) && (num[i] > key)) {
				num[i + 1] = num[i];
				i--;
			}
			num[i + 1] = key;
		}
		for (int value : num) {
			System.out.println(value);
		}

	}

	public void binerySearch() {
		SortAndSearch sortAndSearch = new SortAndSearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 40;
		int result = sortAndSearch.search(arr, x);
		if (result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at " + "index " + result);
	}

	public int search(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;
		int mid = 0;

		while (l <= r) {
			mid = l + (r - l) / 2; // important
			if (arr[mid] == x) {
				return mid;
			}
			if (x < arr[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
}
