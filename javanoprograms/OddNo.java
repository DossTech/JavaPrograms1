package org.javanoprograms;

public class OddNo {
	public static void main(String[] args) {

		System.out.println("The ODD nos from 1 to 100: "+" ");
		for (int i = 1; i <=100; i++) {

			if (i%2!=0) {
				System.out.println(i+" ");
			} else {
				continue;
			}

		}
	}
}
