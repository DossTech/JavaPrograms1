package JavaPrograms.TestQS;

import java.util.Scanner;

public class StringRemoveSp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String s1 = s.nextLine();

		String re = s1.replace(" ", "");
		System.out.println(re);
	}
}
