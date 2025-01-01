
public class Array2SmallesttNo {

	public static void main(String[] args) {

		int a[] = { 4, 5, 6, 7, 1, 2, 3 };
		int b;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					b = a[i];
					a[i] = a[j];
					a[j] = b;

				}
			}

		}
		System.out.println("Array Second smallest No: " + a[a.length - 2]);

	}
}
