package array;

class maxminnumber {
	static void min(int arr[]) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("small number:" + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("large number:" + max);
	}
}

public class largenumber {

	public static void main(String[] args) {
		int m[] = { 10, 55, 1, 59, 105 };
		maxminnumber.min(m);
		maxminnumber.max(m);

	}

}

