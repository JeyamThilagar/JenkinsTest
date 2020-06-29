package mock;

public class ArrayAddingNumberToGetCount {

	public static void main(String[] args) {
		int a[] = { 15, 25, 15, 30, 45, 25, 15, 15 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				sum = a[i];
				for (int k = j; k < a.length; k++) {
					sum += a[k];
					if (sum == 60) {
						System.out.println(sum);
						return;
					}
					if (sum > 60)
						break;
				}
			}
		}
	}
}
