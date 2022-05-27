package array;

public class sumofarray {

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int value : numbers) {
			sum = sum + value;
		}
		System.out.println("sum of all numbers:" + sum);
	}

}
